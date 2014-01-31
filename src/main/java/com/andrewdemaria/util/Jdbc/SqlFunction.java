package com.andrewdemaria.util.Jdbc;

import java.sql.Connection;

/**
 * Created with IntelliJ IDEA.
 * User: andrew
 * Date: 1/30/14
 * Time: 9:37 PM
 */
abstract class SQLFunction {
	abstract public void doSQL( Connection db );
}

