package StringExample;

import java.util.Scanner;

/*
 * 
 * Zadanie3. Odczytaj wyraz i sprawdź czy ostatnia litera to M bądź m .
Dla wyrazu:
AssM odpowiedź tak
Dla wyrazu:
Assm odpowiedź to tak
Dla wyrazu:
Wssa odpowiedź to nie.
 * */

public class Example3 {

	public static void main(String[] args) {
	
		System.out.println("Put the word");
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		
		if(word.endsWith("m")|| word.endsWith("M")){
			System.out.println("yes!");
		}else{
			System.out.println("no!");
		}
		

	}

}
