package rovers.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import rovers.Rover;

public class RoverPositionAndFacingTest {
	
	@Test
	public void roverPositionAndFacing()
	{
		Rover rover = new Rover();
		rover.setPosition(1, 2, Rover.N);
		rover.process("LMLMLMLMM");
        rover.printPosition();       
	}
}
