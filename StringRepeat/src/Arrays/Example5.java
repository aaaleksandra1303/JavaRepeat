package Arrays;

import java.util.Scanner;

public class Example5 {

	/*
	 * Zad5. Dla tablicy znaleźć jednocześnie minimum i maksimum tablicy.
	 */
	
	int minArrayValue(int[] array){
		int min=array[0];
		for(int i=0;i<=array.length-1;i++){
			
			if(array[i]<min){
				min=array[i];
				
			}
		}
		return min;
	}
	int maxArrayValue(int[] array){
		int max=array[0];
		for(int i=0;i<=array.length-1;i++){
			
			if(array[i]>max){
				max=array[i];
				
			}
		}
		return max;
		
	}
	public static void main(String[] args) {
	
		
Scanner sc= new Scanner(System.in);
		
		System.out.println("how many values");
		int n=sc.nextInt();
		
		int[] array = new int[n];
		
		System.out.println("Enter values:");
		for(int i=0;i<n;i++){
			array[i]=sc.nextInt();
		}
		
		Example5 e5 = new Example5();
		
		
		
		System.out.println("min number in array is "+e5.minArrayValue(array)+" and max value is : "+e5.maxArrayValue(array));
		
		sc.close();

	
		
		

	}

}
