package edu.chai.set7;

public class LastNextWord {

	public static void main(String[] args) {
		String s  = "Hello Code Eval";
		String[] arr = s.split(" ");
		System.out.println(s.split(" ")[arr.length -2]);
	}

}
