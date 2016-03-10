/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unb.cic.bionimbus.services.tarifation.Amazon;

import br.unb.cic.bionimbus.config.BioNimbusConfig;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author Gabriel Fritz Sluzala
 */
public class AmazonData {

    private Map<String, AmazonVirtualMachine> AmazonMachinesService;
    private Map<String, AmazonStorage> AmazonStorageService;
    private Map<String, AmazonDataTransfer> AmazonDataTransferService;

    public AmazonData(BioNimbusConfig config) {
//        this.config = new HashMap<>();
//        this.config.put("FilenameOD", "AmazonInstancesOD.txt");
//        this.config.put("FilenameStorage", "AmazonStorage.txt");
//        this.config.put("FilenameDataTransfer", "AmazonDataTransfer.txt");

        JSONArray pricingODArray = readJSONArray(config.getRootFolder()+"/conf/AmazonInstancesOD.txt");
        JSONArray pricingStorageArray = readJSONArray(config.getRootFolder()+"/conf/AmazonStorage.txt");
        JSONArray pricingDataTransferArray = readJSONArray(config.getRootFolder()+"/conf/AmazonDataTransfer.txt");
        
        this.createVirtualMachines(pricingODArray);
        this.createStorageInfo(pricingStorageArray);
        this.createDataTransferInfo(pricingDataTransferArray);
    }

    private JSONArray readJSONArray(String filename) {

        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }

            String everything = sb.toString();

