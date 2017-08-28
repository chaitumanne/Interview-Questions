package edu.chai.set3;

import java.util.*;

public class StackInterface1 {
	static List<Integer> list = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		
		String input = "10 -2 3 4";
		String output = "";
		String[] tempArr = input.split(" ");
		for(int i=0;i<tempArr.length;i++) {
			push(tempArr[i]);
		}
		for(int i=list.size()-1;i>=0;i--) {
			if(i%2 != 0) {
				output = output + list.get(i) +" ";
				pop(i);
			}
		}
		/*for(int n : list)
			output = output + n +" ";*/
		System.out.println(output.trim());
	}

	private static void push(String string) {
		list.add(Integer.parseInt(string));
	}
	
	private static void pop(int n) {
		list.remove(n);
	}


}
