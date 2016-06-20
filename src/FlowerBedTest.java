import static org.junit.Assert.*;

import org.junit.Test;


public class FlowerBedTest {

	@Test
	public void testPerimeter () {
		
		  FlowerBed myFlowerBed = new FlowerBed (1);
		  assertEquals  (6.28,myFlowerBed.getCircumference(),0.01);
		
	}

}
