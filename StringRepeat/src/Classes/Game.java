package Classes;

import java.util.ArrayList;
import java.util.List;

/*
 * Zadanie3.
Zdefiniuj dwie klasy odpowiedzialne za przechowywanie informacji o Grze oraz
Zawodniku.
Klasa Game powinna zawierać:
name,
players.
Klasa Player powinna zawierać:
name,
username,
points.
Klasa Game powinna zawierać również metodę 'winner', która wypisuje na ekranie
imię i nazwisko wygrywającego. Wygrywa zawodnik, który posiada więcej niż 100
punktów. Jeśli dwaj zawodnicy mają więcej niż 100 punktów, wygrywa ten, który ma
ich więcej.
Klasa Player powinna zawierać metodę 'fullName' zwracającą, która powinna
wypisać imię i nazwisko gracza.
 */

public class Game {
	String gameName;
	static List<Player> players;
	
	Game(String gameName,List<Player> players){
		this.gameName=gameName;
		this.players=players;
		
	}
	
	private void setGameName(String gameName){
		this.gameName=gameName;
	}
	public String getGameName()
	{
		return gameName;
	}
	
	private void setPlayersList(List<Player> players){
		this.players=players;
	}
	public List<Player> getPlayersList()
	{
		return players;
	}
	
	
	public static String winner(Game g){
		int maxP =0;
		String winner=null;
		String result=null;
		
		for(Player p:players){
			
			if(p.points>100)
			{
				maxP=p.points;
				winner =p.username;
				if(p.points>maxP)
				{
					maxP=p.points;
					winner=p.username;
					
					//System.out.println("The winner is "+p.username+" with "+maxP+ " points!");
					
				}
				
			}
			
			
		}
		
		if(maxP>100)
		{
			System.out.println("The winner is "+winner+" with "+maxP+ " points!");
			result ="The winner is "+winner+" with "+maxP+ "points";
		}else{
			System.out.println("There is no winner!");
			
		}
		return result;
	}

	public static void main(String[] args) {
		
		Player p1 = new Player("Fran","Al","Ali",134);
		Player p2 = new Player("Zenon","Zeta","Zen",200);
		Player p3 = new Player("Czoni","Czon","Czon",56);
		
		List<Player> fifaPlayers = new ArrayList<Player>();
		fifaPlayers.add(p1);
		fifaPlayers.add(p2);
		fifaPlayers.add(p3);
		
		
		Game g1 = new Game("Fifa",fifaPlayers);
		winner(g1);
		
	//	System.out.println(winner(g1).toString());
		
		
		

	}

}

