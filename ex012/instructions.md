### Ex012 Person
Complete the Person class with the following:
- Instance variables (all private)
    - String firstName
    - String lastName
    - int birthMonth
    - int birthDay
    - int birthYear
- Constructor:
    - The main constructor should take in all values and assign them to their respective private class variables
- Accessors (getters) for all fields
    - e.g. getFirstName, getLastName,getBirthMonth, etc. 
- Mutators for all fields
    - setFirstName, setLastName have no special rules.
    - setBirthDay, setBirthMonth will require _validation_
        - It does not make sense for a Person's birthMonth to be set to a value less than 1 or greater than 12. Thus, add code to the setBirthMonth method so that if an invalid value is given, then the field is not modified.
        - Similarly, for setBirthDay, if the value given is less than 1 or greater than 31, then do not modify the field.
        - Declare the return type for these methods to be boolean, and indicate whether the parameter was valid by return true or false
        - Note that this would still allow invalid dates to be set as not all months have 31 days
    - setBirthYear has no validation but should still have return type boolean
        - Note that this would still allow invalid dates to be set, but determining all valid dates is a tricky problem (think leap years)!
 - Methods
    - getBirthday()
    - returns a String composed of their birthday in month/day/year format. For example, if birthMonth=3, birthday=22, birthYear=2000, it should return the String "3/22/2000"

#### Notes
- This is a good example of where encapsulation is useful.
  - If the birthMonth and birthDay fields were declared as public, there would be no way to stop another class from creating a Person with a birthday that makes no sense in reality.
  - Thereby, you may catch a programming error (or a user input error) before it becomes a problem.
- There are other mechanisms whereby invalid input can be communicated... we will look into _exceptions_ later in the course.
- Validation is quite also quite often used in ensuring that user input is within a certain range

