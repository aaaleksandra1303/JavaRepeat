package Conditional;

import java.util.Scanner;

public class Example15 {
	public static void main(String[] args) {
		
		// sprawdz czy podane imie jest zenskie czy meskie
		
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your name");
		String name=sc.next();
		
		name=name.toLowerCase();
		if(name.endsWith("a")){
			System.out.println("it's a womens name");
				
		}else{
			System.out.println("it's a mens name");
		}
		
		sc.close();
		
	
	}

}
