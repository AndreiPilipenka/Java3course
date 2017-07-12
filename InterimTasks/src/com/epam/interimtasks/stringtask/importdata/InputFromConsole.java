package com.epam.interimtasks.stringtask.importdata;

import java.util.Scanner;

public class InputFromConsole {

	public static String inputFromKeyb() {
		@SuppressWarnings("resource")
		Scanner inputfromkeyb = new Scanner(System.in);
		String x="";
		System.out.print("Введите слово для поиска ");
		if (inputfromkeyb.hasNext()) {
			x=inputfromkeyb.next();
		}
		System.out.println("Искомое слово " + x);
			
	return x;}
}