package Conditional;

import java.util.Scanner;

public class Example8 {

	/*
	 * Zadanie8.
Napisz program, który oblicza silnię.
Dla chętnych: napisz silnię przy użyciu Lambdy.
	 */
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to calculate factorial:");
		int n=sc.nextInt();
		int factorial=1;
		
		if(n==0){
			factorial=1;
		}else if( n>=0){
			
			for(int i=1;i<=n; i++)
			{
				factorial=factorial*i;
				System.out.println(factorial);
			}
		}
		
		System.out.println("facrotial ="+factorial);
		sc.close();
		
		
	
	}
	
	

}
