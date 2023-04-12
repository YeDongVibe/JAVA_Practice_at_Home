package Practice07;

abstract class Employee {
	private String name;
	private int salary;

	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public abstract void calcSalary();

	public abstract void calcBonus();
}

class Salesman extends Employee {
	int sale;
	public Salesman(String name, int salary, int sale) {
		super(name, salary);
		this.sale = sale;
	}

	public void calcSalary() {
		System.out.println("Salesman" + getName() + ": 급여 =" + (getSalary() + sale));
	}

	public void calcBonus() {
		System.out.println("Salesman " + getName() + ": 보너스 = "+ (getSalary() * 12 * 4));
	}
}

class Consultant extends Employee {
	int consult;
	
	public Consultant(String name, int salary, int consult) {
		super(name, salary);
		this.consult = consult;
	}
	public void calcSalary() {
		System.out.println("Consultant" + getName()+ ": 급여 = " +getSalary() + consult);
	}

	public void calcBonus() {
		System.out.println("Consultant" + getName()+ " : 보너스 = " + (getSalary() * 12 * 2));
	}
}
                                                                                             
class Manager extends Employee {
	int ps;
	
	public Manager(String name, int salary, int ps) {
		super(name, salary);
		this.ps = ps;
	}
	
	public void calcSalary() {
		System.out.println("Manager"+ getName() + ": 급여 = "+ (getSalary() + ps));
	}

	public void calcBonus() {
		System.out.println("Manager" + getName()+ ": 보너스 = " + (getSalary() * 12 * 2));
		// TODO Auto-generated method stub
		
	}

}

public class HRSTest {
	public static void main(String[] args) {
		Salesman s = new Salesman("강두식", 300, 400);
		Consultant c = new Consultant("강용식", 400, 500);
		Manager m = new Manager("이두팔",500, 600);
		s.calcSalary();
		s.calcBonus();
		c.calcSalary();
		c.calcBonus();
		m.calcSalary();
		m.calcBonus();
	}
}