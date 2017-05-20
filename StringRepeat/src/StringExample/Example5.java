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
		
		
		//with using StringBuilder if we want change something later or use other methods ex.reverse
		// palindom
		
		System.out.println("Put nex word");
		String word2 = sc.nextLine();
		StringBuilder nameBuilder = new StringBuilder(word2);
		//StringBuilder nameBulder2 =nameBuilder1.reverse();
		String name = nameBuilder.toString();
		String nameReverse =nameBuilder.reverse().toString();
		name.toUpperCase();
		nameReverse.toUpperCase();
		
		
		
		
		if(name.equals(nameReverse)){
			System.out.println("The word is a palindrom");
		}else{
			System.out.println("The word is not a palindorm");
		}
		
		
	
		sc.close();
	}

}
