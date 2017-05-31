package Classes;

public class CD extends Article {

	public CD(String title, double price) {
		super(title, price, productType);
		productType="CD";
		
	}



	public static void main(String[] args) {
		
		CD cd1= new CD("Pink FLoyd",89.33);
		
		System.out.println(cd1.displayPrice());
		System.out.println(cd1.toString());

	}

}
