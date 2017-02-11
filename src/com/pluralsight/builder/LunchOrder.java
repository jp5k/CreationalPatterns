package com.pluralsight.builder;

public class LunchOrder {
	
	// THE FLEXIBILITY OF THE BEAN APPROACH, COMBINED WITH THE TELESCOPIC CONSTRUCTOR APPROACH 
	// IS HERE IN THIS LUNCHORDER class !!!!!
	
	// Static inner class Builder is its own container,
	// until we tell it what the lunch order is.
	public static class Builder {
		private String bread;
		private String condiments;
		private String dressing;
		private String meat;

		// No args constructor. But we could SPECIFY which arguments should
		// be taken, for example if we HAD to specify a bread. Could enforce it
		// within the constructor arguments.
		public Builder() {

		}

		// Below build() method is very important.
		// It calls the LunchOrder constructor with a Builder as an argument.
		// Which then calls the constructor (2) below.
		public LunchOrder build() {
			return new LunchOrder(this);
		}

		// KEY to BUILDER pattern is to have the following methods,
		// which allow for the different sandwich ingredients to be constructed.
		// It returns a Builder object, which is this static inner class
		// that we're currently in.
		// Could also use type safe enums if we wanted to !!!
		public Builder bread(String bread) {
			this.bread = bread;
			return this;
		}

		public Builder condiments(String condiments) {
			this.condiments = condiments;
			return this;
		}

		public Builder dressing(String dressing) {
			this.dressing = dressing;
			return this;
		}

		public Builder meat(String meat) {
			this.meat = meat;
			return this;
		}

	}

	private final String bread;
	private final String condiments;
	private final String dressing;
	private final String meat;

	// This method is called (2), which uses the
	private LunchOrder(Builder builder) {
		// The builder sandwich variables are then copied over to our main
		// LunchOrder variables.
		this.bread = builder.bread;
		this.condiments = builder.condiments;
		this.dressing = builder.dressing;
		this.meat = builder.meat;
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