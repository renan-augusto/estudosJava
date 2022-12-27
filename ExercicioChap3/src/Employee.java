//TODO metodo que permite ao meu usuario calcular aumentos de salario

public class Employee {
	private String name;
	private String lastName;
	private double salary;
	
	//construtor
	public Employee(String name, String lastName, double salary) 
	{
		this.name = name;
		this.lastName = lastName;
		
		if(salary > 0.0)
			this.salary = salary;
		if(salary <= 0.0)
			System.out.print("Valor de salario invalido");
	}
	
	//setters
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	
	public void setSalary(double salary)
	{
		this.salary = salary;
	}
	
	//getters
	
	public String getName()
	{
		return name;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	public double getSalary()
	{
		return salary;
	}
	
	public void setRaise(double percentage)
	{
		setSalary(salary += (salary/100) * percentage);
	}
}
