//TODO um validador no meu metodo getInvoiceAmount, que exibe uma mensagem de erro quando algum dos
//dos valores eh menor ou igual a zero


public class Invoice {
	private String number;
	private String description;
	private int qtd;
	private double price;
	
	//construtor
	public Invoice(String number, String description, int qtd, double price)

	{
		this.number = number;
		this.description = description;
		
		if(qtd > 0)
			this.qtd = qtd;
		if(qtd <= 0)
			System.out.print("Quantidade invalida");
		
		if(price > 0)
			this.price = price;
		if(price <= 0)
			System.out.print("Valor Invalido");
	}

	//setters
	public void setNumber(String number)
	{
		this.number = number;
	}
	
	public void setDescription(String description)
	{
		this.description = description;
	}
	
	public void setQtd(int qtd)
	{
		this.qtd = qtd;
	}
	
	public void setPrice(double price)
	{
		this.price = price;
	}
	
	//getters
	public String getNumber()
	{
		return number;
	}
	
	public String getDescription()
	{
		return description;
	}
	
	public int getQtd()
	{
		return qtd;
	}
	
	public double getPrice()
	{
		return price;
	}

	public double getInvoiceAmount() 
	{
		double totalAmount = price * qtd;
		return totalAmount;
	}
	
	
	
}
