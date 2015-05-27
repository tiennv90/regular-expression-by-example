package com.tiennguyen.regex;

/**
 * 
 * @author tien.nv
 *
 */
public class BasicRegexApplication {
	
	/**
	 * Level: Basic
	 * 
	 * input: here we go 123 ddd
	 * output: h r w g o
	 * 
	 * description: match a through c, g through z
	 * 				Learn about subtraction
	 * 				
	 */
	public static void setsubtraction() {
		
		Utils.printResult("here we go 123 ddd", "[a-z&&[^d-f]]");
		
	}		
	
	/**
	 * Level: Basic
	 * 
	 * input: here we go 123 ddd
	 * output: e e e d d d
	 * 
	 * description: match d-f in a-z
	 * 				Learn about intersection
	 * 				
	 */
	public static void setInsertion() {
		
		Utils.printResult("here we go 123 ddd", "[a-z&&[d-f]]");
		
	}	
	
	/**
	 * Level: Basic
	 * 
	 * input: $1,223,444.11
	 * output: $,,
	 * 
	 * description: match anything but number and period.
	 * 				Learn how to use "^" combine with [...]
	 * 				
	 */
	public static void matchAnythingButNumberAndPeriod() {
		Utils.printResult("$1,223,444.11", "[^0-9.]");
	}		
	
	/**
	 * Level: Basic
	 * 
	 * input: Give me a call - my number is 123-444-331
	 * output: - 123-444-331
	 * 
	 * description: Learn how to use "\\" combine with [...]
	 * 				
	 */
	public static void howToUseDash() {
		
		Utils.printResult("Give me a call - my number is 123-444-331", "[0-9\\-]");
		
	}	
	
	/**
	 * Level: Basic
	 * 
	 * input: I have $9.95. Wow e
	 * output: h a v e o w e
	 * 
	 * description: matches any lower case character but number.
	 * 				Learn how to use "[...]" to define a set of characters
	 */
	public static void matchAnyLowerCaseCharacter() {
		
		Utils.printResult("I have $9.95. Wow e", "[a-z]");
	}	
	
	/**
	 * Level: Basic
	 * 
	 * description: matches any character but number.
	 * 				Learn how to use "^" to define a negated set of characters
	 */
	public static void matchAnyCharacterButNumber() {
		
		Utils.printResult("I have $9.95. Wow", "[^0-9]");
		
	}	

	/**
	 * Level: Basic
	 * 
	 * input: I have $9.95
	 * output: $9.95
	 * 
	 * description: learn how to user \\ to escape special characters: "$" "."
	 */
	public static void patternToFilterStringFromParagraph() {
		
		Utils.printResult("I have $9.95. Wow", "\\$9\\.95");
		
	}	

	/**
	 * Level: Basic
	 * 
	 * input: I like cool words. Zoftig is a cool word.
	 * output: words word.
	 * 
	 * description: find strings that match "word<one character go here>"
	 */
	public static void patternToFilterLowerCaseStringFromParagraph2() {
		
		Utils.printResult("I like cool words. Zoftig is a cool word.", "word.");
		
	}
	
	/**
	 * Level: Basic
	 * 
	 * input: I like watching benevolent Ben benchpress
	 * output: ben ben
	 */
	public static void patternToFilterLowerCaseStringFromParagraph() {
		
		Utils.printResult("I like watching benevolent Ben benchpress", "ben");
		
	}
	
	/**
	 * input: ZZZZL <%= dsn %> AFFF <%= AFG %>
	 * output: dsn AFG
	 */
	public static void patternToFilterInputParamFromTemplate() {
		Utils.printResult("ZZZZL <%= dsn %> AFFF <%= AFG %>", "<%=(.*?)%>");
	}
	
	
	public static void main(String[] args) {
		patternToFilterInputParamFromTemplate();
	}

}
