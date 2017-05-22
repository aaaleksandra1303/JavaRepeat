package Conditional;

import java.util.Scanner;

public class Example10 {
	/*
	 * Napisz program, który odczytuję imię i wypisuję na ekran ostatnią literę imienia.
	 */

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your name:");
		String name= sc.nextLine();
		
		char lastLetter= name.charAt(name.length()-1);
		System.out.println("The last letter of name "+name +" is "+"\""+lastLetter+"\"");
		sc.close();
		
		
		
		
		

	}

}
