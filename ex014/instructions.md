You are creating a Stock class.

### Instance Variables
- as required

### Constructors
- as per the unit test

### Methods:
- getters and setters, as per the unit test
- adjustPrice
    - This method will change the price by change (change can be positive or negative).
    - It should also recalculate percentChange and marketCap. percentChange represents the percentage changed
- getPercentChange
    - percentChange should default to zero, but after adjustPrice is called, this method should return the change as a percent from the previous value.
- getMarketCap
    - marketCap is calculated by multiplying totalShares by price
- setShares
    - percentChange should default back to zero when this method is called
    - this method will also affect marketCap
- public String toString()
    - This method should return a String contains information about the class, as per the unit test	