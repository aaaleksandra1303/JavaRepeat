package Conditional;

import java.util.Scanner;

public class Example14 {
/*
 * Zadanie14.
Napisz program, który odczytuje dany wyraz z konsoli tak długo aż natrafi na
poprawnie wprowadzone hasło.
 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		String password = "ola";
		String correctPassword=null;

		boolean isCorrect=false;

		while(isCorrect==false){
			System.out.println("Enter correct password");
			correctPassword=sc.nextLine();
			if(correctPassword.equals(password)==true){
				isCorrect=true;
				System.out.println("bravo!");
			}	
		}
		System.out.println("Your password is correct!");
		
		
		sc.close();
		

	}

}
