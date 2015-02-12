package com.ariesmcrae.slf4jlogback;

import org.slf4j.Logger;  
import org.slf4j.LoggerFactory;  

public class Main {
	
	private final static Logger LOG = LoggerFactory.getLogger(Main.class);
	
	private String firstName;
	private String lastName;
	private Long age;
	
	
	public static void main(String[] args) {
        LOG.info("This is Main info logging.");
        LOG.warn("This is Main warn logging.");
		LOG.error("This is Main error logging.");
        LOG.debug("This is Main debug logging.");
        
        // Demo of parameterized logging - 1 argument.
        Main main = new Main();
        main.firstName = "Homer";
        LOG.info("My name is {}.", main.firstName);
        
        // Demo of parameterized logging. One or more arguments using vargars. 
        main.firstName = "Marge";
        main.lastName = "Simpson";
        main.age = 80L;
        LOG.info("My name is {} {}. My age is {}.", main.firstName, main.lastName, main.age);        
	}
	
}