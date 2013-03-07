package org.freelance.version2;

import org.freelance.incomp.core.Person;
import org.freelance.incomp.core.PersonFactory;

public class SayPerson {
	public void sayPerson(){
		Person p = PersonFactory.createPerson();
		System.out.println(p.getName());
	}
}
