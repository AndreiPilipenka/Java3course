package com.epam.interimtasks.pizzatask;
import com.epam.interimtasks.pizzatask.SweetGiftSet;

public class PrintCheck{
	
	public static void printOrderInfo(SweetGiftSet sweetgiftset){
			System.out.println(sweetgiftset.toString());
	}
	public static void printOrderInfoToCheque(SweetGiftSet sweetgiftset){
		System.out.println("**********************************");
		System.out.println("Заказ: "+sweetgiftset.getIdGift());
		System.out.println("Клиент: "+sweetgiftset.getClientName());
		System.out.println("Название: "+sweetgiftset.getGiftName());
		System.out.println("----------------------------------");
		System.out.printf("%-30.30s%2.0f%s\u20ac%n", "Подарочная упаковка, Ленты", sweetgiftset.getBoxPrice()+sweetgiftset.getRibbonsPrice(), " ");
				
}
	public static void printSetContains(SweetGiftSet sweetgiftset){
		double sum=sweetgiftset.getBoxPrice()+sweetgiftset.getRibbonsPrice();
		
		for (int i=0; i<sweetgiftset.getGiftset().length; i++){
			 {
				  if (sweetgiftset.getGiftset()[i] != null) {
					  sum+=sweetgiftset.getGiftset() [i].getCost();
					  System.out.printf("%-24.24s%8.0f%s\u20ac%n", sweetgiftset.getGiftset() [i].getName() ,sweetgiftset.getGiftset() [i].getCost(), " ");
				      }
				}
		}
		int amount=(int) (sum*sweetgiftset.getQuantity()); 
		
		System.out.println("----------------------------------");
		System.out.printf("%-24.24s%8.0f%s\u20ac%n", "Всего:", sum, " ");
		System.out.printf("%-24.24s%8s%n", "Кол-во:", Integer.toString(sweetgiftset.getQuantity()), " ");
		System.out.println("----------------------------------");
		System.out.printf("%-24.24s%8s%s\u20ac%n", "Общая сумма:", amount, " ");
		System.out.println("**********************************");
				
}	


}
	
//System.out.println( a.getGiftset() [0].getName()+" "+ giftset1 [0].getCost()+" "+giftset1 [1].getName()+" "+ giftset1 [1].getCost() );
	


