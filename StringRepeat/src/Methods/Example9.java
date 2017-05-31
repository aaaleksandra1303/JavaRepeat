package Methods;

import java.util.Scanner;

public class Example9 {

	/*
	 * Zadanie9. Napisz funkcję, która stwierdza, czy zadana jako parametr liczba całkowita jest
sześcianem pewnej liczby naturalnej.
	 */
	
	
	//TODO sprawdzic warunek!
	String isCube(int n){
		
		String result=null;
		
		if(Math.pow(Math.pow(n, 1/3.0),3)==n){
			
			result ="The number is a cube!";
		}else{
			result="The number is not a cube!";
		}
		
		
		
		return result;
		
	}
	
	
	
	public static void main(String[] args) {
		
		Example9 e9=new Example9();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number");
		
		int n=sc.nextInt();
		
		System.out.println(e9.isCube(n));
		sc.close();
		
		
			
			
		

	}

}
