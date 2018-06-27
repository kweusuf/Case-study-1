package com.impetus.dao;
import com.jcraft.jsch.*;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Connection1 {/*

	public static void main(String args[]) {
        String user = "root";
        String password = "hadoop";
        String host = "192.168.208.116";
        int port = 22;
        String remoteFile = "/root/archil/test.txt";

        try {
            JSch jsch = new JSch();
            Session session = jsch.getSession(user, host, port);
            java.util.Properties config = new java.util.Properties(); 
            config.put("StrictHostKeyChecking", "no");
            session.setConfig(config);
            session.setPassword(password);
            System.out.println("Establishing Connection...");
            session.connect();
            System.out.println("Connection established.");
            System.out.println("Creating SFTP Channel.");
            ChannelSftp sftpChannel = (ChannelSftp) session.openChannel("sftp");
            sftpChannel.connect();
            System.out.println("SFTP Channel created.");
            
            InputStream inputStream = sftpChannel.get(remoteFile);
            try (Scanner scanner = new Scanner(new InputStreamReader(inputStream))) {
                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    System.out.println(line);
                }
            }
        } catch (JSchException | SftpException e) {
            e.printStackTrace();
        }
        
        String user1 = "root";
        String password1 = "impetus@123";
        String host1 = "172.17.0.2";
        int port1 = 8022;
        String remoteFile1 = "/root/archil.txt";

        try {
            JSch jsch = new JSch();
            Session session1 = jsch.getSession(user1, host1, port1);
            java.util.Properties config = new java.util.Properties(); 
            config.put("StrictHostKeyChecking", "no");
            session1.setConfig(config);
            session1.setPassword(password1);
            System.out.println("Establishing Connection to 172.17.0.2");
            session1.connect();
            System.out.println("Connection established.");
            System.out.println("Creating SFTP Channel");
            ChannelSftp sftpChannel = (ChannelSftp) session1.openChannel("sftp");
            sftpChannel.connect();
            System.out.println("SFTP Channel created.");
            
            InputStream inputStream = sftpChannel.get(remoteFile1);
            try (Scanner scanner = new Scanner(new InputStreamReader(inputStream))) {
                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    System.out.println(line);
                }
            }
        } catch (JSchException | SftpException e) {
            e.printStackTrace();
        }
        
    }
*/}
