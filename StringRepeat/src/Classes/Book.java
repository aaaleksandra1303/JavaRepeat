package Classes;
/*
 * Zadanie6.
Zdefiniować klasy CD i Book, tak aby w konstruktorze jako parametr przyjmowały
cenę i tytuł, które mogą być odczytane poprzez metody price i title. Cena wraz z
jednostką monetarną powinna być wyświetlana w metodzie diplayPrice, natomiast
metoda toString powinna zwracać informację o typie produktu, tytule i jego cenie.
 */
public class Book extends Article {
	
	


	public Book(String title, double price) {
		super(title, price, productType);
		productType="Book";
		
	}

	public static void main(String[] args) {
		
		Book book1= new Book("Harry Potter",35.77);
		System.out.println(book1.displayPrice());
		System.out.println(book1.toString());
		
	}

}
