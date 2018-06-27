package com.impetus.service;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;

public class ConnectionService {
	
	public static boolean connection()
	{
	String user = "root";
	String password = "hadoop";
	String host = "192.168.208.116";
	int port = 22;
	String remoteFile = "/root/archil/test.txt";

	String username = "root";
	String password1 = "impetus@123";
	String hostname = "172.17.0.2";
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

		Channel channel = session.openChannel("shell");
		OutputStream ops = channel.getOutputStream();
		PrintStream ps = new PrintStream(ops, true);

		channel.connect();
		
	}
	catch(Exception e){
	}
	/*	ps.println("ssh " + hostname);
		Thread.currentThread();
		Thread.sleep(1000*2);
		ps.println(password1);
		Thread.sleep(1000*2);
		ps.println("hive");
		Thread.currentThread().sleep(1000*5);
		ps.println("show databases;");
//		Thread.currentThread();
		Thread.sleep(1000*4);
		ps.println("use default;");
//		Thread.sleep(1000*4);
		ps.println("show tables;");
		ps.close();
		InputStream in = channel.getInputStream();
		byte[] bt = new byte[1024];

		while (true) {

			while (in.available() > 0) {
				int i = in.read(bt, 0, 1024);
				if (i < 0)
					break;
				String str = new String(bt, 0, i);
				// displays the output of the command executed.
				System.out.print(str);

			}
			if (channel.isClosed()) {

				break;
			}
			Thread.sleep(1000);
//			ps.println("hive");

//			channel.disconnect();
//			session.disconnect();
		}

//		System.out.println("SFTP Channel created.");
		// if (session.startShell())
		// {
		// in = (session.getInputStream());
		// logCat.info(in);
		// out = session.getOutputStream();
		// out.write("cd opt/3com/vcx/vcxdata/\n".getBytes());
		// out.write("ls\n".getBytes());
		//
		// InputStream inputStream = sftpChannel.get(remoteFile);
		// try (Scanner scanner = new Scanner(new
		// InputStreamReader(inputStream))) {
		// while (scanner.hasNextLine()) {
		// String line = scanner.nextLine();
		// System.out.println(line);
		// }
		// }
	} catch (Exception e) {
	}
	// catch (JSchException | SftpException e)
	// {
	// e.printStackTrace();
	// }

	String remoteFile1 = "/root/archil.txt";
}*/
	return true;
}
}