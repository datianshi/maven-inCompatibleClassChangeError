package org.freelance.incomp.core;

public class PersonFactory {
	public static Person createPerson(){
		return new PersonImpl();
	}
}
