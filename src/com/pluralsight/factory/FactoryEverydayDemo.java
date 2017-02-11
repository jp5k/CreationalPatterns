package com.pluralsight.factory;

import java.util.Calendar;
import java.util.Locale;

public class FactoryEverydayDemo {

	public static void main(String args[]) {

		// Gregorian calendar will be the concrete implementation
		// that will be created underneath the factory instance.

		Calendar cal = Calendar.getInstance();

		System.out.println(cal);

		System.out.println(cal.get(Calendar.DAY_OF_MONTH));

		// Can use different parameters.
		Calendar cal2 = Calendar.getInstance(Locale.TAIWAN);

		System.out.println(cal2);

		System.out.println(cal2.get(Calendar.DAY_OF_MONTH));

	}

}
