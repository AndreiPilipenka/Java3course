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
		
		
}
	public static void printSetContains(SweetGiftSet sweetgiftset){
		double sum=0;
		
		for (int i=0; i<sweetgiftset.getGiftset().length; i++){
			 {
				  if (sweetgiftset.getGiftset()[i] != null) {
					  sum+=sweetgiftset.getGiftset() [i].getCost();
					  System.out.println(sweetgiftset.getGiftset() [i].getName()+" "+ sweetgiftset.getGiftset() [i].getCost());
				      }
				}
		}
		double amount=sum*sweetgiftset.getQuantity()+sweetgiftset.getBoxPrice()+sweetgiftset.getRibbonsPrice(); 
		System.out.println("Всего: "+sum);
		System.out.println("Кол-во: "+ sweetgiftset.getQuantity());
		System.out.println("Общая сумма: "+ amount);
}	


}
	
//System.out.println( a.getGiftset() [0].getName()+" "+ giftset1 [0].getCost()+" "+giftset1 [1].getName()+" "+ giftset1 [1].getCost() );
	


