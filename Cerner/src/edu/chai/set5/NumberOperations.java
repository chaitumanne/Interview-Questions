package edu.chai.set5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class NumberOperations {

	public static void main(String[] args) throws Exception
	{
		try (BufferedReader buffer = new BufferedReader(new FileReader("operations.txt")))
		{
			String s;
			while ((s = buffer.readLine()) != null)
			{
				String[] arr = s.trim().split(" ");
				List<Integer> numbers = new ArrayList<>();
				for (String numberText : arr)
				{
					numbers.add(Integer.valueOf(numberText));
				}
				List<List<Integer>> permutations = new ArrayList<>();
				getPermutations(permutations, numbers, new ArrayList<Integer>());
				boolean canReach42 = false;
				for (List<Integer> shuffled : permutations)
				{
					if(doMaths(shuffled.get(0), shuffled, 1))
					{
						canReach42 = true;
						break;
					}
				}

				System.out.println(canReach42 ? "YES" : "NO");
			}
		}
	}

	private static void getPermutations(List<List<Integer>> permutations, List<Integer> remainingNumbers, List<Integer> current)
	{
		for (Integer number : remainingNumbers)
		{
			List<Integer> copyOfRemainingNumbers = new ArrayList<>(remainingNumbers);
			copyOfRemainingNumbers.remove(number);

			List<Integer> copyOfCurrent = new ArrayList<>(current);
			copyOfCurrent.add(number);

			if (copyOfRemainingNumbers.size() == 0)
			{
				permutations.add(copyOfCurrent);
			}
			else
			{
				getPermutations(permutations, copyOfRemainingNumbers, copyOfCurrent);
			}
		}
	}

	private static boolean doMaths(Integer current, List<Integer> numbers, int offset)
	{
		if (offset == numbers.size())
		{
			return current.equals(42);
		}

		return doMaths(current + numbers.get(offset), numbers, offset + 1)
				|| doMaths(current - numbers.get(offset), numbers, offset + 1)
				|| doMaths(current * numbers.get(offset), numbers, offset + 1);
	}}
