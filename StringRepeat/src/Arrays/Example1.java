package Arrays;

import java.util.Scanner;

public class Example1 {
/*
 * Zad1. Wprowadzić n liczb do jednowymiarowej tablicy i wyprowadź je w odwrotnej
kolejności.
 */
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("How many number would you like enter?");
		int n=sc.nextInt();
		
		System.out.println("Enter numbers");
		int[] array = new int[n];
		for(int i=0;i<n; i++){
			array[i]= sc.nextInt();
		}
		
		for(int i=n-1;i>=0;i--){
			System.out.print(array[i]+",");
		}
		
		System.out.println(array.length);
		System.out.println(n);
		sc.close();
		
	}

}
