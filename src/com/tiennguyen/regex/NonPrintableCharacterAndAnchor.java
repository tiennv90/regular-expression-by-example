package com.tiennguyen.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
		
		String str = "Can you dance CanCan";
		Pattern pattern = Pattern.compile("\\bCan");
		Matcher matcher = pattern.matcher(str);
		while (matcher.find()) {
			System.out.print(matcher.group());
		}
		
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
		
		String str = "are you feeling alright, Lucy ?";
		Pattern pattern = Pattern.compile("^[a-z]");
		Matcher matcher = pattern.matcher(str);
		while (matcher.find()) {
			System.out.print(matcher.group());
		}
		
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
		
		String str = "demo/contact/cfcs/api.cfc";
		Pattern pattern = Pattern.compile("cfc$");
		Matcher matcher = pattern.matcher(str);
		while (matcher.find()) {
			System.out.print(matcher.group());
		}
		
	}	
	public static void main(String[] args) {
		matchBoundaryWords();
	}
}
