package test.epam.com.task1pilipenka.calculations;
import org.junit.Assert;
import org.junit.Test;

import epam.com.task1pilipenka.definition.Straight;
import epam.com.task1pilipenka.definition.Vector;
import epam.com.task1pilipenka.definition.Point;
import epam.com.task1pilipenka.calculations.VectorCalc;

public class VectorCalcTest {
	@Test
	public void vectorValueEqual() {
	Point pointA = new Point(2,3,4);		
	Point pointB = new Point(1,8,6);
	Vector vectorExpected = new Vector(-1,5,2);
	Straight straight1 = new Straight(pointA, pointB);
	VectorCalc vectorAB = new VectorCalc();
	Vector vectorValue=vectorAB.vector(straight1);
	System.out.println("Vector value = "+vectorValue);
	System.out.println("ExpectedVector value = "+vectorExpected);
	Assert.assertEquals(vectorExpected, vectorValue);
}
}
