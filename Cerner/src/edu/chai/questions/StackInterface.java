package edu.chai.questions;


public class StackInterface {
	
	public static String myStack(String input) {
		
		String output = "";
		String[] tempArr = input.trim().split(" ");
		for(int i=tempArr.length-1;i>=0;i--) {
			if(i%2 != 0) {
				output = output + push(tempArr[i]);
				//System.out.println(output);
			}
			else
				output = output + pop(tempArr[i]);
			//System.out.println(output);
		}
		return output.trim();
	}

	static String pop(String s) {
		return "";
	}

	static String push(String s) {
		return s + " ";
	}

	public static void main(String[] args) {

		String input = "1 2 1 4 5";
		System.out.println(myStack(input));
	}

}
