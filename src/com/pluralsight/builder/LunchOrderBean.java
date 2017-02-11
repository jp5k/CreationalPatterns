package com.pluralsight.builder;

public class LunchOrderBean {

	// This bean is good because it provides setters (unlike the telescopic example).
	// This is good because we can set all of our variables as we want, without having 
	// a large amount of overhead with the amount of constructors.  
	// However, the setters mean the variables are NOT IMMUTABLE.  
	
	private String bread;
	private String condiments;
	private String dressing;
	private String meat;
	
	
	public LunchOrderBean(){
	
	}

	public String getBread() {
		return bread;
	}

	public void setBread(String bread) {
		this.bread = bread;
	}

	public String getCondiments() {
		return condiments;
	}

	public void setCondiments(String condiments) {
		this.condiments = condiments;
	}

	public String getDressing() {
		return dressing;
	}

	public void setDressing(String dressing) {
		this.dressing = dressing;
	}

	public String getMeat() {
		return meat;
	}

	public void setMeat(String meat) {
		this.meat = meat;
	}

}
