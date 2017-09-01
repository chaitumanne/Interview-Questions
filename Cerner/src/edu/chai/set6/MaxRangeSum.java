package edu.chai.set6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MaxRangeSum {

	public static void main (String[] args)
            throws IOException
    {
        @SuppressWarnings("resource")
		BufferedReader in = new BufferedReader(new FileReader("maxrange.txt"));
        String s;
        while ((s = in.readLine()) != null) {
        	String[] arr = s.split(" ");
        	int[] integers = new int[arr.length];
        	int days = Integer.parseInt(arr[0]);
        	for(int i=0;i<arr.length;i++) {
        		integers[i] = Integer.parseInt(arr[i]);
        	}
        	int maxRangeSum = 0, sum = 0;
    		for (int i = 1; i < integers.length - days + 1; i++) {
    			for (int j = 0; j < days; j++) {
    				sum += integers[i + j];
    			}
    			if (sum > maxRangeSum) {
    				maxRangeSum = sum;
    			}
    			sum = 0;
    		}
    		System.out.println(maxRangeSum);
        }

	}

}
