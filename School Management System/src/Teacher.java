/**
 * This teacher class represent all reponsiblility of teacher
 */

public class Teacher {
	private int id;
	private String name;
	private int salary;
	private int salaryEarned;

	public Teacher(int id, String name, int salary) 
	{
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.salaryEarned=0;
	}
	
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public int getSalary()
	{
		return salary;
	}
	/**
	 * update the salary of the teacher
	 * 
	 */

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public void receiveSalary(int salary)
	{
		salaryEarned+=salary;
		School.updateTotalMoneySpend(salary);
	}

	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", salary=" + salary + ", salaryEarned=" + salaryEarned + "]";
	}
	
	
     
}
