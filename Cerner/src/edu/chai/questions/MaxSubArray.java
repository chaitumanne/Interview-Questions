package edu.chai.questions;

import java.io.*;
import java.util.Arrays;

public class MaxSubArray {

	public static void main(String[] args) throws Exception {
		
		File file = new File("test1.txt");
		@SuppressWarnings("resource")
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			String[] numbers = line.split(",");
			int[] sums = new int[(numbers.length + 1) * numbers.length / 2];
			int l = 0;
			for (int i = 0; i < numbers.length; i++) {
				for (int j = 0; j < numbers.length - i; j++) {
					int sum = 0;
					for (int k = i; k <= j + i; k++)
						sum += Integer.parseInt(numbers[k]);
					sums[l++] = sum;
				}
			}
			Arrays.sort(sums);
			System.out.println(sums[sums.length - 1]);
		}
	}

}
