### Ex007 Bicycle
Create a Bicycle class which stores the current state of a bike.
- The class should have four instance variables, one each for the front and rear gears and front and rear brakes
  - Gears are numbered 1-n and should thus be stored using `int` type
  - Brakes are either on or off and should thus be stored using `bool` type
  - Instance variables should all be set as private. In other words, these variables are _encapsulated_.
- Add a constructor, which takes in initial values for each of the four instance variables, in the order given above.
- Add public accessors and mutators for each of the instance variables.

#### Note 
- If the unit test does not compile, ensure that you've written the mutators correctly. Remember that case matters!
- If the unit test compiles but fails on running, then check that you are getting / setting the correct values!