package com.impetus.dao;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
 
public class Connection {
	/*
	 * 
	 * Before Running this example we should start thrift server. To Start
	 * Thrift server we should run below command in terminal 
	 * hive --service hiveserver &
	 */
	private static String driverName = "org.apache.hive.jdbc.HiveDriver";
 
	public static void main(String[] args) throws SQLException {
		try {
			Class.forName(driverName);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.exit(1);
		}
 
		java.sql.Connection con = DriverManager.getConnection("jdbc:hive2://sandbox.hortonworks.com:2181/;serviceDiscoveryMode=zooKeeper;zooKeeperNamespace=hiveserver2", "root", "hadoop");
		Statement stmt = ((java.sql.Connection) con).createStatement();
 
		String sql = "select * from asd1" ;	
		ResultSet rs = stmt.executeQuery("use asd1");
		ResultSet res = stmt.executeQuery(sql);
		while (res.next()) {
			System.out.println(rs.getString(1) + rs.getString(2));
		}
		while (res.next()) {
			System.out.println(res.getString(1) + res.getString(2));
		}
 	    res.close();
		stmt.close();
		con.close();
	}
}