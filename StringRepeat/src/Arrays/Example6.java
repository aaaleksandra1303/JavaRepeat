package Arrays;

import java.util.Scanner;

public class Example6 {
	/*
	 * Zad11.Dana jest liczba naturalna n: 1..100, ciąg n liczb całkowitych oraz liczba całkowita k,
napisać program, który wyznaczy ilość wystąpień liczby k w podanym ciągu liczb.
	 */

	public static void main(String[] args) {
		int countValue=0;
		int n=0;
		int value;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Size of array: ");
		
		n= sc.nextInt();
		
		//create array
		int[] array= new int[n];
		// enter values to array
		System.out.println("Enter values to array:");
		for(int i=0;i<n;i++){
			System.out.println("Value "+(i+1)+ ":");
			array[i]=sc.nextInt();
		}
		
		System.out.println("Enter number which you want to check:");
	
		do{
		value=sc.nextInt();
		System.out.println("The entered value is not correct,try again!");
	
	
		}while(value<0&&value>100);
		value=sc.nextInt();
	
		
		if(value>0&&value<=100){
			for(int i=0;i<array.length;i++){
				
				if(array[i]==value){
					countValue++;
				}
			}
			System.out.println("Value "+value+" appears in array "+ countValue+" times.");

		}
		
		
		sc.close();
		
	}

}
