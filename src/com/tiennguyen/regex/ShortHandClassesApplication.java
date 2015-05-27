package com.tiennguyen.regex;

/**
 * 
 * @author tien.nv
 *
 */
public class ShortHandClassesApplication {
	
	/**
	 * Level: intermediate
	 * 
	 * input: my number is 999-09-21-1980
	 * output: my number is 999-09-21-1980
	 * 
	 * description: Learn how to combine \w match word character [A-Za-z0-9_]
	 * 		with \W match anything but word character[^A-Za-z0-9_]
	 * 				
	 */
	public static void matchAnything() {
		
		Utils.printResult("my number is 999-09-21-1980", "[\\w\\W]");
		
	}	

	/**
	 * Level: intermediate
	 * 
	 * input: my number is 999-09-21-1980
	 * output: 09-21-1980
	 * 
	 * description: Learn how to use \d - match digit character [0-9]
	 * 				
	 */
	public static void matchDigitCharacter() {
		
		Utils.printResult("my number is 999-09-21-1980", "\\d\\d-\\d\\d-\\d\\d\\d\\d");
		
	}

	/**
	 * Level: intermediate
	 * 
	 * input: $1,223,444.11
	 * output: $,,
	 * 
	 * description: match anything but number and period.
	 * 				Learn how to use "^" combine with [...] and \d
	 * 				
	 */
	public static void matchAnythingButNumberAndPeriod() {
		
		Utils.printResult("$1,223,444.11", "[^\\d.]");
		
	}	
	
	
	public static void main(String[] args) {
		matchAnythingButNumberAndPeriod();
	}

}
