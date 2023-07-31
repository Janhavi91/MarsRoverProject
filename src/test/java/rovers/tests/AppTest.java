package rovers.tests;

import org.testng.annotations.Test;

import rovers.Rover;

public class AppTest {
	
	@Test
	public void mainTest()
	{
		Rover rover = new Rover();
        rover.setPosition(1, 2, Rover.N);
        rover.process("LMLMLMLMM");
        rover.printPosition(); // prints 1 3 N
        rover.setPosition(3, 3, Rover.E);
        rover.process("MMRMMRMRRM");
        rover.printPosition(); // prints 5 1 E
	}

}
