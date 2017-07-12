package com.epam.interimtasks.stringtask.importdata;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
 
public class FileImportStr {
 
    public static StringBuilder readUsingScanner(String sourcefile) throws IOException {
    	StringBuilder line = new StringBuilder("");
        Path path = Paths.get(sourcefile);
        Scanner scanner = new Scanner(path);
        while(scanner.hasNextLine()){
        	line.append(" ");
            line.append(scanner.nextLine());
        }
        
        scanner.close();
		return line;
   	}

}
