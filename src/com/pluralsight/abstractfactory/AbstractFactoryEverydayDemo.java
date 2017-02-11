package com.pluralsight.abstractfactory;

import java.io.ByteArrayInputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;

public class AbstractFactoryEverydayDemo {

	public static void main(String[] args) throws Exception {

		String xml = "<document><body><stock>AAPL</stock></body></document>";
		ByteArrayInputStream bais = new ByteArrayInputStream(xml.getBytes());

		// This is the AbstractFactory - we don't know what the underlying
		// implementation is !! All we know is that we have our document, and
		// that we can use and run that document.
		DocumentBuilderFactory abstractFactory = DocumentBuilderFactory
				.newInstance();
		DocumentBuilder factory = abstractFactory.newDocumentBuilder();
		Document doc = factory.parse(bais);

		doc.getDocumentElement().normalize();

		System.out.println("Root element :"
				+ doc.getDocumentElement().getNodeName());

		// Shows that we are using the xerces implementation for the abstract
		// factor. Could use a different implementation by passing in a
		// parameter
		// which would use a different library.
		System.out.println(abstractFactory.getClass());
		System.out.println(factory.getClass());

	}

}
