package Arrays;

import java.util.Scanner;

public class Example3 {
	/*
	 * Zad3. W Tablicy jednowymiarowej znaleźć liczbę , która występuje najczęściej.
	 */

	//TODO 
	///http://eduinf.waw.pl/inf/alg/001_search/0036.php
public static void main(String[] args) {
	
	int[] array;
	int[] values;
	int[] count;
	
	//Enter values to array
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter size of array ");
	int n = sc.nextInt();
	array = new int[n];
	 
		for (int i = 0; i < n; i++) {
			System.out.print("Enter value " + (i+1) + ": ");
			array[i] = sc.nextInt();
		}
	 
	values = new int[n];
	count = new int[n];
	int index = 0;
	int countValues = 0;
	 
		for (int i = 0; i < n; i++) {
			int temp = array[i];
	 
			for (int j = 0; j < n; j++) {
				if (values[j] == temp) {
					++count[j];
					break;
				}
				else if (j == n-1) {
					values[index] = temp;
					count[index] = 1;
					++index;
					++countValues;
				}
			}
		}
	 
		int dominant = 0;
		int counter = 1;
		for (int i = 1; i < countValues; i++) {
			if (count[i] > count[dominant]) {
				dominant = i;
				counter = 1;
			}
			else if(count[i] == count[dominant]) {
				++counter;
				}
		}
	 
		if (counter == 1) {
			System.out.println("Dominant is a number " + values[dominant] + ". Appeared " + count[dominant] + " times.");
		}
		else {
			System.out.println("Dominat doesn't exist");
		}
		
		sc.close();
	}
	
	
			
}
		
		
		
		
	
		
		
		
	


