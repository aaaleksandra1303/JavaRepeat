package Arrays;

import java.util.Scanner;

public class Example2 {
	/*
	 * Zad2. W Tablicy jednowymiarowej znaleźć liczbę minimalną ciągu.
	 */
	
	int minValue(int[] array){
		int min=array[0];
		for(int i=0;i<=array.length-1;i++){
			
			if(array[i]<min){
				min=array[i];
				
			}
		}
		return min;
		
	}

	public static void main(String[] args) {
		
		
		//int[] array= {1,4,3,5,9,2,0};
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("how many numbers?");
		int n=sc.nextInt();
		
		int[] array = new int[n];
		
		System.out.println("Enter numbers:");
		for(int i=0;i<n;i++){
			array[i]=sc.nextInt();
		}
		
		Example2 e2 = new Example2();
		
		
		
		System.out.println("min number in array is "+e2.minValue(array));
		
		sc.close();

	}

}
