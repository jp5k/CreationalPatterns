package com.pluralsight.builder;

public class BuilderLunchOrderDemo {

	public static void main(String args[]) {

		// Use an instance of the static inner class
		LunchOrder.Builder builder = new LunchOrder.Builder();

		// Use method chaining as we go, build out our object.
		// NOTE, we can also easily omit any of the sandwich fillings below,
		// and the builder would cope with it easily.
		builder.bread("Wheat").condiments("Lettuce").dressing("Mayo")
				.meat("Turkey");

		// The build() method returns an instance of our LunchOrder, which is
		// also immutable which means no one can change it.
		LunchOrder lunchOrder = builder.build();

		System.out.println(lunchOrder.getBread());
		System.out.println(lunchOrder.getCondiments());
		System.out.println(lunchOrder.getDressing());
		System.out.println(lunchOrder.getMeat());

	}

}
