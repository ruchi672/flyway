package com.keramiozsoy.javaFlywaySample;

import java.sql.Connection;

import org.flywaydb.core.Flyway;



/**
 * 
 * @author user
 * 
 */
public class App {

	static Connection c = null;

	public static void main(String[] args) {
		Flyway flyway = Flyway.configure().dataSource("jdbc:postgresql://35.202.139.72:5432/postgres", "postgres", "somePassword").load();
		flyway.migrate();
		
	}
}
