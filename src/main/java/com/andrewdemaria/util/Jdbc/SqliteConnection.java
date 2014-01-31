package com.andrewdemaria.util.Jdbc;

import java.io.File;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Created with IntelliJ IDEA.
 * User: andrew
 * Date: 1/30/14
 * Time: 9:19 PM
 */
public class SqliteConnection extends JdbcConnection {

	@Override
	public Connection initConnection(String location) {
		try {
			Class.forName("org.sqlite.JDBC");
			Connection conn;
			conn = DriverManager.getConnection( "jdbc:sqlite:" + location);
			conn.setAutoCommit(false);
			return conn;
		} catch (Exception e ) {
			throw new SQLException( e.getMessage() );
		}
	}
}
