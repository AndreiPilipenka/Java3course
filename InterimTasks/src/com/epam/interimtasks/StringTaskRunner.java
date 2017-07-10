package com.epam.interimtasks;

import java.io.IOException;

import com.epam.interimtasks.importdata.FileImportStr;
import com.epam.interimtasks.importdata.InputFromConsole;
public class StringTaskRunner {
	static String sourcefile = "./datafile/source.txt";
	
	static String lookupword="";
	public static void main(String[] args) throws IOException {
	lookupword=InputFromConsole.inputFromKeyb();
	StringBuilder sbfromfile = FileImportStr.readUsingScanner(sourcefile);
	String strfromfile=sbfromfile.toString();	
	String a[] = strfromfile.split(" ");
	int repeatcount=0;
	for (int j=0; j<a.length; j++) {
		if (a[j].compareToIgnoreCase(lookupword) == 0 ) {
			repeatcount=repeatcount+1;
		}
	}
	if (repeatcount==0){ System.out.println("Искомое слово не найдено.");}
	else System.out.println("Количество повторений равно "+ repeatcount);
	System.out.println(strfromfile);
	}

}
