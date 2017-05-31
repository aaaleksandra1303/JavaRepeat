package Classes;

public class Car {
/*
 * Stwórz klasę Samochód posiadającą następujące atrybuty:
brand,
model,
price.
Stwórz metody dostępowe do atrybutów. Stwórz metodę show wyświetlającą markę
oraz cenę w jednej linii.
 */
	private String brand;
	private String model;
	private double price;
	
	public Car(String brand,String model, double price){
		this.brand=brand;
		this.model=model;
		this.price=price;
	}
	
	public void setBrand(String brand){
		this.brand=brand;
	}
	
	public void setModel(String model){
		this.model=model;
	}
	
	public void setPrice(double price)
	{
		this.price=price;
	}
	
	public String getBrand()
	{
		return brand;
	}
	
	public String getModel()
	{
		return model;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	//static method
	public static String showCar(Car c){
		String info = c.getBrand()+" "+c.getPrice();
		System.out.println(info);
		return info;
	}
	
	//method
	public  String showCar2(){
		String info = getBrand()+" "+getModel()+" "+getPrice();
		System.out.println(info);
		return info;
	}
	public static void main(String[] args) {
		
		Car c1= new Car("Mercedes","E",12345.34);
		Car c2 = new Car("Citroen","C3",1234.54);
		c2.showCar2();
		showCar(c1);

	}

}
