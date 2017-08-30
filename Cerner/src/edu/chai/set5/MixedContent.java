package edu.chai.set5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MixedContent {

	public static void main (String[] args)
            throws IOException
    {
        @SuppressWarnings("resource")
		BufferedReader in = new BufferedReader(new FileReader("mixed.txt"));
        String s;
        while ((s = in.readLine()) != null) {
        	StringBuilder integers = new StringBuilder();
        	StringBuilder strings = new StringBuilder();
        	String[] arr = s.split(",");
        	for(int i =0;i<arr.length;i++) {
        		if(arr[i].matches("[0-9]+")) {
        			integers.append(arr[i]).append(",");
        		}
        		else
        			strings.append(arr[i]).append(",");
        	}
        	if(strings.length() > 0)
        		strings.deleteCharAt(strings.length()-1).append("|");
        	if(integers.length() > 0)
        		integers.deleteCharAt(integers.length()-1);
        	System.out.println(strings.append(integers));
        }
	}

}
