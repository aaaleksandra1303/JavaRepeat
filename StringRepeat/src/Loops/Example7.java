package Loops;

import java.util.Scanner;

/*
 * Zadanie7.
Napisz program, który odczytuje liczbę i sprawdza ile dana liczba ma dzielników.
 */
public class Example7 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter some number:");
		int number=sc.nextInt();
		int suma=0;
		for(int i=1;i<=number;i++){
			
			if(number%i==0){
				suma=suma+1;
			}
			
		}
		System.out.println(number+" has a "+suma+" dividers!");
		sc.close();
	}

}
