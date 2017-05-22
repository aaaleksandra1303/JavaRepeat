package Loops;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example5 {
	/*
	 * Zadanie5. Stwórz program, który sprawdza czy wprowadzone imię jest męskie czy
żeńskie.
	 */

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String name;
		String regex="[a-zA-Z]*";
		Pattern pattern = Pattern.compile(regex);
		
		Matcher matcher;
		//System.out.println(matcher.matches());
		
	
	
			do{
				System.out.println("Enter your name");
				name=sc.nextLine();
				matcher = pattern.matcher(name);
				
				if(matcher.matches()==true){ 
					name=name.toUpperCase();
					
					if(name.endsWith("A")){
						System.out.println("You are a women");
					}else{
						System.out.println("You are a man");
					}
					
					
				}else{
					System.out.println("Your name contains forbidden characters,Try again");
				}
				
			}while(matcher.matches()==false);
		
		
		
		
		sc.close();
		
		
	}

}