            if (everything != null) {

                return (new JSONArray(everything));
            } else {

                return (null);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AmazonData.class.getName()).log(Level.SEVERE, null, ex);
        } catch (JSONException | IOException ex) {
            Logger.getLogger(AmazonData.class.getName()).log(Level.SEVERE, null, ex);
        }

        return (null);
    }

    private void createDataTransferInfo(JSONArray AmazonDataTransferArray) throws JSONException {
        for (int i = 0; i < AmazonDataTransferArray.length(); i++) {
            JSONObject obj = AmazonDataTransferArray.getJSONObject(i);
            AmazonDataTransfer adt = new AmazonDataTransfer(obj.getInt("id"), obj.getString("region"), obj.getString("kind"), obj.getString("tier"), obj.getDouble("price"), obj.getString("created_at"), obj.getString("updated_at"));
            this.getAmazonDataTransferService().put("" + obj.getInt("id"), adt);
        }
    }

    private void createVirtualMachines(JSONArray AmazonMachinesArray) throws JSONException {
        for (int i = 0; i < AmazonMachinesArray.length(); i++) {
            JSONObject obj = AmazonMachinesArray.getJSONObject(i);
            AmazonVirtualMachine avm = new AmazonVirtualMachine(obj.getString("pricing"), obj.getString("region"), obj.getInt("id"), obj.getString("os"), obj.getString("model"), obj.getDouble("upfront"), obj.getString("updated_at"), obj.getDouble("term"), obj.getString("created_at"), obj.getBoolean("latest"), obj.getDouble("hourly"), obj.getBoolean("ebsoptimized"));
            this.getAmazonMachinesService().put("" + obj.getInt("id"), avm);
        }
    }

    private void createStorageInfo(JSONArray AmazonStorageArray) throws JSONException {
        for (int i = 0; i < AmazonStorageArray.length(); i++) {
            JSONObject obj = AmazonStorageArray.getJSONObject(i);
            AmazonStorage as = new AmazonStorage(obj.getInt("id"), obj.getString("region"), obj.getString("kind"), obj.getDouble("price"), obj.getString("unit"), obj.getString("created_at"), obj.getString("updated_at"));
            this.getAmazonStorageService().put("" + obj.getInt("id"), as);
        }
    }

    /**
     *
     * @param id
     * @return
     */
    public boolean getVMStatus(int id) {
        String Id = "" + id;
        return this.getAmazonMachinesService().get(Id).status();
    }

    /**
     *
     * @param id - ID of Amazon VM.
     * @return - Price of AmazonVirtualMachine with this ID
     */
    public double getVMPrice(int id) {
        String Id = "" + id;
        return this.getAmazonMachinesService().get(Id).getHourly();
    }

    /**
     *
     * @param id - ID of Amazon VM.
     * @return - Region of Amazon VM.
     */
    public String getVMRegion(int id) {
        String Id = "" + id;
        return this.getAmazonMachinesService().get(Id).getRegion();
    }

    /**
     *
     * @param id - ID of Amazon VM.
     * @return - Pricing type of Amazon VM.
     */
    public String getVMPricingType(int id) {
        String Id = "" + id;
        return this.getAmazonMachinesService().get(Id).getPricing();
    }

    /**
     *
     * @param id - ID of Amazon VM.
     * @return - OS of Amazon VM.
     */
    public String getVMOs(int id) {
        String Id = "" + id;
        return this.getAmazonMachinesService().get(Id).getOs();
    }

    /**
     *
     * @param id - ID of Amazon VM.
     * @return - Model of Amazon VM.
     */
    public String getVMModel(int id) {
        String Id = "" + id;
        return this.getAmazonMachinesService().get(Id).getModel();
    }

    /**
     *
     * @param id - ID of Amazon VM.
     * @return - Upfront of Amazon VM.
     */
    public double getVMUpfront(int id) {
        String Id = "" + id;
        return this.getAmazonMachinesService().get(Id).getUpfront();
    }

    /**
     *
     * @param id - ID of Amazon VM.
     * @return - Date of info. update of Amazon VM.
     */
    public String getVMUpdatedAt(int id) {
        String Id = "" + id;
        return this.getAmazonMachinesService().get(Id).getUpdated_at();
    }

    /**
     *
     * @param id - ID of Amazon VM.
     * @return - Term of Amazon VM.
     */
    public double getVMTerm(int id) {
        String Id = "" + id;
        return this.getAmazonMachinesService().get(Id).getTerm();
    }

    /**
     *
     * @param id - ID of Amazon VM.
     * @return - Date of info. creation of Amazon VM.
     */
    public String getVMCreatedAt(int id) {
        String Id = "" + id;
        return this.getAmazonMachinesService().get(Id).getCreated_at();
    }

    /**
     *
     * @param id - ID of Amazon VM.
     * @return - If Amazon VM is latest.
     */
    public boolean isVMLatest(int id) {
        String Id = "" + id;
        return this.getAmazonMachinesService().get(Id).isLatest();
    }

    /**
     *
     * @param id - ID of Amazon VM.
     * @return - If Amazon VM is Ebsoptimized.
     */
    public boolean isVMEbsoptimized(int id) {
        String Id = "" + id;
        return this.getAmazonMachinesService().get(Id).isEbsoptimized();
    }

    /**
     *
     * @param id
     * @return
     */
    public boolean getStorageStatus(int id) {
        String Id = "" + id;
        return this.getAmazonStorageService().get(Id).status();
    }

    /**
     *
     * @param id - ID of Amazon Storage.
     * @return - Region of AmazonStorage with this ID.
     */
    public String getStorageRegion(int id) {
        String Id = "" + id;
        return this.getAmazonStorageService().get(Id).getRegion();
    }

    /**
     *
     * @param id - ID of Amazon Storage.
     * @return - Date of info. creation of AmazonStorage with this ID.
     */
    public String getStorageCreatedAt(int id) {
        String Id = "" + id;
        return this.getAmazonStorageService().get(Id).getCreatedAt();
    }

    /**
     *
     * @param id - ID of Amazon Storage.
     * @return - Kind of AmazonStorage with this ID.
     */
    public String getStorageKind(int id) {
        String Id = "" + id;
        return this.getAmazonStorageService().get(Id).getKind();
    }

    /**
     *
     * @param id - ID of Amazon Storage.
     * @return - Price unit of AmazonStorage with this ID.
     */
    public String getStoragePriceUnit(int id) {
        String Id = "" + id;
        return this.getAmazonStorageService().get(Id).getPriceUnit();
    }

    /**
     *
     * @param id - ID of Amazon Storage.
     * @return - Date of update of AmazonStorage with this ID.
     */
    public String getStorageUpdatedAt(int id) {
        String Id = "" + id;
        return this.getAmazonStorageService().get(Id).getUpdatedAt();
    }

    /**
     *
     * @param id - ID of Amazon Storage.
     * @return - Price of AmazonStorage with this ID.
     */
    public double getStoragePrice(int id) {
        String Id = "" + id;
        return this.getAmazonStorageService().get(Id).getPrice();
    }

    /**
     *
     * @param id
     * @return
     */
    public boolean getDataTransferStatus(int id) {
        String Id = "" + id;
        return this.getAmazonDataTransferService().get(Id).status();
    }

    /**
     *
     * @param id - ID of Amazon DataTransfer.
     * @return - Region of AmazonDataTransfer with this ID
     */
    public String getDataTransferRegion(int id) {
        String Id = "" + id;
        return this.getAmazonDataTransferService().get(Id).getRegion();
    }

    /**
     *
     * @param id - ID of Amazon DataTransfer.
     * @return - Tier of AmazonDataTransfer with this ID
     */
    public String getDataTransferTier(int id) {
        String Id = "" + id;
        return this.getAmazonDataTransferService().get(Id).getTier();
    }

    /**
     *
     * @param id - ID of Amazon DataTransfer.
     * @return - Date of update of AmazonDataTransfer with this ID
     */
    public String getDataTransferUpdateAt(int id) {
        String Id = "" + id;
        return this.getAmazonDataTransferService().get(Id).getUpdatedAt();
    }

    /**
     *
     * @param id - ID of Amazon DataTransfer.
     * @return - Date of info. creation of AmazonDataTransfer with this ID
     */
    public String getDataTransferCreatedAt(int id) {
        String Id = "" + id;
        return this.getAmazonDataTransferService().get(Id).getCreatedAt();
    }

    /**
     *
     * @param id - ID of Amazon DataTransfer.
     * @return - Kind of AmazonDataTransfer with this ID
     */
    public String getDataTransferKind(int id) {
        String Id = "" + id;
        return this.getAmazonDataTransferService().get(Id).getKind();
    }

    /**
     *
     * @param id - ID of Amazon DataTransfer
     * @return - Price of AmazonDataTransfer with this ID
     */
    public double getDataTransferPrice(int id) {
        String Id = "" + id;
        return this.getAmazonDataTransferService().get(Id).getPrice();
    }

    /**
     * @return the AmazonMachinesService
     */
    public Map<String, AmazonVirtualMachine> getAmazonMachinesService() {
        return AmazonMachinesService;
    }

    /**
     * @param AmazonMachinesService the AmazonMachinesService to set
     */
    public void setAmazonMachinesService(Map<String, AmazonVirtualMachine> AmazonMachinesService) {
        this.AmazonMachinesService = AmazonMachinesService;
    }

    /**
     * @return the AmazonStorageService
     */
    public Map<String, AmazonStorage> getAmazonStorageService() {
        return AmazonStorageService;
    }

    /**
     * @param AmazonStorageService the AmazonStorageService to set
     */
    public void setAmazonStorageService(Map<String, AmazonStorage> AmazonStorageService) {
        this.AmazonStorageService = AmazonStorageService;
    }

    /**
     * @return the AmazonDataTransferService
     */
    public Map<String, AmazonDataTransfer> getAmazonDataTransferService() {
        return AmazonDataTransferService;
    }

    /**
     * @param AmazonDataTransferService the AmazonDataTransferService to set
     */
    public void setAmazonDataTransferService(Map<String, AmazonDataTransfer> AmazonDataTransferService) {
        this.AmazonDataTransferService = AmazonDataTransferService;
    }
}
