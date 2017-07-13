package com.epam.interimtasks.pizzatask;

import com.epam.interimtasks.pizzatask.CandyIngredient;

public class SweetGiftSet {

private int idGift;
private boolean giftCard;
private int idClient;
private String clientName;
private String giftName;
private int quantity; 
final boolean box=true;
final boolean ribbons=true;
final double boxPrice=3.0;
final double ribbonsPrice=5.0;
final static int IDGIFT_MINVAL=9999;
final static int IDGIFT_MAXVAL=100000;
final static int MAXGIFTQTY=21;
final static int MAXGIFT_NAMELENGTH=20;
final static int MINGIFT_NAMELENGTH=8;

private CandyIngredient[] giftset = new CandyIngredient[8]; 

public SweetGiftSet(int id, boolean card, int idClient, String clientName, String giftName, int quantity){
	if (IDGIFT_MINVAL < id && id < IDGIFT_MAXVAL) {
		this.idGift=id;
	}
	else {
		throw new IllegalArgumentException("Incorrect Gift Set ID was provided" + id); 
	}
		this.setGiftCard(card);
		this.idClient=idClient;
		this.setClientName(clientName);
	if ( 8 < giftName.length() && giftName.length() < 21 ){	
		this.setGiftName(giftName);
		}
	else {
		this.setGiftName("Client #" + id);
	}
	if (quantity  < MAXGIFTQTY)	{
		this.setQuantity(quantity);
	}
	else {
		throw new IllegalArgumentException("Incorrect number of sets were ordered. ("+ quantity +") No more than 20 sets could be ordered."); 
	}
}

public SweetGiftSet() {
}

public void addNewCandy(CandyIngredient newCandyIngredient){
	
	if(this.isArrayhasFreeSpace()){
		if (!this.isArrayhasSameMember(newCandyIngredient)){
			for(int i=0;i<giftset.length; i++){
				if (giftset[i]== null){
					giftset[i]=newCandyIngredient;
					break;
				}
			}  
		}
		else {
			System.out.println("Такой элемент уже присутствует в подарке "+idGift);	
		}
	}
	else {
		System.out.println("Подарок уже "+idGift+" полон");
	
	}
	
}

public boolean isArrayhasFreeSpace(){
	boolean f=false;
	for (int i=0; i<giftset.length; i++){
		 if (giftset[i] == null){
			 f=true;
			 break;}
		 }
	return f;
}

public boolean isArrayhasSameMember(CandyIngredient newCandyIngredient){
	boolean s=false;
	for (int i=0; i<giftset.length; i++){
		 if (giftset[i] ==newCandyIngredient){
			 s=true;
			 break;}
		 }
	return s;
}

public String getGiftName() {
	return giftName;
}

public void setGiftName(String giftName) {
	this.giftName = giftName;
}

public int getQuantity() {
	return quantity;
}

public void setQuantity(int quantity) {
	this.quantity = quantity;
}

public int getIdGift() {
	return idGift;
}


public int getIdClient() {
	return idClient;
}


public boolean isBox() {
	return box;
}

public boolean isRibbons() {
	return ribbons;
}

public boolean isGiftCard() {
	return giftCard;
}

public void setGiftCard(boolean giftCard) {
	this.giftCard = giftCard;
}

public String getClientName() {
	return clientName;
}

public void setClientName(String clientName) {
	this.clientName = clientName;
}

@Override
public String toString() {
	return "[" + idGift+" : " + clientName +" : "+ giftName +" : "+ quantity + "]";
}

public CandyIngredient[] getGiftset() {
	return giftset;

}

public double getBoxPrice() {
	return boxPrice;
}

public double getRibbonsPrice() {
	return ribbonsPrice;
}

}



