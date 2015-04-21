package com.tiennguyen.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
		
		String str = "my number is 999-09-21-1980";
		Pattern pattern = Pattern.compile("[\\w\\W]");
		Matcher matcher = pattern.matcher(str );
		while (matcher.find()) {
			System.out.print(matcher.group());
		}
		
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
		
		String str = "my number is 999-09-21-1980";
		Pattern pattern = Pattern.compile("\\d\\d-\\d\\d-\\d\\d\\d\\d");
		Matcher matcher = pattern.matcher(str );
		while (matcher.find()) {
			System.out.print(matcher.group());
		}
		
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
		
		String str = "$1,223,444.11";
		Pattern pattern = Pattern.compile("[^\\d.]");
		Matcher matcher = pattern.matcher(str);
		while (matcher.find()) {
			System.out.print(matcher.group());
		}
		
	}	
	
	
	public static void main(String[] args) {
		matchAnything();
	}

}
