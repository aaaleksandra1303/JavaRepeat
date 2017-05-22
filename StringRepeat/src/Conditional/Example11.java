package Conditional;

import java.util.Scanner;

public class Example11 {
	/*
	 * Zadanie11 .
Napisz program, który odczytuje imię i sprawdza czy jest ono palindromem.
	 */

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name");
		String name =sc.nextLine();
		
		StringBuilder builder = new StringBuilder(name);
		
		String nameRevers=  (builder.reverse()).toString();
		name=name.toUpperCase();
		nameRevers.toUpperCase();
		
		if(name.equals(nameRevers)){
			System.out.println(" The name is a palindrom");
		}else{
			System.out.println("The name is not a palindrom");
		}
		
		sc.close();
		
	}

}
