package com.example;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
public class Main{
	public static void main(String[] args){
		//TODO add the loading stub in here
		Logger log = LogManager.getLogger(Main.class);
		log.log(Level.WARN,"Hello world here");
		log.log(Level.ERROR,"I am Tojo");
	}
}