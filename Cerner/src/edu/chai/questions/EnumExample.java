package edu.chai.questions;

public class EnumExample {
	
	public static enum weeks {Sunday, Monday, Tuesday, Wednesday, Thrusday, Friday, Saturday}
	
	public static void main(String[] args) {
		String s  = weeks.Sunday.toString();
		System.out.println(s);
		System.out.println();
	}

}
