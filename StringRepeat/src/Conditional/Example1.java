package Conditional;

import java.util.Scanner;

public class Example1 {
	/*
	Napisz program, który deklaruje 2 zmienne całkowite i na ekran wypisuje ich sumę.
	 */
	
	public static void main(String[] args) {
		//version1
		
				int a=1;
				int b=2;
				int suma =a+b;
				
				System.out.println("Suma equals "+suma);
				
		// version2
				
				Scanner sc = new Scanner(System.in);
				System.out.println("Put first number:");
				int x = sc.nextInt();
				System.out.println("Put second number:");
				int y= sc.nextInt();
				System.out.println("Suma equals "+(x+y));
				sc.close();
				
				
		
		
	}

}
