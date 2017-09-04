package edu.chai.set7;

public class ReverseWords {

	public static void main(String[] args) {
		String s = "Hello how are you";
		String[] arr = s.split(" ");
		String out = "";
		for(int i=arr.length-1;i>=0;i--) {
			out = out + arr[i] + " ";
		}
		System.out.println(out.trim());
	}

}
