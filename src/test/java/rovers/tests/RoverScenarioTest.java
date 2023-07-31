package rovers.tests;


import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

import rovers.Rover;


public class RoverScenarioTest {
	Rover rover;
	@Test
	public void roverMovement()
	{
		// Initialize grid size
        int gridMaxX = 5;
        int gridMaxY = 5;

        // Create and initialize a new Rover
        rover = new Rover();
        rover.setPosition(1, 2, Rover.N);

        // Execute commands for the Rover
        rover.process("LMLMLMLMM");
        rover.printPosition();
        // Assert final position and facing direction of the Rover
        assertEquals(Integer.valueOf(1), rover.x);
        assertEquals(Integer.valueOf(3), rover.y);
        assertEquals(Rover.N, rover.facing);

        // Reinitialize the Rover for the second part of the scenario
        rover.setPosition(3, 3, Rover.E);

        // Execute commands for the Rover
        rover.process("MMRMMRMRRM");
        rover.printPosition();
        
        // Assert final position and facing direction of the Rover
        assertEquals(Integer.valueOf(5), rover.x);
        assertEquals(Integer.valueOf(1), rover.y);
        assertEquals(Rover.E, rover.facing);    
	}
}
