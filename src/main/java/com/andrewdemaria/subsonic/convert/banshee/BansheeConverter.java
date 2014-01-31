package com.andrewdemaria.subsonic.convert.banshee;

import com.andrewdemaria.subsonic.convert.Converter;
import com.andrewdemaria.util.Jdbc.DisplayTable;

import java.sql.Connection;

/**
 * Created with IntelliJ IDEA.
 * User: andrew
 * Date: 1/30/14
 * Time: 2:36 PM
 */
public class BansheeConverter implements Converter {
	@Override
	public void convert_database( Connection source, Connection destination ) {
		System.out.println("Converting");
		new DisplayTable("CorePlaylists").doSQL(source);
	}

}
