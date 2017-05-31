package Methods;

import java.util.Scanner;

public class Example5 {
	/*
	 * Zadanie5.
Napisz funkcję, która ma trzy parametry formalne a, b, c będące liczbami całkowitymi.
Funkcja zwraca prawdę, jeśli zadane liczby są liczbami pitagorejskimi oraz fałsz w
przeciwnym wypadku. Liczby pitagorejskie spełniają warunek: a*a+b*b=c*c.
	 */

	boolean isPitagorian(int a,int b,int c){
		
		boolean isPitagorian=false;
		
		if((a*a+b*b==c*c)){
			isPitagorian=true;
			System.out.println("These numbers are pitagorian");
		}else{
			isPitagorian=false;
			System.out.println("These numbers aren't pitagorian");
		}
		
		return isPitagorian;
		
	}
	public static void main(String[] args) {
		
		Example5 e5 = new Example5();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		e5.isPitagorian(a, b, c);
		
		sc.close();
		
		
		

	}

}
