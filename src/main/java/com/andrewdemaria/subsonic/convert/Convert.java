package com.andrewdemaria.subsonic.convert;

import com.andrewdemaria.subsonic.convert.banshee.BansheeConverter;
import com.andrewdemaria.util.Jdbc.HsqldbConnection;
import com.andrewdemaria.util.Jdbc.SqliteConnection;

/**
 * Created with IntelliJ IDEA.
 * User: andrew
 * Date: 1/30/14
 * Time: 3:45 PM
 */
public class Convert {
	public static void main(String[] args) {
		System.out.println("Welcome to the subsonic library converter");
        System.out.println("converting");
        Converter converter = new BansheeConverter();
        converter.convert_database(
                new SqliteConnection("src/test/resources/banshee/banshee.db").initConnection(),
                new HsqldbConnection("/tmp/test/subsonic/subsonic").initConnection());

	}
}
