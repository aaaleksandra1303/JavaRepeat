package Classes;

import java.util.ArrayList;
import java.util.List;

public class User {
	/*
	 * Zadanie9.
Stwórz program z klasą User, z następującymi danymi:
username,
password,
name,
surname.
Stwórz przykładowe obiekty, zapisz je do ArrayListy.
Stwórz metodę statyczną getAll, która zwraca wszystkich utworzonych
użytkowników.
	 */

	
	String username;
	String password;
	String name;
	String surname;
	
	public User(String username,String password,String name,String surname)
	{
		this.username=username;
		this.password=password;
		this.name=name;
		this.surname=surname;
		
	}
	private void setUsername(String username)
	{
		this.username=username;
	}
	private void setPassword(String password)
	{
		this.password=password;
	}
	private void setName(String name)
	{
		this.name=name;
	}
	private void setSurname(String surname)
	{
		this.surname=surname;
	}
	
	public String getUsername()
	{
		return username;
	}
	private String getPassword(){
		return password;
	}
	public String getName()
	{
		return name;
	}
	public String getSurname(){
		return surname;
	}
	
	public static void getAllUsers(List<User> users){
		
		for(User u:users)
		{
			System.out.println(u.getUsername());
		}
		
	}
	public static void main(String[] args) {
		
		User u1 = new User("Zonk","zonk1234","Zenek","Zaba");
		User u2 = new User("Rekin","rekin1234","Rysiek","Nowak");
		
		List<User> users = new ArrayList<User>();
		
		users.add(u1);
		users.add(u2);
		
		getAllUsers(users);
		

	}

}
