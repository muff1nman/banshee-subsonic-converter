package com.andrewdemaria.util.Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Created by andrew on 1/31/14.
 */
public class HsqldbConnection extends JdbcConnection {

    private String location;

    public HsqldbConnection(String location) {
        this.location = location;
    }

	@Override
	public Connection initConnection() {
		try {
			Class.forName("org.hsqldb.jdbc.JDBCDriver");
			Connection conn;
			conn = DriverManager.getConnection("jdbc:hsqldb:" + location + ";user=sa;ifexists=true");
			conn.setAutoCommit(false);
			return conn;
		} catch (Exception e ) {
            e.printStackTrace();
			throw new SQLException( e.getMessage() );
		}
	}

}
