package Loops;

import java.util.Scanner;

public class Example6 {
/*
 * Zadanie6. Stwórz program, który odczytuję dany napis i wypisuje ile razy w danym
napisie występują małe litery.
Przykładowo dla napisu:
aAaaBssk wynikiem powinno być 6 (małe a występuje 3 razy, s występuje 2 razy, k
występuje 1 raz).
 */
	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter some word:");
		String word= sc.nextLine();
		int sumaSmall=0;
		int sumaBig=0;
		//System.out.println(word.split("-"));
		for(int i=0;i<=word.length()-1;i++){
			//char letter = ;
			if(Character.isLowerCase(word.charAt(i)))
				{
				sumaSmall=sumaSmall+1;
				}else{
					sumaBig=sumaBig+1;
				}
				
			
		}
		System.out.println("The word has "+sumaSmall +" small characters,and "+sumaBig+" big characters");
		sc.close();

	}

}
