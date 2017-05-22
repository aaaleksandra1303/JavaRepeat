package Conditional;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Example5 {

	/*
	 * Zadanie5.
Stwórz program, który odczytuje wiek danej osoby i wypisuję na ekran komunikat
czy dana osoba jest pełnoletnia czy niepełnoletnia.
Dla chętnych: stwórz obsługę sytuacji, gdy podane są niepoprawne dane.
Dla chętnych: dodaj obsługę wyjątków
	 */
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age:");
		int age;
		
		 try {
			 age = sc.nextInt();
			 if(age<=0){
					System.out.println("Your age is not correct!");
				}else if(age>=18){
					System.out.println("You are mature!");
				}else
				{
					System.out.println("You are not mature!");
				}
			 
			 
	        } catch (NumberFormatException n){ System.out.println("Niepoprawne dane! " +
	                "\n Który element tablicy chcesz zobaczyć: "+n);
	          }catch ( InputMismatchException m){System.out.println("Niepoprawne dane! " +
		                "\n Który element tablicy chcesz zobaczyć: "+m);
	        	  
	          }
		 
		 sc.close();
	 	

	}

}
