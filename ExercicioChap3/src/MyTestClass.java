
public class MyTestClass {
	private String name; private String lastName;
	
	public MyTestClass(String name, String lastName) {
		this.name = name;
		this.lastName = lastName;
	}
	//settters
	public void setName(String name)
	{
		this.name = name;
	}
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
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

	
	public void displayMyClass()
	{
		System.out.printf("teste: %s %n %s %n", getName(), getLastName());
	}
	
	
}
