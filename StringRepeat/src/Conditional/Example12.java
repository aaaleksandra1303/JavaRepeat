package Conditional;

import java.util.Scanner;

public class Example12 {
/*
 * Zadanie12.
Napisz program, który odczytuje napis i wypisuje go wspak.
 */
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter some word");
		String word =sc.nextLine();
		
		for(int i=0;i<=word.length()-1;i++){
			char letter = word.charAt(i);
			System.out.println(letter);
		}
		
		sc.close();
	}

}
