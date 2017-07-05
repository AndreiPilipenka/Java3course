package test.epam.com.task1pilipenka.importdata;
import java.io.IOException;
import java.util.ArrayList;

import org.junit.Test;
import epam.com.task1pilipenka.importdata.FileImport;

public class FileImportTest {
	String sourcefile = "./datafile/source.txt";
	@Test
		public void readUsingScannerTest() throws IOException {
		//FileImport readLinesTest = new FileImport();
		ArrayList<String> result=FileImport.readUsingScanner(sourcefile);
		System.out.println("Прочитанные строки" + result);
	}
}
	
