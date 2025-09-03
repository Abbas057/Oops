package oops;

class User{
	String name;
	int salary;
	
	public User(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public void display() {
		System.out.println("Name: "+ name);
		System.out.println("Salary: "+salary);
	}	
	
}

class Company extends User{
	
	String Companyname;

	public Company(String name, int salary,String companyname) {
		super(name,salary);
		Companyname = companyname;	
	}
	
	public void display() {
		System.out.println("Name: "+ name);
		System.out.println("Salary: "+salary);
		System.out.println("Company name: "+Companyname);
	}	
	
	
	
	
}
public class MethodOverriding {

	public static void main(String[] args) {
		
		Company  c = new Company("Abbas", 100000, "Bluescope");
		c.display();

	}

}

