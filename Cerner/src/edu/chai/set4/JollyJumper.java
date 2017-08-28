package edu.chai.set4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class JollyJumper {

	public static String isJollyJumper(int[] input) {
		
		List<Integer> tempArr = new ArrayList<Integer>();
		for(int i=0; i<input.length - 1;i++) {
			int diff  = Math.abs(input[i] - input[i+1]);
			/*if(diff == 0 || diff > input.length-1 ||tempArr.contains(diff) ) Without duplicates*/
			if(diff == 0 || diff > input.length-1)
				return "Not jolly";
			tempArr.add(diff);
		}
		return "Jolly";
	}
	
	public static void main(String[] args) throws IOException {

		FileReader file = new FileReader("test.txt");
		@SuppressWarnings("resource")
		BufferedReader br = new BufferedReader(file);
		String s = "";
		while((s = br.readLine()) != null ) {
			System.out.print(s + ": ");
			String[] lines = s.split(" ");
			int[] input = new int[lines.length];
			for(int i=0; i<input.length;i++) {
				input[i] = Integer.parseInt(lines[i]);
			}
			System.out.println(isJollyJumper(input));
		}
	}
}
