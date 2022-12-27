//TODO grafico de valores do imc
public class HealthProfile {
	private String name; private String lastName; private String gender; private int birthDay;
	private int birthMonth; private int birthYear; 	private double height; 	private double weight;
	
	//construtor
	public HealthProfile(String name, String lastName,
			String gender, int birthDay, int birthMonth, int birthYear, double height, double weight) 
	{
		this.name = name;
		this.lastName = lastName;
		this.gender = gender;
		if(birthDay > 0 && birthDay < 32)
			this.birthDay = birthDay;
		if(birthMonth > 0 && birthMonth< 13)
			this.birthMonth = birthMonth;
		if(birthYear > 0)
			this.birthYear = birthYear;
		if(height > 0)
			this.height = height;
		if(weight > 0)
			this.weight = weight;
		
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
	public void setGender(String gender)
	{
		this.gender = gender;
	}
	public void setBirthDay(int birthDay)
	{
		this.birthDay = birthDay;
	}
	public void setBirthMonth(int birthMonth)
	{
		this.birthMonth = birthMonth;
	}
	public void setBirthYear(int birthYear)
	{
		this.birthYear = birthYear;
	}
	public void setHeight(double height)
	{
		this.height = height;
	}
	public void setWeight(double weight)
	{
		this.weight = weight;
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
	public String getGender()
	{
		return gender;
	}
	public int getBirthDay()
	{
		return birthDay;
	}
	public int getBirthMonth()
	{
		return birthMonth;
	}
	public int getBirthYear()
	{
		return birthYear;
	}
	public double getHeight()
	{
		return height;
	}
	public double getWeight()
	{
		return weight;
	}

	//metodo que exibe o profile do cliente
	public void displayHealthProfile(int birthYear)
	{
		int age = 2022 - getBirthYear();
		int maxCardiac = 220 - age;
		double targetCardiac1 = maxCardiac  * 0.50;
		double targetCardiac2 = maxCardiac * 0.85;
		System.out.printf("%n%s %s%nSeu perfil de saude:%nIdade: %d%nSexo: %s%nCardio maximo: %d%nIntervalo: %.2f e %.2f",
				getName(), getLastName(),age, getGender(), maxCardiac, targetCardiac1, targetCardiac2);
	}
	public void displayImc(double height, double weight)
	{
		double imc;
		imc = getWeight()/(getHeight()*getHeight()) ;
		System.out.printf("%nSeu imc: %.2f%n", imc);
	}
}
