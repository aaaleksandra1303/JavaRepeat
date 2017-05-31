package Methods;

import java.util.Scanner;

public class Example7 {
	/*
	 * Zadanie7.
Napisz funkcję, która stwierdza, czy zadana jako parametr liczba całkowita jest kwadratem
pewnej liczby całkowitej. Liczby będące kwadratami liczb całkowitych to 1, 4, 9, 16 itd.
Wartością funkcji ma być prawda, jeśli liczba spełnia warunek oraz fałsz w przeciwnym
wypadku.
	 */
	
	boolean isQuadrat(int n){
		boolean isQ=false;
		if(Math.pow(Math.sqrt(n), 2)==n){
			isQ=true;
			System.out.println("The number is a quadrat!");
		}else{
			System.out.println("The number is not a quadrat!");
		}
		return isQ;
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Example7 e7= new Example7();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();
		
		e7.isQuadrat(n);
		sc.close();
		
		
	}

}
