
public class CreditLimit2 {
	private int acc;
	private int balance;
	private int totalCharge;
	private int totalCredits;
	private int creditLimit;
	
	//construtor
	public CreditLimit2(int acc, int balance, int totalCharge, int totalCredits, int creditLimit)
	{
		this.acc = acc;
		this.balance = balance;
		this.totalCharge = totalCharge;
		this.totalCredits = totalCredits;
		this.creditLimit = creditLimit;
	}

	//setters
	public void setAcc(int acc)
	{
		this.acc = acc;
	}
	public void setBalance(int balance)
	{
		this.balance = balance;
	}
	public void setTotalCharge(int totalCharge)
	{
		this.totalCharge = totalCharge;
	}
	public void setTotalCredits(int totalCredits)
	{
		this.totalCredits = totalCredits;
	}
	public void setCreditLimit(int creditLimit)
	{
		this.creditLimit = creditLimit;
	}
	
	//getters
	public int getAcc()
	{
		return acc;
	}
	public int getBalance()
	{
		return balance;
	}
	public int getTotalCharge()
	{
		return totalCharge;
	}
	public int getTotalCredits()
	{
		return totalCredits;
	}
	public int getCreditLimit()
	{
		return creditLimit;
	}
	
//	public void newBalance(int balance, int totalCharge, int totalCredits)
//	{
//		int newBalance = balance + totalCredits - totalCharge;
//	}
}
