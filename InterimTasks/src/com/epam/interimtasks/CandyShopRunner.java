package com.epam.interimtasks.importdata;

import com.epam.interimtasks.SweetGiftSet;

public class CandyShopRunner {

	public static void main(String[] args) {


	SweetGiftSet a = new SweetGiftSet(12089, true, 56789, "Иванов В.В.", "Новогодний", 1);
	SweetGiftSet b = new SweetGiftSet(12090, true, 56600, "Сидорук С.С", "Детский 2", 3);
	System.out.println(a.toString());
	System.out.println(b.toString());

}
}
