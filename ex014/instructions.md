### Ex014 Stock
You are creating a Stock class.

### Instance Variables
- as required

### Constructors
- as per the unit test

### Methods:
- getters and setters, as per the unit test
- adjustPrice
    - This method will change the price by the dollar amount given (change can be positive or negative).
    - return the percentChanged as a double represents the percentage changed
    - this is an example of where we deviate from the standard 'setter' pattern to do something beyond just setting an instance variable. The percent changed may be useful to whomever called the method
- getMarketCap
    - marketCap is calculated by multiplying totalShares by price
    - this is an example of calculating a value *dynamically*, so that the result is always current. That is, you should *not* be storing the marketCap as an instance variable, as it could get out of sync. The fewer instance variables, the better
- public String toString()
    - This method should return a String contains information about the class, as per the unit test	