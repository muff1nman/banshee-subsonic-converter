package com.andrewdemaria.util.Jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

/**
 * Created with IntelliJ IDEA.
 * User: andrew
 * Date: 1/30/14
 * Time: 9:38 PM
 */
public class DisplayTable extends SQLFunction {
    public static String query = "SELECT * FROM albums";

	private String tableName;

	public DisplayTable( String tableName ) {
		this.tableName = tableName;
	}

	public void doSQL( Connection db, Integer id ) {
		try {
			String whereQuery = "SELECT * FROM " + tableName + " WHERE id = ?";
			PreparedStatement pstmt = null;
			pstmt = db.prepareStatement( whereQuery );
			pstmt.setInt( 1, id );
			ResultSet rs = pstmt.executeQuery();
			ResultSetMetaData md = rs.getMetaData();
			int numColumns = md.getColumnCount();

			System.out.println("Number of columns: " + numColumns );

			// Print column headers
			for( int i = 1; i <= numColumns; ++i ) {
				System.out.print( md.getColumnLabel(i) + "|");
			}
			System.out.println();

			// print rows
			while ( rs.next() ) {
				for( int i = 1; i <= numColumns; ++i ) {
					System.out.print(rs.getString(i) + "|");
				}
				System.out.println();
			}

			rs.close();
		} catch ( java.sql.SQLException e ) {
			throw new SQLException();
		}
	}
    public void doSQL( Connection db ) throws SQLException {
		try {
			PreparedStatement pstmt = db.prepareStatement( "SELECT * FROM " + tableName );
			ResultSet rs = pstmt.executeQuery();
			ResultSetMetaData md = rs.getMetaData();
			int numColumns = md.getColumnCount();

			System.out.println("Number of columns: " + numColumns );

			// Print column headers
			for( int i = 1; i <= numColumns; ++i ) {
				System.out.print( md.getColumnLabel(i) + "|");
			}
			System.out.println();

			// print rows
			while ( rs.next() ) {
				for( int i = 1; i <= numColumns; ++i ) {
					System.out.print(rs.getString(i) + "|");
				}
				System.out.println();
			}

			rs.close();
		} catch( java.sql.SQLException e ) {
			throw new SQLException();
		}
    }
}


