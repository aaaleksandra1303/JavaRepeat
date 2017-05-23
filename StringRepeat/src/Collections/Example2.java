package Collections;

import java.util.HashSet;
import java.util.Set;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-gener ated method stub
		Set<String> users= new HashSet<String>();
		users.add("Kotek"); // the same name , the size of list is the same
		users.add("Kotek");
		users.add("Malpka");
		users.add("Krowka");
		users.add("Baran");
		
		System.out.println("List size is "+users.size());
		
		//foreach
		for(String element:users){
			System.out.println(element);
			
		}
	}

}
