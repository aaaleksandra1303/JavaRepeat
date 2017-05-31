package Methods;

import java.util.Scanner;

public class Example4 {
	/*
	 * Zadanie4.
Napisz funkcję divide wyznaczającą iloraz dwóch zadanych liczb całkowitych. Działanie
funkcji sprawdź pisząc odpowiedni program.
Dla chętnych *- Napisz funkcję z obsługą błędów.
	 */

	
	int divide(int a,int b){
		
		
		int result=0;
		try{
		if(a==0||b==0){
			
			System.out.println("You can't divide by 0!!");
			
		}else{
			 result=a/b;
			 
		}
		
		
		}catch (NumberFormatException n){ System.out.println("Niepoprawne dane! " +
                "\n Który element tablicy chcesz zobaczyć: "+n);
		}
		return result;
	}
	
	
	public static void main(String[] args) {
		
		Example4 e4 = new Example4();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter two numbers:");
		
		int x=sc.nextInt();
		int y =sc.nextInt();
		
		System.out.println("The result is:"+e4.divide(x,y));
		sc.close();
	

	}

}
