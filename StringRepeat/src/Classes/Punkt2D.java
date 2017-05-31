package Classes;

import java.util.ArrayList;
import java.util.List;

/*
 * Zadanie10.
Stwórz klasę Punkt2D, która przechowuje informacje na temat punktu na przestrzeni
dwuwymiarowej (współrzędne x oraz y ). 
Zawierająca dwa konstruktory:
bezparametrowy ustawiający pola na wartość 0, 
oraz przyjmujący dwa argumenty i
ustawiający pola obiektu zgodnie z podanymi parametrami.

Napisz klasę Punkt3D dziedziczącą po Punkt2D reprezentującą punkt w
trójwymiarze (dodatkowe pole z). W klasie testowej utwórz obiekty obu klas i
przetestuj działanie.
 */

public class Punkt2D {
	
	int x;
	int y;
	
	Punkt2D(){
		
	}
	Punkt2D(int x,int y){
		this.x=x;
		this.y=y;
	}
	
	protected void setX(int x)
	{
		this.x=x;
	}
	protected void setY(int y)
	{
		this.y=y;
	}
	
	public int getX()
	{
		return x;
	}
	public int getY(){
		return y;
	}
	
	public static String getAllPoints2D(List<Punkt2D> points){
		
		String xy=null;
		for(Punkt2D p : points){
			xy="x:"+p.getX()+"y:"+p.getY();
			System.out.println(xy);
			
		}
		return xy;
		
	}

	
	
	
	public static void main(String[] args) {

		Punkt2D p1 = new Punkt2D(1,2);
		Punkt2D p2 = new Punkt2D(1,2);
		Punkt2D p3 = new Punkt2D(1,2);
		Punkt2D p4 = new Punkt2D(1,2);
		
		List<Punkt2D> points = new ArrayList<Punkt2D>();
		points.add(p1);
		points.add(p2);
		points.add(p3);
		points.add(p4);
		
		getAllPoints2D(points);
		
		//System.out.println(getAllPoints2D(points));
	}
	

}
