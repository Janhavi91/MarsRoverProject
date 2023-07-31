Feature: Rover Initialization

Scenario: Rover direction facing and positioning initialization

Given the plateau size is 5 5
And a rover is deployed with initial position 1 2 "N"
Then the rover's position should be 1 2 "N"

Scenario: Moving the rover x and y position and location

Given the plateau size is 5 5
And a rover is deployed with initial position 1 2 "N"
When the rover moves forward
Then the rover's position should be 1 3 "N"

Scenario: Moving the rover as per the given scenario problem

Given the plateau size is 5 5
And a rover is deployed with initial position 1 2 "N"
When the rover follows the commands "LMLMLMLMM"
Then the rover's final position should be 1 3 "N"
And the rover is reinitialized with position 3 3 "E"
When the rover follows the commands "MMRMMRMRRM"
Then the rover's final position should be 5 1 "E"