package edu.chai.set2;

import java.io.*;
import java.util.*;

public class ChainInspection1 {
	
	public static void main(String[] args) throws Exception
	{
		File file = new File("chain.txt");
		try (BufferedReader buffer = new BufferedReader(new FileReader(file)))
		{
			String s;
			while ((s = buffer.readLine()) != null)
			{
				s = s.trim();
				String[] pairs = s.split(";");

				Map<String, String> values = new HashMap<>();

				for (String pair : pairs)
				{
					String[] nodes = pair.split("-");
					
					values.put(nodes[0], nodes[1]);
				}
				
				int count = 0;
				String current = "BEGIN";

				while (!current.equals("END"))
				{
					current = values.get(current);
					count++;
					
					if (count > values.size())
					{
						break;
					}
				}

				System.out.println(count ==  values.size() ? "GOOD" : "BAD");
			}
		}
	}

}
