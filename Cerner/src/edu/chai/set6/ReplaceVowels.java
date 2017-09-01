package edu.chai.set6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReplaceVowels {

	public static void main (String[] args)
            throws IOException
    {
        @SuppressWarnings("resource")
		BufferedReader in = new BufferedReader(new FileReader("vowels.txt"));
        String s;
        while ((s = in.readLine()) != null) {
        	System.out.println(s.replaceAll("[aeiou]", ""));
        }

	}

}
