package edu.chai.set5;

import java.util.ArrayList;
import java.util.List;

public class NumberOperations1 {

	public static void main(String[] args) {
		ArrayList<Integer> numberList = new ArrayList<>();
        numberList.add(60);
        numberList.add(20);
        numberList.add(5);
        numberList.add(3);
        numberList.add(1);
        System.out.println(calcNumber(numberList));
    }

	public static boolean calcNumber(List<Integer> numbers){
        if(numbers.size()==1){
            if(numbers.get(0)==42){
                return true;
            }else{
                return false;
            }
        }
        int val1=numbers.get(0);
        int val2=numbers.get(1);
        return calcNumber(new ArrayList<Integer>(){/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

		{add(val1+val2);addAll(numbers.subList(2, numbers.size()));}}) ||
        calcNumber(new ArrayList<Integer>(){/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

		{add(val1-val2);addAll(numbers.subList(2, numbers.size()));}}) ||
        calcNumber(new ArrayList<Integer>(){/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

		{add(val1*val2);addAll(numbers.subList(2, numbers.size()));}});

	}

}
