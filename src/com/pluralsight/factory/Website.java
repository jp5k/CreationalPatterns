package com.pluralsight.factory;

import java.util.ArrayList;
import java.util.List;

public abstract class Website {

	protected List<Page> pages = new ArrayList<>();
	
	public Website(){
		this.createWebsite();
	}

	public List<Page> getPages() {
		return pages;
	}
	
	//concrete classes will override this method
	public abstract void createWebsite();
	
}
