package Classes;

import java.util.ArrayList;
import java.util.List;

/*
 * Zadanie4 .
Stwórz Klasę Employee dziedziczącą po Person . Dodatkowo Employee powinien
posiadać salary oraz commission.
Oraz metodę annualSalary zwracającą pensje roczną.

Zadanie8.
Do klasy Employee zdefiniuj metodę statyczną zwracającą sumę wszystkich pensji
pracowników.
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
	
	public static int sumSalaryAll(List<Employee> employees){
		int suma= 0;
		for(Employee e: employees){
			
			suma= suma+anualSalary(e);
			
		}
		return suma;
	}
	
	

	public static void main(String[] args) {
		Person p = new Person("Ola","Bla",28,'F');
		
		Employee e = new Employee(p.getName(),p.getSurname(),p.getAge(),p.getSex(),10000,5);
		Employee e2 = new Employee("Fred", "Simson", 45, 'M', 23455, 2);
		Employee e3 = new Employee("Zenek", "Zak", 46, 'M', 123455, 3);
		
		System.out.println("anual salary for "+e.getName()+ " is "+anualSalary(e));
		
		List<Employee> employees = new ArrayList<Employee>();
		
		employees.add(e);
		employees.add(e2);
		employees.add(e3);
		
		System.out.println(" sum of all employees : "+sumSalaryAll(employees));
		
	}

}
