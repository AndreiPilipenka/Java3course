package com.epam.interimtasks.pizzatask;

public enum CandyIngredient {
CHOCOLATE_FIGURES(8)
, CHOCOLATE_BRICKS(10)
, LOLLIPOP(3)
, CHOCOLATE_FLAKES(4)
, BOX_OF_CANDIES(8)
, CHUPA_CHUPS(1)
, LIQUOR_SWEETS(9)
, CHEWING_SWEETS(5);
private double cost;

CandyIngredient(double cost){
	this.cost=cost;
}
public double getCost() {
	return cost;
}
}

