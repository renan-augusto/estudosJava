//TODO reler o exercicio ue fala em um limite de credito a ser aprovado por cliente.
public class CreditLimit {
	private int acc;
	private int balance;
	private int authorizedCredit;
	
	//construtor
	public CreditLimit(int acc, int balance, int authorizedCredit) {
		this.acc = acc;
		this.balance = balance;
		this.authorizedCredit = authorizedCredit;
		
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
	public void setauthorizedCredit(int authorizedCredit)
	{
		this.authorizedCredit = authorizedCredit;
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
	public int getAuthorizedCredit()
	{
		return authorizedCredit;
	}

	public void displayAcc() 
	{
		System.out.printf("Acc: %d%nBalance: %d%nAuthorized Credit: %d%n", 
				getAcc(), getBalance(), getAuthorizedCredit());
	}
	public void displayTotalBalance() {
		int totalBalance = getBalance() + getAuthorizedCredit();
		System.out.printf("Saldo mais o credito liberado:%d%n", totalBalance);
	}
}
