package com.tiennguyen.regex.chapter1.metacharacter;

import com.tiennguyen.regex.Utils;

public class Metacharacter {
	
	
	
	public static void dotCharacter() {
		
		Utils.printResult("hit asdasd hat h.0 kdjskdjk", "h.t");
		
	}
	
	public static void dotCharacter2() {
		
		Utils.printResult("hahaha #a#a#a sasasasa", ".a.a.a");
		
	}
	
	public static void escapseSpecialCharacter() {
		
		Utils.printResult("9.00 dsdsds 9.00", "9\\.00");
		
	}
	
	public static void escapseSpecialCharacter2() {
		
		Utils.printResult("/home/user/text.txt", "\\/home\\/user\\/text\\.txt");
		
	}
	
	public static void main(String[] args) {
		
		escapseSpecialCharacter2();
		
	}
	
	
}
