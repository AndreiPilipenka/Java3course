package com.epam.interimtasks;

public class SweetGiftSet {

private int idGift;
private boolean giftCard;
private int idClient;
private String clientName;
private String giftName;
private int quantity; 
final boolean box=true;
final boolean ribbons=true;

public SweetGiftSet(int id, boolean card, int idClient, String clientName, String giftName, int quantity){
	if (9999 < id && id < 100000) {
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
	if (quantity  < 21)	{
		this.setQuantity(quantity);
	}
	else {
		throw new IllegalArgumentException("Incorrect number of sets were ordered. ("+ quantity +") No more than 20 sets could be ordered."); 
	}
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


}



