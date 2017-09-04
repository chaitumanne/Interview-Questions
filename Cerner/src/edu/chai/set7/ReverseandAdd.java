package edu.chai.set7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReverseandAdd {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("reverseadd.txt"));
		String s;
		while ((s = br.readLine()) != null) {
			s = s.trim();
			int count = 0;
			do {
				count++;
				StringBuilder number = new StringBuilder(s).reverse();
				long N = Long.parseLong(s) + Long.parseLong(number.toString());
				s = Long.toString(N);
			} while (!checkPalindrome(s));
			System.out.println(count + " " + s);
		}
	}

	public static boolean checkPalindrome(String s) {
		char[] arr = s.toCharArray();
		for (int i = 0; i < arr.length / 2; i++) {
			if (arr[i] != arr[arr.length - i - 1]) {
				return false;
			}
		}
		return true;
	}
}
