package com.pluralsight.factory;

public class Shop extends Website {

	// This base class is interested in implementing the createWebsite method.
		@Override
		public void createWebsite() {
			pages.add(new CartPage());
			pages.add(new ItemPage());
			//etc...
		}
	
}
