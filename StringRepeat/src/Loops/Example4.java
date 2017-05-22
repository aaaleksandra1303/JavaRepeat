package Loops;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Zadanie4. Napisz program, który sprawdza czy dany odczytany napis jest w
poprawnym formacie kodu pocztowego tzn: 87-630 jest w formacie poprawnym,
natomiast 8aa-999 jest niepoprawnym kodem pocztowym ( dwie pierwsze cyfry
następni myślnik, następnie trzy cyfry).
 */
public class Example4 {
	public static void main(String[] args) {
	
	
	String regex="[0-9]{2}-[0-9]{3}" ;   ///"\d{2}-\d{3}"
	Pattern patern =Pattern.compile(regex);
	
	Scanner sc= new Scanner(System.in);
	
	
	
	
	Matcher matcher;
	
	do{
		System.out.println("Enter postcode in format xx-xxx");
		String postcode=sc.next();
		matcher=patern.matcher(postcode); // check if the enter word is the same like pattern
		if(matcher.matches()==true){ 
			System.out.println("bravo, your postcode is correct!");
		}else{
			System.out.println("Sorry, the postcode is not valid, try again");
		}
		
	}while(matcher.matches()==false);
	
	sc.close();
	
	//System.out.println(matcher.matches());
	//matcher.matches() return true if the word is the same or false if not
	

	}

}
