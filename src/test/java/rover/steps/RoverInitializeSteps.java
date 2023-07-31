package rover.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import rovers.Rover;
import static org.testng.Assert.assertEquals;

public class RoverInitializeSteps {
	
	private int plateauMaxX;
    private int plateauMaxY;
    private Rover rover;
	
	@Given("the plateau size is {int} {int}")
	public void the_plateau_size_is(Integer maxX, Integer maxY) {
		    plateauMaxX = maxX;
			System.out.println(maxX);
	        plateauMaxY = maxY;
	        System.out.println(maxY);
	    
	}

	@And("a rover is deployed with initial position {int} {int} {string}")
    public void initializeRover(int x, int y, String facing) {
		rover = new Rover();
		 rover.setPosition(x, y, Rover.getFacingFromString(facing));
		 rover.printPosition();
	}

	@Then("the rover's position should be {int} {int} {string}")
    public void checkRoverPosition(int x, int y, String facing) {
		System.out.println(rover.x);
        assertEquals(Integer.valueOf(x), rover.x);
        System.out.println(rover.y);
        assertEquals(Integer.valueOf(y), rover.y);
        System.out.println(rover.facing);
        assertEquals(Rover.getFacingFromString(facing), rover.facing);
        System.out.println("The rover facing direction is:" +facing);
    }

	@When("the rover moves forward")
	public void the_rover_moves_forward() {
		 rover.move();
	}

	@When("the rover receives instructions {string}")
	public void the_rover_receives_instructions(String instructions) {
		  rover.process(instructions);
		  rover.printPosition(); 
	}

	@Then("the rover's final position should be {int} {int} {string}")
	public void the_rover_s_final_position_should_be(Integer x, Integer y, String facing) {
		System.out.println(rover.x);
        assertEquals(Integer.valueOf(x), rover.x);
        System.out.println(rover.y);
        assertEquals(Integer.valueOf(y), rover.y);
        System.out.println(rover.facing);
        assertEquals(Rover.getFacingFromString(facing), rover.facing);
        System.out.println("The rover facing direction is:" +facing);
    
	}
	
	@When("the rover follows the commands {string}")
	public void the_rover_follows_the_commands(String commands) {
		 rover.process(commands);
		 System.out.println("The Command is:"+commands);
	}

	@Then("the rover is reinitialized with position {int} {int} {string}")
	public void the_rover_is_reinitialized_with_position(Integer x, Integer y, String facing) {
		 rover.setPosition(x, y, Rover.getFacingFromString(facing));
		assertEquals(Integer.valueOf(x), rover.x);
        assertEquals(Integer.valueOf(y), rover.y);        
        assertEquals(Rover.getFacingFromString(facing), rover.facing);
        System.out.println("The rover facing direction is:" +facing);
	}
}
