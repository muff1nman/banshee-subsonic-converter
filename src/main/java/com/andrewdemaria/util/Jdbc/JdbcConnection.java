package com.andrewdemaria.util.Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Created with IntelliJ IDEA.
 * User: andrew
 * Date: 1/30/14
 * Time: 9:10 PM
 */
public abstract class JdbcConnection {
	abstract public Connection initConnection(String location);

	public void finishConn(Connection conn) {
		try {
			conn.close();
		} catch ( Exception e) {
			throw new RuntimeException( "Could not close connection" );
		}
	}


}
