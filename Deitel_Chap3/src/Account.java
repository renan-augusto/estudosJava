

public class Account {
	
	private String name; //variavel de instancia
	private double balance; //variavel de instancia
	
	//Construtor de Account que recebe dois parametros
	public Account(String name, double balance)
	{
		this.name = name; //variavel de instancia
		
		//valida que o balance eh maior que 0.0; se nao for,
		//a variavel de instacia balance mantem seu valor inicial padra de 0.0
		
		if (balance > 0.0)
			this.balance = balance;
	}
	
	//metodo que deposita apenas uma quantia valida no saldo
	
	public void deposit(double depositAmount)
	{
		if (depositAmount > 0.0)
			balance = balance + depositAmount;
	}
	
	public void withdraw(double withdrawAmount)
	{
		if(balance >= withdrawAmount)
			balance = balance - withdrawAmount;
		if(balance < withdrawAmount)
			System.out.print("Saldo insuficiente");
			
	}
	
	public double getBalance() 
	{
		return balance;
	}
	 
	
	//o construtor inicializa name com nome do parametro
	public Account(String name) 
	{
		this.name = name;
	}
	
	//metodo para definir o nome do objeto
	public void setName(String name) 
	{
		this.name = name;
	}
		//metodo para recuperar o nome do objeto
	public String getName() 
	{
		return name; //retorna o valor do nome para o chamador
	}
	
	public void displayAccount() 
	{
		System.out.printf("O valor do saldo de %s e igual a %.2f%n%n", name, balance);
	}
	
}