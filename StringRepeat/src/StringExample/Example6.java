package StringExample;

import java.util.Scanner;
/*Zadanie6. Odczytaj imię i nazwisko danej osoby, na ekran wypisz imię i
nazwisko razem.
Dla wprowadzonych danych:
Adam Kowalski
Prawidłowa odpowiedź to:
Twoje imię i nazwisko to Adam Kowalski 
*/

public class Example6 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Put your name");
		String name= sc.nextLine();
		System.out.println("Put your surname");
		String surname =sc.nextLine();
		
		
		System.out.println("Your name and surname is "+ name+" "+surname);
		
		// with StringBuilder
		
		StringBuilder strBname=new StringBuilder(name);
		strBname.append(" "+surname);
		System.out.println(strBname);
		
		

		
		sc.close();
	}

}
