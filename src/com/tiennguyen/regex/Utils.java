package com.tiennguyen.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utils {
	
	public static void printResult(String text, String patternString) {
		Pattern pattern = Pattern.compile(patternString);
		Matcher matcher = pattern.matcher(text);
		while (matcher.find()) {
			System.out.print(matcher.group());
		}
	}
	
}
