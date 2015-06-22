package br.unb.cic.bionimbus.services.storage.bandwidth;

import br.unb.cic.bionimbus.services.storage.compress.CompressPolicy;

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;
import com.jcraft.jsch.SftpException;

public class BandwidthCalculator {
	
	public static final double DEFAULT_BANDWIDTH_VALUE = 15.0;
	
	private static JSch jsch = new JSch();
	private static final String USER = "zoonimbus";
	private static final String PASSW = "Zoonimbus1";
	private static final int PORT = 22;
	private static String path = "src/main/resources/bandwidth/2MBfile";
	
	public static double linkSpeed(String address){
		return linkSpeed(address, 0);
	}
	
	public static double linkSpeed(String address, double latency){
		String pathDest = "/home/zoonimbus/zoonimbusProject/data-folder/";
		Session session = null;
		
        try {

            session = jsch.getSession(USER, address, PORT);
            session.setConfig("StrictHostKeyChecking", "no");
            session.setPassword(PASSW);
            session.connect();
        } catch (JSchException e) {
            return DEFAULT_BANDWIDTH_VALUE;
        }
        Channel channel = null;
        long inicialTime = 0, finalTime = 0;
        try {
            channel = session.openChannel("sftp");
            channel.connect();
            ChannelSftp sftpChannel = (ChannelSftp) channel;
            
            inicialTime = System.currentTimeMillis();
            
                sftpChannel.put(path, pathDest);
            
                finalTime = System.currentTimeMillis();
                
                sftpChannel.rm(pathDest + "/2MBfile");
                sftpChannel.exit();
                session.disconnect();
                
            CompressPolicy.deleteIfCompressed(path);

        } catch (JSchException a) {
            return DEFAULT_BANDWIDTH_VALUE;
            
        } catch (SftpException e) {
        	return DEFAULT_BANDWIDTH_VALUE;
        	
		}
        //Why 2000, and not 2048? it's 2MB/time, but time is in MILIS.
		return (2000/(finalTime - inicialTime - latency) < 0) ? 2000/(finalTime - inicialTime) : 2000/(finalTime - inicialTime - latency);
	}

}
