package Conditional;

import java.util.Scanner;

public class Example9 {
	/*
	 * Zadanie9.
Napisz program, który odczytuje dwie zmienne i na ekran wypisuje komunikat
sprawdzający czy obie zmienne są równe.
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
		if(sc.nextLine().equals(sc.nextLine())){
			System.out.println("the same");
		}else{
			System.out.println("diffrent!");
		}
		
		sc.close();
		

	}

}
