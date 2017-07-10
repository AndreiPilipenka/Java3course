package com.epam.interimtasks.importdata;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;
 
public class FileImportArr {
 
    public static ArrayList<String> readUsingScanner(String sourcefile) throws IOException {
    	String line;
        ArrayList<String> lines = new ArrayList<String>();
       	Path path = Paths.get(sourcefile);
        Scanner scanner = new Scanner(path);
        while(scanner.hasNextLine()){
            line=scanner.nextLine();
            lines.add(line);
        }
        
        scanner.close();
		return lines;
   	}

}
