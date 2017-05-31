package Arrays;

import java.util.Scanner;

public class Example4 {
	/*
	 * Zad4. Dla danej tablicy obliczyć średnią arytmetyczną, sumę ciągu.
	 */

	
	int avgCalc(int[] array){
		
		int suma=0;
		int avg=0;
		
		for(int i=0;i<array.length;i++){
			suma=suma+array[i];
		}
		
		
		avg=suma/array.length;
		
		return avg;
	}
	public static void main(String[] args) {
	
		Scanner sc= new Scanner(System.in);
		System.out.println("How many values?");
		int n = sc.nextInt();
		System.out.println("Enter values");
		
		int[] array= new int[n];
		
		for(int i=0;i<array.length;i++){
			array[i]=sc.nextInt();
		}
		
		
		Example4 e4 = new Example4();
		
		System.out.println("Average value is:"+e4.avgCalc(array));

		sc.close();
	}

}
