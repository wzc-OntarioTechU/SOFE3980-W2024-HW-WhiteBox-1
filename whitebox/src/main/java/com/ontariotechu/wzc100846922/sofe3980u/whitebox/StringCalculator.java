package com.ontariotechu.wzc100846922.sofe3980u.whitebox;

public class StringCalculator {

	public static int occurances(char[] str, char target) {
		int count = 0;
		for (char i : str) {
			if (i == target)
				count++;
		}
		return count;
	}
	public static int occurances(String str, char target) {
		return occurances(str.toCharArray(), target);
	}
}
