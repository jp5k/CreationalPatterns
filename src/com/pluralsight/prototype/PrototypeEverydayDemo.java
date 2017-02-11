package com.pluralsight.prototype;

import java.util.ArrayList;
import java.util.List;

public class PrototypeEverydayDemo {

	public static void main(String[] args) {

		// THIS CLASS IS FOR THE FIRST DEMO IN THE MODULE
		
		String sql = "Select * from movies where title = ?";

		List<String> parameters = new ArrayList<>();

		parameters.add("Star Wars");

		Record record = new Record();

		Statement firstStatement = new Statement(sql, parameters, record);

		System.out.println(firstStatement.getSql());

		System.out.println(firstStatement.getParameters());

		System.out.println(firstStatement.getRecord());

		// NOTE - WILL CREATE A SHALLOW COPY - VERY IMPORTANT!!!
		
		Statement secondStatement = firstStatement.clone();

		System.out.println(secondStatement.getSql());

		System.out.println(secondStatement.getParameters());

		System.out.println(secondStatement.getRecord());

	}

}
