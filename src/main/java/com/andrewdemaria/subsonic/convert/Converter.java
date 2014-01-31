package com.andrewdemaria.subsonic.convert;/*
 * Converter.java
 * Copyright (C) 2014 Andrew DeMaria (muff1nman) <ademaria@mines.edu>
 *
 * All Rights Reserved.
 */

import java.io.File;
import java.sql.Connection;

public interface Converter {

	public void convert_database( Connection source, Connection destination);

}


