package com.company;

public class Main {

    public static void main(String[] args) {
	Stringchecker sc1 = new CodeWordChecker(5,6,"$");
	Stringchecker sc2 = new CodewordChecker("pass");

	System.out.println(sc1.isValid("happy"));
	System.out.println(sc1.isValid("happy$"));
	System.out.println(sc1.isValid("Code"));
	System.out.println(sc1.isValid("happyCode"));

	System.out.println(sc2.isValid("MyPass"));
	System.out.println(sc2.isValid("MypassPort"));
	System.out.println(sc2.isValid("happy"));
	System.out.println(sc2.isValid("1,000,000,000,000,000"));
    }
}
