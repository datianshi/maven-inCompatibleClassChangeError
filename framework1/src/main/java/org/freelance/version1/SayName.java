package org.freelance.version1;

import org.freelance.incomp.core.Person;
import org.freelance.incomp.core.PersonFactory;

public class SayName {
	public void sayName(){
		Person p = PersonFactory.createPerson();
		System.out.println(p.getName());
	}
}
