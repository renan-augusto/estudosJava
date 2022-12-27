
public class incomeCalculator {
	private String name;
	private double workedTime;
	private double hourlyWage;
	
	//construtor
	public incomeCalculator(String name, double workedTime, double hourlyWage) {
		this.name = name;
		this.workedTime = workedTime;
		this.hourlyWage = hourlyWage;
	}
	//setters
	public void setName(String name)
	{
		this.name = name;
	}
	public void setWorkedTime(double workedTime) 
	{
		this.workedTime = workedTime;
	}
	public void setHourlyWage(double hourlyWage)
	{
		this.hourlyWage = hourlyWage;
	}
	//getters
	public String getName()
	{
		return name;
	}
	public double getWorkedTime()
	{
		return workedTime;
	}
	public double getHourlyWage()
	{
		return hourlyWage;
	}
	
	public double displayExtraTime(double workedTime)
	{
		double extraTime;
		
		extraTime = workedTime - 40.00;
		return extraTime;		
	
	
	}
	
	
}



