package edu.chai.set1;

public class AmstrongNumber {

	public static void main(String[] args) {
		
		int sum = 0;
		String s = "408";
		for(int i=0;i<s.length();i++) {
			sum = (int) (sum + Math.pow(Integer.parseInt(String.valueOf(s.charAt(i))), 3));
		}
		if(s.equals(String.valueOf(sum)))
			System.out.println("Amstrong");
		else
			System.out.println("Not a Amstrong");
	}
}
