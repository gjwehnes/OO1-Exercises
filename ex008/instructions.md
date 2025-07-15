### Ex008 Dog
- Create the Dog.java class:
- Include the following public class variables:
  - name (type String)
  - breed (type String)
  - weight (type int)
- Write two constructors:
  - One that takes in values for all instance variables
  - Another that takes in only two parameters: name and weight.
    - When this constructor is called, the breed should default to "Mutt"

#### Note 
- This is an example of method *overloading*.
  - Two methods can have the same name, as long as the # of / type of parameters is different.
  - Remember, a constructor is just a special type of method that *instantiates* an object.
- Why would this be useful?
  - Sometimes the *client* (i.e. whomever is using your class) does not want to provide a given parameter or does not not know what value to give it.
  - Your class therefore provides multiple options for constructing an object.