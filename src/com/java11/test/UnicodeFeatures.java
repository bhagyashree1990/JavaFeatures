package com.java11.test;

import java.io.UnsupportedEncodingException;

public class UnicodeFeatures {

	public static void main(String[] args) throws UnsupportedEncodingException {
		//UNICODE 6.0 JAVA 7
		System.out.println("\u20b9"); //RUPEE 
		
		//UNICODE 8.0 JAVA 9
		System.out.println("\uD83E\uDD13");	//NERD FACE
		System.out.println("\uD83E\uDD81");	//LION FACE
		System.out.println("\uD83E\uDD11");	//MONEY MOUTH FACE
		System.out.println("\uD83E\uDD18");	//SIGN OF THE HORNS
		System.out.println("\uD83E\uDD84");	//UNICORN FACE
		
		//UNICODE 10.0 JAVA 11
		System.out.println("\u20BF"); //BITCOIN SIGN
	}

}
