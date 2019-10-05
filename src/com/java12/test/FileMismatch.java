package com.java12.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileMismatch {

	public static void main(String[] args) throws IOException {
		Path path1 = Files.createTempFile("File1", ".txt");
		Path path2 = Files.createTempFile("File2", ".txt");
		Files.writeString(path1, "Demo String1");
		Files.writeString(path2, "Demo String1");
		long mismatchPosition = Files.mismatch(path1, path2);
		System.out.println("Mismatch Position in file1 and file2 : "+mismatchPosition);
		path1.toFile().deleteOnExit();
		path2.toFile().deleteOnExit();
		
		Path path3 = Files.createTempFile("File3", ".txt");
		Path path4 = Files.createTempFile("File4", ".txt");
		Files.writeString(path3, "Demo String2");
		Files.writeString(path4, "Demo String3");
		long mismatchPosition1 = Files.mismatch(path3, path4);
		System.out.println("Mismatch Position in file3 and file4 : "+mismatchPosition1);
		path3.toFile().deleteOnExit();
		path4.toFile().deleteOnExit();
	}

}
