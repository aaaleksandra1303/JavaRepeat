package Methods;

import java.util.Scanner;

public class Example1 {
	
	/*
	 * Zadanie1.
Napisz funkcję add wyznaczającą sumę dwóch zadanych liczb całkowitych. Napisz program
wykorzystujący funkcję add.
	 */


	
	 int add(int a,int b){
		int suma= a+b;
		return suma;
		
	}
	
	public static void main(String[] args) {
	 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers!");
		int x=sc.nextInt();
		int y=sc.nextInt();
		Example1 e1= new Example1();
	 System.out.println("The sum is " +e1.add(x,y));
	 
	 sc.close();
	}

}
