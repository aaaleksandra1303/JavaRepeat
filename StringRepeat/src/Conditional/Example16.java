package Conditional;

import java.util.Scanner;

public class Example16 {
	/*
	 * Mamy pojemniki. Do pojemników wkładamy klocki. Kiedy zabraknie miejsca w
pojemniku - bierzemy następny. W każdym pojemniku mieści się s klocków.
Napisz program, który podaje ile potrzeba pojemników, aby przechować n klocków
oraz ile klocków jest w ostatnim użytym pojemniku.
	 */

	public static void main(String[] args) {
		
		
		Scanner sc= new Scanner(System.in);
		
		
		System.out.println("How many blocks do you have?");
		int blockNumber=sc.nextInt();
		System.out.println("How many block can fit to contaimer?");
		
		int maxVol=sc.nextInt();
		
		
		int containers=(blockNumber/maxVol)+1;		
		int lastContainer;
		
		if(blockNumber%maxVol==0){
			
			
			lastContainer=maxVol;
		}else{
			
			lastContainer=blockNumber%maxVol;
		}
		
		
		System.out.println("There are "+ blockNumber +" blocks in "+containers+" containers, the last containter is "+lastContainer+" blocks.");
		

	}

}
