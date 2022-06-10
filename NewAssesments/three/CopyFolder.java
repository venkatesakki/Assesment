package com.assesment;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CopyFolder {

	private static final String FileUtils = null;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
//		String source = "C:/your/source";
//		File srcDir = new File(source);
//
//		String destination = "C:/your/destination";
//		File destDir = new File(destination);
//
//		try {
//		    FileUtils.copyDirectory(srcDir, destDir);
//		} catch (IOException e) {
//		    e.printStackTrace();
//		}
		
		Path sourceDirectory = Paths.get("/home/vastpro/NewAssesments");
        Path targetDirectory = Paths.get("/home/vastpro/NewAssesments1");

        //copy source to target using Files Class
        Files.copy(sourceDirectory, targetDirectory);

	}

}
