package com.ERAlbertus;

public class Main {

    public static void main(String[] args) {
//	    SomeClass one = new SomeClass("one");
//	    SomeClass two = new SomeClass("two");
//	    SomeClass three = new SomeClass("three");
//
//		System.out.println(one.getInstanceNumber());
//		System.out.println(two.getInstanceNumber());
//		System.out.println(three.getInstanceNumber());
//
//		// one.instanceNumber = 4;
//		System.out.println(Math.PI);
//		//Math m = new Math();
//
//		int pw = 674312;
//		Password password = new Password(pw);
//		password.storePassword();
//
//		password.letMeIn(1);
//		password.letMeIn(5454545);
//		password.letMeIn(97752);
//		password.letMeIn(0);
//		password.letMeIn(-1);
//		password.letMeIn(674312);

		System.out.println("Main method called");
		SIBTest test = new SIBTest();
		test.someMethod();
		System.out.println("Owner is " + SIBTest.owner);

    }
}
