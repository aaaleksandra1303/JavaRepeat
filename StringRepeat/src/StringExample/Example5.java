package StringExample;

import java.util.Scanner;

/*
 * Zadanie5. Odczytaj wprowadzony wyraz przez użytkowika i sprawdź czy
pierwsza litera wyrazu jest taka sama jak ostatnia. Wypisz odpowiedni
komunikat.
 */

public class Example5 {

	public static void main(String[] args) {
		System.out.println("Put some word");
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		word=word.toUpperCase();
		
		if(word.charAt(0)==word.charAt(word.length()-1)){
			System.out.println("The first and the last letter are the same in the word "+word);
		}else{
			
			System.out.println("The first and the last letter different in the word "+word);
		}
		
	
		sc.close();
	}

}
