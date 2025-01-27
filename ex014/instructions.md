You are creating a Stock class.

### Instance Variables
- as required

### Constructors
- as per the unit test

### Methods:
- getters and setters, as per the unit test
- adjustPrice
    - This method will change the price by the dollar amount given (change can be positive or negative).
    - It should also recalculate percentChange and marketCap.
    - return the percentChanged as a double represents the percentage changed
- getMarketCap
    - marketCap is calculated by multiplying totalShares by price
- setShares
    - percentChange should default back to zero when this method is called
    - this method will also affect marketCap
- public String toString()
    - This method should return a String contains information about the class, as per the unit test	