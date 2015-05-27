package com.tiennguyen.regex;

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
		
		Utils.printResult("Hey there are <em>baby cakes</em>", "<.+>");
		
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
		
		Utils.printResult("Hey there are <em>baby cakes</em>", "<.+?>");
		
	}
	
	public static void main(String[] args) {
		lazyQuantifierExample1();
	}

}
