package com.tiennguyen.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
		
		String str = "here we go 123 ddd";
		Pattern pattern = Pattern.compile("[a-z&&[^d-f]]");
		Matcher matcher = pattern.matcher(str );
		while (matcher.find()) {
			System.out.print(matcher.group());
		}
		
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
		
		String str = "here we go 123 ddd";
		Pattern pattern = Pattern.compile("[a-z&&[d-f]]");
		Matcher matcher = pattern.matcher(str );
		while (matcher.find()) {
			System.out.print(matcher.group());
		}
		
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
		
		String str = "$1,223,444.11";
		Pattern pattern = Pattern.compile("[^0-9.]");
		Matcher matcher = pattern.matcher(str);
		while (matcher.find()) {
			System.out.print(matcher.group());
		}
		
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
		
		String str = "Give me a call - my number is 123-444-331";
		Pattern pattern = Pattern.compile("[0-9\\-]");
		Matcher matcher = pattern.matcher(str);
		while (matcher.find()) {
			System.out.print(matcher.group());
		}
		
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
		
		String str = "I have $9.95. Wow e";
		Pattern pattern = Pattern.compile("[a-z]");
		Matcher matcher = pattern.matcher(str);
		while (matcher.find()) {
			System.out.println(matcher.group());
		}
		
	}	
	
	/**
	 * Level: Basic
	 * 
	 * description: matches any character but number.
	 * 				Learn how to use "^" to define a negated set of characters
	 */
	public static void matchAnyCharacterButNumber() {
		
		String str = "I have $9.95. Wow";
		Pattern pattern = Pattern.compile("[^0-9]");
		Matcher matcher = pattern.matcher(str);
		while (matcher.find()) {
			System.out.println(matcher.group());
		}
		
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
		
		String str = "I have $9.95. Wow";
		Pattern pattern = Pattern.compile("\\$9\\.95");
		Matcher matcher = pattern.matcher(str);
		while (matcher.find()) {
			System.out.println(matcher.group());
		}
		
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
		
		String str = "I like cool words. Zoftig is a cool word.";
		Pattern pattern = Pattern.compile("word.");
		Matcher matcher = pattern.matcher(str);
		while (matcher.find()) {
			System.out.println(matcher.group());
		}
		
	}
	
	/**
	 * Level: Basic
	 * 
	 * input: I like watching benevolent Ben benchpress
	 * output: ben ben
	 */
	public static void patternToFilterLowerCaseStringFromParagraph() {
		
		String str = "I like watching benevolent Ben benchpress";
		Pattern pattern = Pattern.compile("ben");
		Matcher matcher = pattern.matcher(str);
		while (matcher.find()) {
			System.out.println(matcher.group());
		}
		
	}
	
	/**
	 * input: ZZZZL <%= dsn %> AFFF <%= AFG %>
	 * output: dsn AFG
	 */
	public static void patternToFilterInputParamFromTemplate() {
		
		String str = "ZZZZL <%= dsn %> AFFF <%= AFG %>";
		Pattern pattern = Pattern.compile("<%=(.*?)%>");
		Matcher matcher = pattern.matcher(str);
		while (matcher.find()) {
			System.out.println(matcher.group(1));
		}
		
	}
	
	
	public static void main(String[] args) {
		setsubtraction();
	}

}
