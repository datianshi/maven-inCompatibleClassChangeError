package org.freelance.incomp.app;

import org.freelance.version1.SayName;
import org.freelance.version2.SayPerson;


public class App 
{
    public static void main( String[] args )
    {
        new SayName().sayName();
        new SayPerson().sayPerson();
    }
}
