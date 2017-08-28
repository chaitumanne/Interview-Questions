package edu.chai.set4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class HiddenNumber {

	public static void main (String[] args)
            throws IOException
    {
        @SuppressWarnings("resource")
		BufferedReader in = new BufferedReader(new FileReader("hidden.txt"));
        String s;
        while ((s = in.readLine()) != null) {
			String result = "";
			for (int i = 0; i < s.length(); i++) {
				char c = s.charAt(i); 
				if (c >= 'a' && c <= 'j') {
					result += c - 'a'; 
				} else if (c >= '0' && c <= '9') {
					result += c; 
				}
			}
			
			if (result.equals("")) {
				System.out.println("NONE");
			} else {
				System.out.println(result);
			}
		}
    }

}
