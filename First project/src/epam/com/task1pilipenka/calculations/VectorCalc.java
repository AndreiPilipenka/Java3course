package epam.com.task1pilipenka.calculations;
import epam.com.task1pilipenka.definition.Straight;
import epam.com.task1pilipenka.definition.Vector;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class VectorCalc {
	private static final Logger LOGGER  = LogManager.getLogger();
	public Vector vector(Straight straight1){ 
		Vector vectorAB = new Vector(straight1.getPointB().getX()-straight1.getPointA().getX(), straight1.getPointB().getY()-straight1.getPointA().getY(), straight1.getPointB().getZ()- straight1.getPointA().getZ());
		LOGGER.info("Vector value to the LOG = "+vectorAB);
		return vectorAB;
	}
}
