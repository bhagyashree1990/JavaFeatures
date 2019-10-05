package com.java13.test;

public class TextBlock {
	//javac -Xlint:preview --enable-preview -source 13 src/com/java13/test/TextBlock.java
	
	public static void main(String[] args) {
		String html = """
	            <html>
	                <body>
	                <p>Hello, Text Blocks</p>
	                </body>
	            </html>""";
		System.out.println(html);
		
		
		//text blocks cannot be used on a single line.
		//String smallBlock = """Only one line"""; //TODO : JAVA-13 COMPILATION error

	}

}
