package Classes;

public class Article {
	/*
	 * Zadanie6.
Zdefiniować klasy CD i Book, tak aby w konstruktorze jako parametr przyjmowały
cenę i tytuł, które mogą być odczytane poprzez metody price i title. Cena wraz z
jednostką monetarną powinna być wyświetlana w metodzie diplayPrice, natomiast
metoda toString powinna zwracać informację o typie produktu, tytule i jego cenie.
	 */
	
	String title;
	double price;
	static String productType;
	
	public Article(String title,double price,String productType){
		this.price=price;
		this.title=title;
		
		if(productType=="Book")
		{
			this.productType="Book";
			
		}else if(productType=="CD")
		{
			this.productType="CD";
		}
		
	}
	
	protected void setTitle(String tittle){
		this.title=title;
	}
	
	protected void setPrice(double price)
	{
		this.price=price;
	}
	
	protected void setProductType()
	{
		this.productType=productType;
	}
	protected String getTitle()
	{
		return title;
	}
	protected double getPrice()
	{
		return price;
	}
	
	protected String getProductType()
	{
		return productType;
	}
	
	public String displayPrice()
	{
		//System.out.println(getPrice()+"PLN");
		return getPrice()+"PLN"; 
		
	}
	
	//typie produktu, tytule i jego cenie
	
	@Override
	public String toString(){
		
		return getProductType()+" "+getTitle()+" "+displayPrice();
	
	}
	

	public static void main(String[] args) {
		
		Book b = new Book("Alicja w krainie czarow",34.99);
		//CD c= new CD("Guns'n'Roses",77.20);
		//Book b2 = new Book("Latarnik",23.89);
		
		
		//c.displayPrice();
		b.displayPrice();
		
//	System.out.println(b2.toString());	
	//System.out.println(c.toString());	
	System.out.println(b.toString());
	
		
		

	}

}
