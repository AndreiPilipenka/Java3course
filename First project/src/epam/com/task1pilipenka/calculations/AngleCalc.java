package epam.com.task1pilipenka.calculations;

import epam.com.task1pilipenka.definition.Vector;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class AngleCalc {
		private double angle;
		private static final Logger LOGGER  = LogManager.getLogger();
		public double anglecalc (Vector vectorAB, Vector vectorCD){
			
		
		float cosangle=(float)
				((vectorAB.getX()*vectorCD.getX()+vectorAB.getY()*vectorCD.getY()+vectorAB.getZ()*vectorCD.getZ())
						/
						(Math.sqrt(Math.pow(vectorAB.getX(),2)+Math.pow(vectorAB.getY(),2)+Math.pow(vectorAB.getZ(),2))*Math.sqrt(Math.pow(vectorCD.getX(),2)+Math.pow(vectorCD.getY(),2)+Math.pow(vectorCD.getZ(),2))));
		LOGGER.info("AB x="+vectorAB.getX()+" CD X="+vectorCD.getX()+"AB Y="+vectorAB.getY()+ "CD Y"+vectorCD.getY()+"AB z"+vectorAB.getZ()+"CD Z"+vectorCD.getZ()+" ");
		LOGGER.info("Cos of angle equal to  = "+cosangle);
		double radangle=Math.acos(cosangle);
		LOGGER.info("Rad angle equal to  = "+radangle);
		double angle=(180/Math.PI)*radangle;
		LOGGER.info("Angle equal to  = "+angle);
		return angle;	
		}
		public double getAngle() {
			return angle;
		}

}
