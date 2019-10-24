package ui;

import java.io.IOException;
import java.nio.file.*; // added * to import all from library

public class FileIOApp {

	public static void main(String[] args) throws IOException {
		// pg.463 create directory
		String dirString = "c:/temp/sub1/sub2";
		Path dirPath = Paths.get(dirString);
		if (Files.notExists(dirPath)) {
			Files.createDirectories(dirPath);
		}
		else {
			System.out.println("Directory already exists!");
		}
		
		// p. 463 Create a File
		String fileString = "temp.txt";
		Path filePath = Paths.get(dirString, fileString);
		if(Files.notExists(filePath)) {
			Files.createFile(filePath);
		}
		else {
			System.out.println("File already exists, Dummy!");
		}
		
		
		// filePath is a variable we created
	
		System.out.println(filePath.getNameCount()); //4
		System.out.println(filePath.toString()); // c:\temp\sub1\sub2\temp.txt
		System.out.println(filePath.toAbsolutePath()); // c:\temp\sub1\sub2\temp.txt
		System.out.println(Files.isWritable(filePath)); // true
		System.out.println(Files.isHidden(filePath)); // false
		System.out.println(filePath.getRoot()); // C:\
		for(int i = 0; i < filePath.getNameCount(); i++) { // lists each file 
			System.out.println(filePath.getName(i));
		}
		
		// p. 463 display files in a directory
		
		System.out.println("Directory: "+dirPath.toAbsolutePath());
		System.out.println("Files: ");
		DirectoryStream<Path> dirStream = Files.newDirectoryStream(dirPath);
		for (Path p: dirStream) {
			if (Files.isRegularFile(p)) {
				System.out.println("\t"+p.getFileName());
			}
		}
		
	}
}
