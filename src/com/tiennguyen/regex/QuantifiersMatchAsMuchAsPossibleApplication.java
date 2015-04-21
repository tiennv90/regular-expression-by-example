package com.tiennguyen.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * @author tien.nv
 * Match as much as possible before fail
 */
public class QuantifiersMatchAsMuchAsPossibleApplication {

	/**
	 * Level: basic
	 * 
	 * input: Hey there are <em>baby cakes</em>
	 * output: <em>baby cakes</em>
	 * 
	 * description: 
	 * 				
	 */
	public static void lazyQuantifierExample1() {
		
		String str = "Hey there are <em>baby cakes</em>";
		Pattern pattern = Pattern.compile("<.+>");
		Matcher matcher = pattern.matcher(str );
		while (matcher.find()) {
			System.out.print(matcher.group());
		}
		
	}	
	
	
	/**
	 * Level: basic
	 * 
	 * input: Hey there are <em>baby cakes</em>
	 * output: <em></em>
	 * 
	 * description: 
	 * 				
	 */
	public static void lazyQuantifierExample2() {
		
		String str = "Hey there are <em>baby cakes</em>";
		Pattern pattern = Pattern.compile("<.+?>");
		Matcher matcher = pattern.matcher(str );
		while (matcher.find()) {
			System.out.print(matcher.group());
		}
		
	}
	
	public static void main(String[] args) {
		lazyQuantifierExample2();
	}

}
