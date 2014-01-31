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

    private String location;

    public SqliteConnection(String location) {
        this.location = location;
    }

	@Override
	public Connection initConnection() {
		try {
			Class.forName("org.sqlite.JDBC");
			Connection conn;
			conn = DriverManager.getConnection( "jdbc:sqlite:" + location);
			conn.setAutoCommit(false);
			return conn;
		} catch (Exception e ) {
            e.printStackTrace();
			throw new SQLException( e.getMessage() );
		}
	}
}
