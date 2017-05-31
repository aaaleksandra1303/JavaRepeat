package Methods;

public class Example6 {
	/*
	 * Zadanie6.
Napisz funkcję, która wyznacza sumę cyfr zadanej liczby całkowitej.
Zadanie7.
Napisz
	 */
	
	int sumDigit(String a){
		
			//boolean digit= Character.isDigit(a);
			//String num=Integer.toString(a);
			int suma=0;
			
			for(int i=0;i<=(a.length()-1);i++){
				int n=a.charAt(i);
				suma=suma+n;
				System.out.println(suma);
				
			}
			return suma;
	}

	public static void main(String[] args) {
		
		Example6 e6= new Example6();
		e6.sumDigit("1");
		
		//todo!!!!!!!!
	
		
	}
}
