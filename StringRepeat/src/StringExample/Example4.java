package StringExample;

import java.util.Scanner;

/*
 * Zadanie4. Odczytaj wyraz i sprawdź czy pierwszy znak Stringa to cyfra.
Dla przykładu:
0aSaaW odpowiedź to tak (pierwszy znak to 0)
Dla przykładu:
AssKkw odpowiedź to nie.
 */

public class Example4 {

	public static void main(String[] args) {


		System.out.println("Put some word");
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		
		char first = word.charAt(0);
		boolean isDigit;
		if(isDigit=(first>='0'&& first<='9')){
			System.out.println("yes the first char is number");
		
		}else{
			System.out.println("No, the first char isn't a number");
		}
		sc.close();
		

	}

}
