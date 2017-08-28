package edu.chai.set1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class _107ShortestRepetition {

	public static void main(String[] args) throws IOException {
		@SuppressWarnings("resource")
		BufferedReader in = new BufferedReader(new FileReader("107.txt"));
        String s;
        while((s = in.readLine()) != null){
        	System.out.println(shortRepeat(s));
        }
	}

	private static int shortRepeat(String string) {
		for (int i = 1; i < string.length(); i++) {
            if (string.length() % i == 0) {
                String substring = string.substring(0, i);
                if (string.matches("(" + substring + ")+")) {
                    return i;
                }
            }
        }
        return string.length();
	}

}
