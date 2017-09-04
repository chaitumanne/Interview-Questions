package edu.chai.set8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CalculateDistance {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("distance.txt"));
		String s;
		String patternString = "^\\(([\\d-]+), ([\\d-]+)\\) \\(([\\d-]+), ([-\\d]+)\\)$";
        Pattern pattern = Pattern.compile(patternString);
		while ((s = br.readLine()) != null) {
			System.out.println(s);
			Matcher m = pattern.matcher(s);
			if (m.matches()) {
                int x1 = Integer.parseInt(m.group(1));
                int y1 = Integer.parseInt(m.group(2));
                int x2 = Integer.parseInt(m.group(3));
                int y2 = Integer.parseInt(m.group(4));
                int xDiff = x1-x2;
                xDiff *= xDiff;
                int yDiff = y1-y2;
                yDiff *= yDiff;
                int distance = (int) Math.sqrt(xDiff + yDiff);
                System.out.println(distance);
            }
		}
	}

}
