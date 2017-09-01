package edu.chai.set6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MinimumCoins {

	public static void main (String[] args)
            throws IOException
    {
        @SuppressWarnings("resource")
		BufferedReader in = new BufferedReader(new FileReader("coins.txt"));
        String s;
        while ((s = in.readLine()) != null) {
        	int total = Integer.parseInt(s);
        	int five = total / 5;
        	total -= five * 5;
        	int three = total / 3;
        	total -= three * 3;
        	int one = total;
        	System.out.println(five + three + one);
        }

	}

}
