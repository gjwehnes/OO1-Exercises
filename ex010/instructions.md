### Ex010 StoreProduct
Complete the StoreProduct.java class:
- Include the following instance variables:
  - label (type String)
  -  price (type double)
  - stock (type int, represents how many the store has available)
  - expired (type boolean)
- Write a constructor that receives parameters for all instance variables except expired (as it would make no sense to create an instance for expired stock)
- Include the following public methods:
  - regular accessors for all instance variables
    - If getExpired is true, then it should cause getStock to return 0.	
  - boolean makeSale(int quantity)
    - return type is boolean
	- Check if the quantity (being bought) is available given the stock.
    - If there is enough stock, then make the sale by subtracting the quantity from the stock and return true (the sale was successful).
    - If there is not enough stock, return false instead.
    - You cannot buy expired stock
  - double discountPrice(double discount)
    - return type is void
	- The parameter discount is the discount expressed as a decimal.
    - Multiply the product's price by the (1 - discount) to obtain the discounted price and return that value.

#### Note
 - You should already be comfortable with accessors (getters) and mutators (setters)
 - The makeSale and discountPrice are both examples of mutator methods
   - They still modify (_mutate_) the _state_ of the object in some way
   - They are more than complex than 'setters' such as setExpired in that there are additional behavioural rules
   - This is communicated to the user because they do not follow the setXXXX naming convention
