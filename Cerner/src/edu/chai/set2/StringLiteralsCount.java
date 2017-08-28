package edu.chai.set2;

import java.util.*;

public class StringLiteralsCount {

	public static void main(String[] args) {

		String s = "abdbcccddd";
		String output = "";
		int count;
		char[] inputArr = s.trim().toCharArray();
		Arrays.sort(inputArr);
		for(int i=0;i<inputArr.length;i++) {
			output = output+inputArr[i];
		}
		System.out.println(output);
		/*TreeMap<Character, Integer> temp = new TreeMap<Character, Integer>();
		for(char c: inputArr) {
			if(temp.containsKey(c)) {
				temp.put(c,	temp.get(c)+1);
			}
			else {
				temp.put(c, 1);
			}
		}
		System.out.println(temp);*/
		String out = "";
		for(int i=0;i<output.length();i++) {
			count = 0;
			for(int j=0;j<output.length();j++) {
				if(output.charAt(i) == output.charAt(j))
					count++;
			}
			if(!out.contains(output.substring(i,i+1)))
			out = out + output.charAt(i) +""+count;
		}
		System.out.println(out);
	}

}
