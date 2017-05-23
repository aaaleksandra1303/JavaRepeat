package Collections;

import java.util.ArrayList;
import java.util.List;

public class Example1 {

	public static void main(String[] args) {
		
		List<String> people = new ArrayList<String>();
		//add elements to the list
		
		people.add("Ola");
		people.add("Fran");
		people.add("Zenon");
		
		System.out.println("Size of the list is: " +people.size());
		people.remove(2);
		System.out.println("Size of the list is: " +people.size());
		people.add("Jan");
		
		String name = people.get(0);
		System.out.println("The name is "+name);
		

	}

}
