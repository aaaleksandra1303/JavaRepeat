package Conditional;

import java.util.Scanner;

public class Example13 {
/*
 * Zadanie13.
Napisz program, który wypisuje co drugą literę imienia.
 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		String name= sc.nextLine();
		
		
		for(int i=0;i<=name.length()-1;i=i+2){
			char letter = name.charAt(i);
			
			System.out.print(letter);
		}
		
		sc.close();

	}

}
