package com.epam.interimtasks.pizzatask;

import com.epam.interimtasks.pizzatask.SweetGiftSet;
import com.epam.interimtasks.pizzatask.PrintCheck;

public class CandyShopRunner {

	public static void main(String[] args) {


		SweetGiftSet a = new SweetGiftSet(12089, true, 56789, "Иванов В.В.", "Новогодний", 1);
		a.addNewCandy(CandyIngredient.CHEWING_SWEETS);
		a.addNewCandy(CandyIngredient.CHEWING_SWEETS);
		
		
		
		SweetGiftSet b = new SweetGiftSet(12090, true, 56600, "Сидорук С.С", "Детский 2", 3);
		b.addNewCandy(CandyIngredient.LOLLIPOP);
		b.addNewCandy(CandyIngredient.CHEWING_SWEETS);
		b.addNewCandy(CandyIngredient.CHOCOLATE_FIGURES);
		b.addNewCandy(CandyIngredient.CHOCOLATE_BRICKS);		
		b.addNewCandy(CandyIngredient.CHOCOLATE_FLAKES);
		b.addNewCandy(CandyIngredient.BOX_OF_CANDIES);		
		b.addNewCandy(CandyIngredient.CHUPA_CHUPS);
		b.addNewCandy(CandyIngredient.LIQUOR_SWEETS);
		b.addNewCandy(CandyIngredient.LIQUOR_SWEETS);
		

		
		
	PrintCheck.printOrderInfoToCheque(a);
	PrintCheck.printSetContains(a);
	PrintCheck.printOrderInfoToCheque(b);
	PrintCheck.printSetContains(b);

	
	
	
	
}
}
