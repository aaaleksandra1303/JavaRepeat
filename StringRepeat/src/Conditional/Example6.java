package Conditional;

import java.util.Scanner;

public class Example6 {
/*
 * Zadanie6.
Stwórz program, który odczytuję daną liczbę i sprawdza czy jest podzielna przez 4.
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter some number");
		int number =sc.nextInt() ;
		if(number%4==0){
			
			System.out.println("the number divisilbe by 4 !");
		}else{
			System.out.println("the number indivisible by 4!");
		}
		sc.close();
	}

}
