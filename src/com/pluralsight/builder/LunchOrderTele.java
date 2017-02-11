package com.pluralsight.builder;

public class LunchOrderTele {

	// This class is the telescopic lunch order class, which is the same in
	// principle as the lunchOrderBean class,
	// but has telescopic constructors rather than using setters.

	// BUT, WHAT IF I just want a sandwich with no meat, or no condiments.
	// This class doesn't provide an easy way to do this.
	// Would need to provide even more constructors to do this.

	// The GOOD thing about this class, is that it's immutable (can't change
	// variables after they've been initially set).

	private String bread;
	private String condiments;
	private String dressing;
	private String meat;

	public LunchOrderTele(String bread) {
		this.bread = bread;
	}

	public LunchOrderTele(String bread, String condiments) {
		this(bread);
		this.condiments = condiments;
	}

	public LunchOrderTele(String bread, String condiments, String dressing) {
		this(bread, condiments);
		this.dressing = dressing;
	}

	public LunchOrderTele(String bread, String condiments, String dressing,
			String meat) {
		this(bread, condiments, dressing);
		this.meat = meat;
	}

	public String getBread() {
		return bread;
	}

	public String getCondiments() {
		return condiments;
	}

	public String getDressing() {
		return dressing;
	}

	public String getMeat() {
		return meat;
	}

}
