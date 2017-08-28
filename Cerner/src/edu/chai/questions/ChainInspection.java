package edu.chai.questions;

import java.util.*;
import java.util.Map.Entry;

public class ChainInspection {

	public static void main(String[] args) {

		String input = "BEGIN-3;4-2;3-3;2-END";
		String[] tempArr = input.split(";");
		for(int i=0;i<tempArr.length;i++)
			System.out.print(tempArr[i] + "  ");
		System.out.println();
		Map<String,String> map = new HashMap<String,String>();
		for(String s: tempArr) {
			String[] elements = s.split("-");
			map.put(elements[0], elements[1]);
			/*for(int i=0;i<elements.length;i++)
				System.out.print(elements[i]+"");*/
			/*if(elements[0].equals(elements[1]))
				System.out.println("bad");*/
		}
		System.out.println(map.entrySet());
		for(Entry<String, String> s: map.entrySet()) {
			if(s.getKey().equals(s.getValue()))
				System.out.println("bad");
			else if(map.get("BEGIN") != null) {
				System.out.println(map.get("BEGIN"));
			}
		}
	}

}
