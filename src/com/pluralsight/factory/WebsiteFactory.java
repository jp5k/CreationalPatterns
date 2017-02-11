package com.pluralsight.factory;

public class WebsiteFactory {

	// The 'Factory' class which is this one, is usually the class 
	// name of the underlying Website, with Factory on the end 
	// to make 'WebsiteFactory'
	
	public static Website getWebsite(WebsiteType siteType){
		switch(siteType){
		
		//Switch on an ENUM, this is very good practice
		case BLOG : {
			return new Blog();
		}
		case SHOP : {
			return new Shop();
		}
		
		default: {
			return null;
		}
		}
		
	}
	
}
