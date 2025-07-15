### Ex005 SimplePerson
Within the SimplePerson class, create three public instance variables:
- A boolean variable active, with a default value of true
- A String variable called name with a default value of "Nemo"
- An integer variable called grade with a default value of 11

#### Note 
- In this exercise, you are not creating accessors methods
- Rather you *exposing* your instance variables, so that other objects can directly read and/or modify them.
- As you can see by the unit test, this is syntactical, and in some cases sensible.
  - The syntax for reading / writing to the variables is shorter and more direct
  - However, all variables will mutable, and there is no ability for _validation_