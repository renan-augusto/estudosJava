
public class Student {
	private String name;
	private double average;
	
	//construtor
	public Student(String name, double average)
	{
		this.name = name;
		
		if(average > 0.0)
			if(average < 100.0)
				this.average = average;
	}
	
	//setters
	public void setName(String name)
	{
		this.name = name;
	}
	public void setAverage(double studentAverage)
	{
		if(average > 0.0)
			if(average <100.0)
				this.average = average;
	}
	
	//getters
	public String getName()
	{
		return name;
	}
	
	public double getAverage() 
	{
		return average;
	}
	//metodo que determina e retorna a letra da nota de student
	public String getLetterGrade()
	{
		String letterGrade = " "; //inicializando como uma String vazia
		if(average >= 90.0)
			letterGrade = "A";
		else if(average >= 80.0)
			letterGrade = "B";
		else if(average >= 70.0)
			letterGrade = "C";
		else if(average >= 60.0)
			letterGrade = "D";
		else
			letterGrade = "F";
		
		return letterGrade;		
	}
}
