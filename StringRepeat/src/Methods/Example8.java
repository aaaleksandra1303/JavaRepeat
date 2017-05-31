package Methods;

import java.util.Scanner;

public class Example8 {
/*
 * Zadanie8. Napisz funkcję, która stwierdza, czy zadana jako parametr liczba całkowita jest
liczbą pierwszą.
 */
	
	String isPrime(int n){
		int sum=0;
		String result=null;
		if(n%n==0){
			for(int i=2;i<=9;i++){
				if(n!=i&n%i==0){
					 sum=sum+1;
					 System.out.println(sum);
				}
			}
			if(sum!=0){
				result="is not a prime number";
			}else{
				result="is a prime number";
			}
	}
		return result;
	}
		
	
	public static void main(String[] args) {
		Example8 e8=new Example8();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();
		
		
		System.out.println(e8.isPrime(n));
		sc.close();
	}

}
