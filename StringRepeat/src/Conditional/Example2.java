package Conditional;

import java.util.Scanner;

/*
 * Zadanie2.
Napisz program, który odczytuje 2 zmienne i zamienia je.
Dla chętnych: bez używania zmiennej pomocniczej.
 */


public class Example2 {

	public static void main(String[] args) {
	//v1 basic version
		System.out.println("v1- basic version");
		int a =1;
		int b =2;
		
		if(a!=b){
			int c=a;
			a=b;
			b=c;
		}else{
			System.out.println("The values of numbers are the same");
		
		}
		System.out.println("a="+a+",b="+b);
	
	
	//v2 with Scanner
		System.out.println("v2- with Scanner");
			Scanner sc = new Scanner(System.in);
			System.out.println("x=");
			int x=sc.nextInt();
			System.out.println("y=");
			int y=sc.nextInt();
			
			
			if(x!=y){
				int z=x;
				x=y;
				y=z;
			}else{
				System.out.println("The values of numbers are the same");
			
			}
			System.out.println("After changing,x="+x+",y="+y);
			
			sc.close();
			
	// v3 without Auxiliary variable
			System.out.println("v3- without auxilary variable");
			
			int m=1;
			int n=2;
			m=m+n;
			n=m-n;
			m=m-n;
			
			System.out.println("m="+m+",n="+n);
			
		
	//v4 with xor operator
			System.out.println("v4- with XOR operator");
			
			int o=1;
			int l=2;
			
			o=o^l;
			l=o^l;
			o=o^l;
			
			System.out.println("o="+o+",l="+l);
			
	}
}
