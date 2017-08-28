package edu.chai.questions;

import java.util.*;

public class ArrayCommonElements {

	public static void main(String[] args) {
		
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		ArrayList<Integer> arr2 = new ArrayList<Integer>();
		arr1.add(2);
		arr1.add(1);
		arr1.add(3);
		arr2.add(2);
		arr2.add(3);
		arr2.add(4);
		ArrayList<Integer> out = new ArrayList<Integer>(arr1);
		arr1.removeAll(arr2);
		arr2.removeAll(out);
		System.out.print(arr1 +" "+ arr2 + " with size: ");
		System.out.println(arr1.size() + arr2.size()); 
	}

}
