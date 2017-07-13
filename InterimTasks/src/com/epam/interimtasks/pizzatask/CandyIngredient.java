package com.epam.interimtasks.pizzatask;

public enum CandyIngredient {
CHOCOLATE_FIGURES(8, "Шоколадные фигурки")
, CHOCOLATE_BRICKS(10, "Шоколадные плитки" )
, LOLLIPOP(3, "Леденец")
, CHOCOLATE_FLAKES(4, "Шоколадные хлопья")
, BOX_OF_CANDIES(8, "Конфеты в коробке")
, CHUPA_CHUPS(1, "Чупа чупс")
, LIQUOR_SWEETS(9, "Конфеты с ликером")
, CHEWING_SWEETS(5, "Жевательные конфеты");
private double cost;
private String name;

CandyIngredient(double cost, String name){
	this.cost=cost;
	this.name=name;
}
public double getCost() {
	return cost;
}
public String getName(){
	return name;
}


}


