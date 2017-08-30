package edu.chai.set5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class LowestUniqueNumber {

	public static void main (String[] args)
            throws IOException
    {
        @SuppressWarnings("resource")
		BufferedReader in = new BufferedReader(new FileReader("lowest.txt"));
        String s;
        while ((s = in.readLine()) != null) {
        	String[] arr = s.trim().split(" ");
        	HashMap<Integer,Integer> map = new HashMap<>();
        	for(String s1: arr) {
        		if(map.containsKey(Integer.parseInt(s1))) {
        			map.put(Integer.parseInt(s1), map.get(Integer.parseInt(s1))+1);
        		}
        		else {
        			map.put(Integer.parseInt(s1), 1);
        		}
        	}
        	int unique = 0;
        	for(int i: map.keySet()) {
        		if(map.get(i) == 1) {
        			unique = i;
        			break;
        		}
        	}
        	int position = 0;
        	for(int i=0;i<arr.length;i++) {
        		if(arr[i].equals(String.valueOf(unique))) {
        			position = i+1;
        			break;
        		}
        		else
        			position = 0;
        	}
        	System.out.println(position);
        }

	}

}
