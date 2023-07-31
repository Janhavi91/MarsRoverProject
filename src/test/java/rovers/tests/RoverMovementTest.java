package rovers.tests;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

import rovers.Rover;

public class RoverMovementTest {
	Rover rover;
	@Test
    public void roverMovement() {
        Rover rover = new Rover();
        rover.setPosition(1, 2, Rover.N);
        rover.printPosition();
        
        rover.move();
        assertEquals(rover.y, Integer.valueOf(3)); // Since facing North, moving forward should increase Y

        rover.turnRight();
        rover.move();
        assertEquals(rover.x, Integer.valueOf(2)); // Since facing East, moving forward should increase X

        rover.turnRight();
        rover.move();
        assertEquals(rover.y, Integer.valueOf(2)); // Since facing South, moving forward should decrease Y

        rover.turnRight();
        rover.move();
        assertEquals(rover.x, Integer.valueOf(1)); // Since facing West, moving forward should decrease X
        
        rover.setPosition(3, 3, Rover.E);
        rover.process("MMRMMRMRRM");
        rover.printPosition();
    }

}
