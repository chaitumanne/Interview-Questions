package edu.chai.set4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JSONMenuIDs {

	public static void main (String[] args)
            throws IOException
    {
        @SuppressWarnings("resource")
		BufferedReader in = new BufferedReader(new FileReader("json.txt"));
        String s;
        while ((s = in.readLine()) != null) {
            s = s.trim();
            if (s.length() == 0) {
                continue;
            }
            int sum = 0;
            Pattern p = Pattern.compile("\"id\": (\\d+), \"label\"");
            Matcher m = p.matcher(s);
            while (m.find()) {
                sum += Integer.parseInt(m.group(1));
            }
            System.out.println(sum);
        }
    }

}
