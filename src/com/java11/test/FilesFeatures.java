package com.java11.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FilesFeatures {

	public static void main(String[] args) throws IOException {
		//readStringTest();
		writeStringTest();
		//sameFileTest();
	}

	public static void readStringTest() throws IOException {
		String output =	Files.readString(Path.of("TestRead.txt"));
		System.out.println(output);
	}
	
	public static void writeStringTest() throws IOException {
		String input = "Hello World\r\n" + 
				"01-04-1990\r\n" + 
				"Happy April Fool's Day\r\n" ;
		Path path =	Files.writeString(Path.of("TestWrite.txt"), input);
		System.out.println(path);
	}
	
	public static void sameFileTest() throws IOException {
		System.out.println(Files.isSameFile(Path.of("TestRead.txt"), Path.of("TestRead.txt")));
		System.out.println(Files.isSameFile(Path.of("TestRead.txt"), Path.of("TestWrite.txt")));
	}
}
