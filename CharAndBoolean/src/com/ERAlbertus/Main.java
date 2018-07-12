package com.ERAlbertus;

public class Main {

    public static void main(String[] args) {
	    char myChar = '\u00A9';
        System.out.println(myChar);

        boolean myBoolean = false;
        boolean isMale = true;

        // 1. Find the code for the registered symbol on the same line as the copyright symbol.
        String unicode = "u00AE";
        // 2. Create a variable of type char and assign it the unicode value for that symbol.
        char registeredSymbol = '\u00AE';
        // 3. Display in on screen.
        System.out.println(registeredSymbol);
    }
}
