	1. Complete the StoreProduct.java class:
	
	Include the following instance variables:
	- label (type String)
	- price (type double)
	- stock (type int, represents how many the store has available)
	- hasExpired
	
	Write a constructor that receives parameters for all instance variables except hasExpired (as it would make no sense to create an instance for expired stock)
	
	2. Include the following methods:
	- setExpired(boolean hasExpired)
	    - If hasExpired is true, then it should set the stock to 0 and change the instance
	    variable to indicate the stock is now expired. If the parameter hasExpired is false, nothing happens.	
	- public boolean makeSale(int quantity)
	    - Check if the quantity (being bought) is available given the stock.  If there is enough, then make the sale by subtracting the quantity from the stock and return true (the sale was successful).  If there isn't enough, return false instead.
	
	- public double getDiscountedPrice(double discount)
	    - The parameter discount should be between .01 and 1 and represent a 0 to 100% discount.  Multiply the product's price by the (1 - discount) to obtain the discounted price and return that value.
