package Classes;

import java.util.ArrayList;
import java.util.List;

public class Punkt3D extends Punkt2D{
	int z;
	
	
	public Punkt3D(int x,int y, int z){
		super( x, y);
		this.z=z;
		
	}
	
	private void setZ(int z){
		this.z=z;
	}
	
	private int getZ()
	{
		return z;
	}
	
public static String getAllPoints3D(List<Punkt3D> points){
		
		String xyz=null;
		for(Punkt3D p : points){
			xyz="x:"+p.getX()+" y:"+p.getY()+" z:"+p.getZ();
			System.out.println(xyz);
			
		}
		return xyz;
		
	}
	

	public static void main(String[] args) {
		Punkt3D p1 = new Punkt3D(1,2,3);
		Punkt3D p2 = new Punkt3D(1,2,3);
		Punkt3D p3 = new Punkt3D(1,2,3);
		Punkt3D p4 = new Punkt3D(1,2,3);
		
		List<Punkt3D> points = new ArrayList<Punkt3D>();
		points.add(p1);
		points.add(p2);
		points.add(p3);
		points.add(p4);
		
		getAllPoints3D(points);

	}

}
