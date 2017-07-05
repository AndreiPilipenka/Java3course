package test.epam.com.task1pilipenka.calculations;
import org.junit.Assert;
import org.junit.Test;

import epam.com.task1pilipenka.definition.Straight;
import epam.com.task1pilipenka.definition.Vector;
import epam.com.task1pilipenka.definition.Point;
import epam.com.task1pilipenka.calculations.VectorCalc;
import epam.com.task1pilipenka.calculations.AngleCalc;

public class AngleCalcTest {
	public double expangle;
	@Test
	public void vectorValueEqual() {
	Point pointA = new Point(2,0,0);		
	Point pointB = new Point(6,0,0);
	Point pointC = new Point(0,0,-1);		
	Point pointD = new Point(0,0,9);
	expangle=90;
	
	Straight straight1 = new Straight(pointA, pointB);
	Straight straight2 = new Straight(pointC, pointD);
	VectorCalc vectorAB = new VectorCalc();
	Vector vectorABvalue=vectorAB.vector(straight1);
	Vector vectorCDvalue=vectorAB.vector(straight2);
	System.out.println("Hello A"+vectorABvalue + "Hello B" +vectorCDvalue);
	AngleCalc anglevalue=new AngleCalc();
	double angle=anglevalue.anglecalc(vectorABvalue, vectorCDvalue);
	System.out.println("Hello my Angle"+angle);
	Assert.assertEquals(expangle, angle, 0.0001);
	}
}


