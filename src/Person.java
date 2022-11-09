
public class Person {

	public static void main(String[] args) {
		
		Persona client = new Client(38, "Gabriel", 232196861, true);
		System.out.println(client.toString());
		Persona trabajador = new Trabajador(29, "Juan", 5242355, false, 2300);
		System.out.println(trabajador.toString());
		

	}

}

class Persona{
	private int age;
	private String name;
	private int phone;
	
	

	public Persona(int age, String name, int phone) {
		super();
		this.age = age;
		this.name = name;
		this.phone = phone;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "name= " + name + ", age= " + age +  ", phone=" + phone;
	}
	
}

class Client extends Persona{
	private boolean credit;
	
	public Client(int age, String name, int phone, boolean credit) {
		super(age, name, phone);
		this.credit = credit;
	}

	public boolean isCredit() {
		return credit;
	}

	public void setCredit(boolean credit) {
		this.credit = credit;
	}

	@Override
	public String toString() {
		return "Client: " + super.toString()+", crédito aprobado:" + credit;
	}

	

	
	
}

class Trabajador extends Client{
	private int salary;

	
	public Trabajador(int age, String name, int phone, boolean credit, int salary) {
		super(age, name, phone, credit);
		this.salary= salary;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return  super.toString() + ", salary= " + salary ;
	}

	
	
	
	
	
}