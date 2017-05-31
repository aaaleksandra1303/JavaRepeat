package Classes;

/*
 * Zadanie5.
Zdefinuj klasę Product posiadającą name,description, specification.
 Dodaj odpowiedni konstruktor.
 Zdefiniuj Klasę Guarantee, która odnosi się do danego
produktu oraz dodatkowy atrybut validUntil.
Zdefiniuj metodę publiczną isValid. Jeśli produkt jest ważny zwraca true w
przeciwnym wypadku false. Jeśli Gwarancja jest nieważna to czyści Gwarancję
ustawiając validUntli oraz product na null.
 */

public class Product {
	private String productName;
	private String description;
	private String specification;
	
	
	public Product(String productName,String description, String specifiation)
	{
		this.productName=productName;
		this.description=description;
		this.specification=specifiation;
	}
	
	protected void setProductName(String productName)
	{
		this.productName=productName;
	}
	
	protected void setDescription(String description)
	{
		this.description=description;
	}
	
	protected void setSpecification(String specification)
	{
		this.specification=specification;
	}
	
	public String getProductName(){
		return productName;
	}
	public String getDescription(){
		return description;
	}
	
	public String getSpecification()
	{
		return specification;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
