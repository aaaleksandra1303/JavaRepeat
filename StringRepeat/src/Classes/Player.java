package Classes;

import java.util.ArrayList;
import java.util.List;

/*
 * Klasa Player powinna zawierać:
name,
username,
points.

Klasa Player powinna zawierać metodę 'fullName' zwracającą, która powinna
wypisać imię i nazwisko gracza.
 */
public class Player {
	protected String name;
	protected String surname;
	protected String username;
	protected int points;

	
	Player(String name,String surname,String username,int points){
		this.name=name;
		this.surname=surname;
		this.username=username;
		this.points=points;
	}
	
	private void setName(String name)
	{
		this.name=name;
	}
	private void setSurname(String surname)
	{
		this.surname=surname;
	}
	private void setUserName(String username){
		this.username=username;
	}
	
	private void setPoints(int points){
		this.points=points;
	}
	
	public String getName(){
		return name;
	}
	public String getSurname()
	{
		return surname;
	}
	public String getUserName(){
		return username;
	}
	public int getPoints(){
		return points;
		
	}
	
	public String fullName()
	{
		String fullName= getName()+" "+ getSurname();
		System.out.println(fullName);
		return fullName;
	}
	
	
	
	public static void main(String[] args) {
		Player p1 = new Player("Bla1","Bla2","Bla3",130);
		
		p1.fullName();
		
		
	

	}

}
