package Methods;

import java.util.Scanner;

public class Example3 {

	/*
	 * Zadanie3.
Napisz funkcję multiply wyznaczającą iloczyn dwóch zadanych liczb całkowitych. Działanie
funkcji sprawdź pisząc odpowiedni program.
	 */
	
	int multiply(int a,int b){
		int multiply=a*b;
		return multiply;
	}
	
	public static void main(String[] args) {
		
		Example3 e3 = new Example3();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter two numbers:");
		
		int x=sc.nextInt();
		int y =sc.nextInt();
		
		System.out.println("The result is:"+e3.multiply(x,y));
		sc.close();
		
		
	}

}
