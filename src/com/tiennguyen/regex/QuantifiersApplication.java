package com.tiennguyen.regex;

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
		
		Utils.printResult("say it with <em> style </em> <sad></sad>", "<\\w+>");
		
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
		
		Utils.printResult("Is that a dog? Dogs are cool!", "[Dd]ogs?");
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
		
		Utils.printResult("If i was born on 03/01/2009, I'd be 2", "\\d{2,4}");
		
	}
	
	public static void main(String[] args) {
		howToUseMatchBetweenNAndM();
	}

}
