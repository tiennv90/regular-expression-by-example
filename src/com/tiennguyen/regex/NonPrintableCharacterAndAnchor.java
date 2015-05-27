package com.tiennguyen.regex;


/**
 * 
 * @author tien.nv
 *
 */
public class NonPrintableCharacterAndAnchor {
	/**
	 * Level: basic
	 * 
	 * input: Can you dance CanCan
	 * output: CanCan
	 * 
	 * description: match boundary character, the third Can word does not match because there's no boundary
	 * 				learn how to use \b
	 */
	public static void matchBoundaryWords() {
		
		Utils.printResult("Can you dance CanCan", "\\bCan");
		
	}
	
	/**
	 * Level: basic
	 * 
	 * input: are you feeling alright, Lucy ?
	 * output: a
	 * 
	 * description: beginning character of the string is from a to z
	 * 				the important thing is ^ live out side []
	 */
	public static void matchBeginningOfString() {
		
		Utils.printResult("are you feeling alright, Lucy ?", "^[a-z]");
		
	}	
	
	/**
	 * Level: basic
	 * 
	 * input: demo/contact/cfcs/api.cfc
	 * output: cfc
	 * 
	 * description: check if cfc display at the end of string
	 * 				learn how to use $
	 */
	public static void matchEndOfString() {
		
		Utils.printResult("demo/contact/cfcs/api.cfc", "cfc$");
		
	}	
	public static void main(String[] args) {
		matchBeginningOfString();
	}
}
