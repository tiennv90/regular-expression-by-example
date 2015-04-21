package com.tiennguyen.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * @author tien.nv
 * How much to match ?
 */
public class QuantifiersApplication {

	
	/**
	 * Level: basic
	 * 
	 * input: say it with <em> style </em>
	 * output: <em><sad>
	 * 
	 * description: Match word characters
	 * 				Learn how to use \w+ to match word character
	 * 				'+' mean one or more
	 */
	public static void matchWordCharacters() {
		
		String str = "say it with <em> style </em> <sad></sad>";
		Pattern pattern = Pattern.compile("<\\w+>");
		Matcher matcher = pattern.matcher(str);
		while (matcher.find()) {
			System.out.print(matcher.group());
		}
		
	}
	
	/**
	 * Level: basic
	 * 
	 * input: Is that a dog? Dogs are cool!
	 * output: dog Dogs
	 * 
	 * description: Match word characters
	 * 				Learn how to use ? as an optional
	 * 				? mean zero or one
	 */
	public static void howToUseQuestionMark() {
		
		String str = "Is that a dog? Dogs are cool!";
		Pattern pattern = Pattern.compile("[Dd]ogs?");
		Matcher matcher = pattern.matcher(str);
		while (matcher.find()) {
			System.out.print(matcher.group());
		}
		
	}
	
	/**
	 * Level: basic
	 * 
	 * input: If i was born on 03/01/2009, I'd be 2
	 * output: 03 01 2009
	 * 
	 * description: Match word characters
	 * 				Learn how to use {N,M} (between N and M match)
	 */
	public static void howToUseMatchBetweenNAndM() {
		
		String str = "If i was born on 03/01/2009, I'd be 2";
		Pattern pattern = Pattern.compile("\\d{2,4}");
		Matcher matcher = pattern.matcher(str);
		while (matcher.find()) {
			System.out.print(matcher.group());
		}
		
	}
	
	public static void main(String[] args) {
		howToUseMatchBetweenNAndM();
	}

}
