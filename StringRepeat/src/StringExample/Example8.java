package StringExample;

import java.util.Scanner;

/*
 *Zadanie8. Odczytaj 2 wyrazy i sprawdź czy wprowadzone wyrazy są równe.
Dla wywołania:
Ala
Ala
Wynikiem powinno być tak.
Dla wywołania:
Ala
Sak
Wynikiem powinno być nie.
 */

public class Example8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Put first word");
		String word1=sc.nextLine();
		System.out.println("Put second word");
		String word2 = sc.nextLine();
		
		//word1.toUpperCase();
		//word2.toUpperCase();
		
		if(word1.toUpperCase().equals(word2.toUpperCase())){
			System.out.println("Yes, words are the same");
		}else{
			System.out.println("No, words are NOT the same");
		}
		
		sc.close();

	}

}
