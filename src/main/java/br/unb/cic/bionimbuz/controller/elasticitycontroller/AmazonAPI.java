package br.unb.cic.bionimbuz.controller.elasticitycontroller;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.auth.PropertiesCredentials;
import com.amazonaws.services.ec2.AmazonEC2;
import com.amazonaws.services.ec2.AmazonEC2Client;
import com.amazonaws.services.ec2.model.CreateTagsRequest;
import com.amazonaws.services.ec2.model.DescribeInstancesRequest;
import com.amazonaws.services.ec2.model.DescribeInstancesResult;
import com.amazonaws.services.ec2.model.KeyPair;
import com.amazonaws.services.ec2.model.Reservation;
import com.amazonaws.services.ec2.model.RunInstancesRequest;
import com.amazonaws.services.ec2.model.RunInstancesResult;
import com.amazonaws.services.ec2.model.Tag;
import com.amazonaws.services.ec2.model.TerminateInstancesRequest;

import br.unb.cic.bionimbuz.constants.SystemConstants;
import br.unb.cic.bionimbuz.persistence.dao.WorkflowLoggerDao;

public class AmazonAPI implements ProvidersAPI {

    public static AmazonEC2 EC2;
    public static Scanner user_input = new Scanner(System.in);
    public static String instanceid;
    public static KeyPair keyPair;
    public static int count = 1;
    private String ipInstance;
    private final WorkflowLoggerDao workflowLogger = null;

    @Override
    public void setup() {
        try {
            InputStream is = null;
            is = new FileInputStream(SystemConstants.FILE_CREDENTIALS_AMAZON);
            PropertiesCredentials credentials = new PropertiesCredentials(is);

            EC2 = new AmazonEC2Client(credentials);
            EC2.setEndpoint("ec2.sa-east-1.amazonaws.com");

        } catch (IOException ioe) {
            throw new RuntimeException(ioe);
        }//, IllegalArgumentException
    }
    /**
     * Method to create instance at amazon 
     * TODO: alterar o jeito de adicionar a imagem para criar a maquina
     * @param type
     * @param nameinstance
     * @throws IOException 
     */
    @Override
    public void createinstance(String type, String nameinstance) throws IOException {
        // Acho que tem que mudar isso aqui em    

        this.setup();

        try {

            // CREATE EC2 INSTANCES ami-912db2fd
            RunInstancesRequest runInstancesRequest = new RunInstancesRequest()
                    .withInstanceType(type)
                    .withImageId("ami-ef741383")
                    .withMinCount(1)
                    .withMaxCount(1)
                    .withSecurityGroupIds("default");
                    
            
            runInstancesRequest.setMonitoring(Boolean.TRUE);
            
            RunInstancesResult result = EC2.runInstances(runInstancesRequest);

            System.out.println("waiting");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            
            System.out.println("OK");

            List<com.amazonaws.services.ec2.model.Instance> resultInstance = result.getReservation().getInstances();

            String createdInstanceId = null;
            
            for (com.amazonaws.services.ec2.model.Instance ins : resultInstance) {

                createdInstanceId = ins.getInstanceId();
                
//                workflowLogger.log(new Log("New instance has been created:" + createdInstanceId, 0, "test", LogSeverity.INFO));
                
                System.out.println("New instance has been created: " + createdInstanceId);//print the instance ID
                CreateTagsRequest createTagsRequest = new CreateTagsRequest();
                createTagsRequest.withResources(createdInstanceId) //
                .withTags(new Tag("Name", nameinstance));
                EC2.createTags(createTagsRequest);

                DescribeInstancesRequest request = new DescribeInstancesRequest().withInstanceIds(ins.getInstanceId());
                DescribeInstancesResult result2 = EC2.describeInstances(request);
                List<Reservation> list = result2.getReservations();

                for (Reservation res : list) {
                    List<com.amazonaws.services.ec2.model.Instance> instanceList = res.getInstances();

                    for (com.amazonaws.services.ec2.model.Instance instance : instanceList) {

                        System.out.println("Instance Public IP :" + instance.getPublicIpAddress());
                        setIpInstance(instance.getPublicIpAddress());
                    }
                }
            }

        } catch (AmazonServiceException ase) {
            System.out.println("Caught Exception: " + ase.getMessage());
            System.out.println("Reponse Status Code: " + ase.getStatusCode());
            System.out.println("Error Code: " + ase.getErrorCode());
            System.out.println("Request ID: " + ase.getRequestId());
            System.out.println("Give a valid input");
            System.out.println("");
//		AmazonAPI.enteroption();
        }

    }

    public static List<com.amazonaws.services.ec2.model.Instance> listinstances() {
        AmazonAPI api = new AmazonAPI();
        api.setup();

        DescribeInstancesResult describeInstancesRequest = EC2.describeInstances();
        List<Reservation> reservations = describeInstancesRequest.getReservations();
        List<com.amazonaws.services.ec2.model.Instance> instances = new ArrayList<>();

        for (Reservation reservation : reservations) {
            instances.addAll(reservation.getInstances());
        }

        return instances;

    }

    public String getIpInstance() {
        return ipInstance;
    }

    public void setIpInstance(String ipInstance) {
        this.ipInstance = ipInstance;
    }

    @Override
    public void terminate(String instanceid)  {
        this.setup();
        TerminateInstancesRequest tir = new TerminateInstancesRequest()
                .withInstanceIds(instanceid);
        EC2.terminateInstances(tir);
        System.out.println("Terminating the instance : " + instanceid);
     
    }
} //main end
