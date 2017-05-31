package Classes;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.xml.crypto.Data;

/*
 * Zadanie5.
Zdefinuj klasę Product posiadającą name,description, specification. Dodaj
odpowiedni konstruktor. Zdefiniuj Klasę Guarantee, która odnosi się do danego
produktu oraz dodatkowy atrybut validUntil.
Zdefiniuj metodę publiczną isValid. Jeśli produkt jest ważny zwraca true w
przeciwnym wypadku false. Jeśli Gwarancja jest nieważna to czyści Gwarancję
ustawiając validUntli oraz product na null.
 */
public class Guarantee extends Product{
	
	private Date validUntil;
	
	
	public Guarantee(String productName, String description, String specifiation, Date validUntil) {
		super(productName, description, specifiation);
		
		this.validUntil=validUntil;
	}
	
	private void setValidUntil(Date validUntil)
	{
		this.validUntil=validUntil;
	}

	public Date getValidUntil()
	{
		return validUntil;
	}
	
	public static boolean isValid(Guarantee g)
	{
		boolean isValid=false;
		Date current = new Date();
		Date next = g.validUntil;
		//System.out.println(current);
		//System.out.println(g.validUntil);
		
	
		if(next.after(current))
		{
			System.out.println(g.getProductName()+" The guarantee is valid!");
			isValid=true;
			
		}else{
			System.out.println(g.getProductName()+" The guarantee is not valid!");
			isValid=false;
			g.setValidUntil(null);
		}
		
		//if(g.validUntil >))
		return isValid;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*GregorianCalendar runTime = new GregorianCalendar();
		@SuppressWarnings("deprecation")
		Date date1 = new Date(2017,05,30);
		
		
		
		Date currentDate = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		String dateString = dateFormat.format(currentDate);
		System.out.println(dateString);
		
		*/
		int n=1900;
		Product p = new Product("Computer","Asus","sdfsdfsf");
		Guarantee g = new Guarantee(p.getProductName(), p.getDescription(), p.getSpecification(),new Date(2017-n,03,28));
		@SuppressWarnings("deprecation")
		Guarantee g2 = new Guarantee("Computer2", "Toshiba", "fdfdf", new Date(2019-n,04,18));
		
		List<Guarantee> list1 = new ArrayList<Guarantee>();
		list1.add(g);
		list1.add(g2);
		
		isValid(g);
		isValid(g2);
		
		System.out.println(g2.validUntil);
		
		//System.out.println(isValid(g));
		
		
	
	}

}
