package Methods;

import java.util.Scanner;

public class Example2 {

	/*
	 * Zadanie2.
Napisz funkcję substract wyznaczającą różnicę dwóch zadanych liczb całkowitych. Działanie
funkcji sprawdź pisząc odpowiedni program.
	 */
	
	 int substract(int a, int b){
		
		int substract=a-b;
		return substract;
	}
	
	
	public static void main(String[] args) {
		
		Example2 e2 = new Example2();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter two numbers:");
		
		int x=sc.nextInt();
		int y =sc.nextInt();
		
		System.out.println("The result is:"+e2.substract(x, y));
		sc.close();
	}

}
