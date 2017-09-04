package edu.chai.questions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RoughWork {

	public static void main(String[] args) throws IOException {
        solveChallenge(args);
    }

    private static void solveChallenge(String[] args) throws IOException {
        @SuppressWarnings("resource")
		BufferedReader reader = new BufferedReader(new FileReader("distance.txt"));
        String fileLine;
        //
        while ((fileLine = reader.readLine()) != null) {
            System.out.println(calculateDistance(fileLine));
        }
    }

    private static int calculateDistance(String fileLine) {
        int[] coords = extractCoords(fileLine);
        for(int i=0;i<coords.length;i++)
        	System.out.println("Points: "+coords[i]);
        int xDistance = Math.abs(coords[0] - coords[2]);
        int yDistance = Math.abs(coords[1] - coords[3]);

        return Double.valueOf(Math.sqrt((xDistance * xDistance) + (yDistance * yDistance))).intValue();
    }

    private static int[] extractCoords(String fileLine) {
        int[] result = new int[4];
        Pattern numbersPattern = Pattern.compile("-?\\d+");
        Matcher matcher = numbersPattern.matcher(fileLine);
        int pos = 0;
        while (matcher.find()) {
            result[pos++] = Integer.valueOf(matcher.group());
        }
        return result;
    }

}
