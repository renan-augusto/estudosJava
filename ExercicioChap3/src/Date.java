
public class Date {
	private int day;
	private int month;
	private int year;
	
	
	//construtor
	public Date(int day, int month, int year) 
	{
		if(day > 0 && day < 32)
			this.day = day;
		if(month > 0 && month < 13)
			this.month = month;
		if(year > 0)
			this.year = year;
	}
	
	//setters
	
	public void setDay(int day)
	{
		this.day = day;
	}
	public void setMonth(int month) 
	{
		this.month = month;
	}
	public void setYear(int year) 
	{
		this.year = year;
	}
	
	//getters
	
	public int getDay()
	{
		return day;
	}
	
	public int getMonth()
	{
		return month;
	}
	
	public int getYear()
	{
		return year;
	}
	
	
	public void displayDate()
	{
		System.out.printf("%d / %d / %d %n", 
				getDay(), getMonth(), getYear());
	}
	
}

