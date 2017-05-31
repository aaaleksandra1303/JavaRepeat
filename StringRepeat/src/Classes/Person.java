package Classes;

import java.util.ArrayList;
import java.util.List;

/*
 * Zadanie1.
Stwórz klasę Osoba posiadającą następujące dane takie jak:
name,
surname,
age,
gender.
Stwórz odpowiedni konstruktor, który przyjmuje wszystkie argumenty. Dodaj metody
dostępowe do zmiennych obiektu. Stwórz przykładowe obiekty.
 */
public class Person {
	private String name;
	private String surname;
	private int age;
	private char sex;
	
	public Person(String name, String surname,int age, char sex){

		this.name=name;
		this.surname=surname;
		this.age=age;
		this.sex=sex;
		
	}
	
	 protected void setName(String name)
	 {
		 this.name=name;
	 }
	 
	 protected String getName()
	 {
		 return name;
	 }
	 
	 protected void setSurname(String surname)
	 {
		 this.surname=surname;
	 }
	 
	 protected String getSurname()
	 {
		 return surname;
	 }
	 protected void setAge(int age)
	 {
		 this.age=age;
	 }
	 
	 protected int getAge()
	 {
		 return age;
	 }
	 protected void setSex(char sex)
	 {
		 this.sex=sex;
	 }
	 
	 protected char getSex(){
		 return sex;
	 }
	 
	 
	 

	public static void main(String[] args) {
		
		Person p1 = new Person("Ola","Em",28,'F');
		Person p2 = new Person("Fran","Al",29,'M');
		
		
		List<Person> people = new ArrayList<Person>();
		people.add(p1);
		people.add(p2);
		
		
		for(Person p: people)
		{
			System.out.println(p.getName());
			
		}
		
	
	}

}
