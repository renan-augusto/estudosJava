public class HeartRates {
	private String name;
	private String lastName;
	private int birthDay;
	private int birthMonth;
	private int birthYear;
	
	//construtor
	public HeartRates(String name, String lastName, int birthDay, int birthMonth, int birthYear) {
		this.name = name;
		this.lastName = lastName;
		if(birthDay > 0 && birthDay < 32)
			this.birthDay = birthDay;
		if(birthMonth > 0 && birthMonth< 13)
			this.birthMonth = birthMonth;
		if(birthYear > 0)
			this.birthYear = birthYear;
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
	//getters
	
	public String getName()
	{
		return name;
	}
	public String getLastName() 
	{
		return lastName;
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

	public void displayCardiacInfo(int birthYear) 
	{
		int age = 2022 - getBirthYear();
		double maxCardiac = 220 - age;
		double targetCardiac1 = maxCardiac * 0.50;
		double targetCardiac2 = maxCardiac * 0.85;
		System.out.printf("%s %s %nIdade: %d%nFrequencia Maxima: %.0f%nIntervalo alvo: entre %.0f e %.0f", getName(), getLastName(), age, maxCardiac, targetCardiac1, targetCardiac2);
	}
	
}
