package com.pluralsight.abstractfactory;

// The AbstractFactory class
// Starts the process of determining which credit card should be chosen
public abstract class CreditCardFactory {
	
	public static CreditCardFactory getCreditCardFactory(int creditScore){
		
		if(creditScore > 650){
			return new AmexFactory();
			
		}else{
			return new VisaFactory();
			
		}
			
	}
	
	public abstract CreditCard getCreditCard(CardType cardType);
	
	public abstract Validator getValidator(CardType cardType);

}
