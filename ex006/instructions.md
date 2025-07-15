### Ex006 Student
Create a class 'Student' which can store three values: last name, first name, and ID.

- Create three instance variables. These instance variables should all be set as private, which means that they are not visible (in scope) to any other class. In other words, these variables are encapsulated.
- Create a _constructor_, which sets the instance variables to the values that are passed in as parameters.
- Provide public accessors ("getters") for each of the instance variables in the Student class.

#### Note 
- As opposed to the previous exercise, you are now adding an extra layer of protection to your data
- The variables can now be _accessed_ but they cannot be _mutated_
- This is an example of _encapsulation_, (or _data protection_), which is one of the core concepts of Object Oriented Programming.
- Taking things further, if you do not want other objects to have access to these values, then you also don't provide an accessor.
- By default, instance variables should be declared as private
- Using no access modifier at all is **not** the same as using the `private` modifier [as per the official java documentation ](https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html)
