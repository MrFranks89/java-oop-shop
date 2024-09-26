package org.lessons.java.shop;

import java.util.Random;

public class Codice {
	
	int generaCodice() {
		Random randomNumber = new Random();
	    int codice = randomNumber.nextInt(100000);
		return codice;}
}
