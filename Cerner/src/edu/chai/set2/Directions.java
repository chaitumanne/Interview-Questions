package edu.chai.set2;

public class Directions {

	public static void main(String[] args){
		String input = "0 1 0 5";
		int O = Integer.parseInt(input.split(" ")[0]);
		int P = Integer.parseInt(input.split(" ")[1]);
		int Q = Integer.parseInt(input.split(" ")[2]);
		int R = Integer.parseInt(input.split(" ")[3]);
		if(O == Q && P == R)
			System.out.println("here");
		else if(O == Q && P < R)
			System.out.println("N");
		else if(O == Q && P > R)
			System.out.println("S");
		else if(O > Q && P == R)
			System.out.println("W");
		else if(O < Q && P == R)
			System.out.println("");
		else if(O > Q && P < R)
			System.out.println("NW");
		else if(O < Q && P > R)
			System.out.println("SE");
		else if(O > Q && P > R)
			System.out.println("SW");
		else if(O < Q && P < R)
			System.out.println("NE");
	}

}
