package Classes;

/*
 * Zadanie4 .
Stwórz Klasę Employee dziedziczącą po Person . Dodatkowo Employee powinien
posiadać salary oraz commission.
Oraz metodę annualSalary zwracającą pensje roczną.
 */
public class Employee extends Person{
	
	private int salary;
	private int commission;

	public Employee(String name, String surname, int age, char sex,int salary, int commission) {
		super(name, surname, age, sex);
		this.salary=salary;
		this.commission=commission;
		
	}
	
	private void setSalary(int salary)
	{
		this.salary=salary;	
	}
	private void setCommission(int commission){
		this.commission=commission;
	}
	
	public int getSalary()
	{
		return salary;
	}
	public int getCommission()
	{
		return commission;
	}
	
	private static int anualSalary(Employee e)
	{
		int anualSalary=(e.salary+e.salary*(e.commission/100))*12;
		return anualSalary;
	}

	public static void main(String[] args) {
		Person p = new Person("Ola","Bla",28,'F');
		
		Employee e = new Employee(p.getName(),p.getSurname(),p.getAge(),p.getSex(),10000,5);
		
		System.out.println("anual salary for "+e.getName()+ " is "+anualSalary(e));
		
	}

}
