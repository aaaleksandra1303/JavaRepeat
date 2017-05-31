package Arrays;

import java.util.Scanner;

public class Example7 {
	/*
	 * Zad12. Wprowadzić liczby do dwuwymiarowej tablicy liczb o wymiarach n wierszy i m
kolumn (n i m zadeklarowane jako stałe w programie) oraz obliczyć sumę wyrazów w tablicy.
Znaleźć minimum i maksimum w wierszach tablicy dwuwymiarowej.

Zad13.Obliczyć dla tablicy kwadratowej: - sumę wszystkich elementów
	 */
	

	
	int minArray2D(int[][] array)
	{
		
		int min =array[0][0];
	
		for(int i=0;i<array.length;i++){ //wiersze
			for(int j=0;j<array[i].length;j++) //kolumny
			{
				if(min>array[i][j])
				{
					min=array[i][j];
				}
			
			}
		}
		
		return min;
		
	}
	
	int maxArray2D(int[][] array){
		int max=array[0][0];
		
		
		for(int i=0;i<array.length;i++){ //wiersze
			for(int j=0;j<array[i].length;j++) //kolumny
			{
				
				if( max<array[i][j]){
					max=array[i][j];
				}
			}
		}
		return max;
	}
	
	int sumaArray2D(int[][] array){
		int suma=0;
		
		for(int i=0;i<array.length;i++){ //wiersze
			for(int j=0;j<array[i].length;j++) //kolumny
			{
				suma = suma+array[i][j];
				
			}
		}
		return suma;
		
	}
	public static void main(String[] args) {
		//Example for kquadrat array
		
		//wxk
		int n=10;
		int m=10;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter array size");
		//System.out.println("n:"+(n=sc.nextInt()));
		//System.out.println("m: " +(m=sc.nextInt()));
		n=sc.nextInt();
		m=sc.nextInt();
		
		
		
		//create array
		int[][] array= new int[n][m];
		
		System.out.println("Enter values to array:");
		for(int i=0;i<n;i++){ //wiersze
			for(int j=0;j<m;j++) //kolumny
			{
				array[i][j]=sc.nextInt();
				
			}
		}
		
		if(n==10&&m==10){
			
			//enter values 1 to 100;
			for(int[] array1D:array){
				for(int number:array1D){
					if(number<10){
						System.out.println("0"+number+",");
					}else
						System.out.println(number+",");
						
				}
				System.out.println(""); 
				 //after every 10 number create new line
			}
		
		}else{
			for(int[] array1D:array){
				for(int number:array1D){
					if(number<m){
						System.out.println("0"+number+",");
					}else
						System.out.println(number+",");
						
				}
				System.out.println(""); 
				 //after every 10 number create new line
			}
			
			
		}
		
		Example7 e7= new Example7();
		int max =e7.maxArray2D(array);
		int min=e7.minArray2D(array);
		int suma=e7.sumaArray2D(array);
		
	
		System.out.println("min: "+min+",max: "+max+",suma: "+suma);

	
		sc.close();
	
	}

}
