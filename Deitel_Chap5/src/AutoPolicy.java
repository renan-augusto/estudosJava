
public class AutoPolicy 
{
	private int accountNumber;
	private String makeAndModel;
	private String state;
	
	//construtor
	public AutoPolicy(int accountNumber, String makeAndModel, String state)
	{
		this.accountNumber = accountNumber;
		this.makeAndModel = makeAndModel;
		this.state = state;
	}
	
	//setters
	public void setAccountNumber(int accountNumber)
	{
		this.accountNumber = accountNumber;
	}
	public void setMakeAndModel(String makeAndModel)
	{
		this.makeAndModel = makeAndModel;
	}
	public void setState(String state)
	{
		this.state = state;
	}
	//getters
	public int getAccountNumber()
	{
		return accountNumber;
	}
	public String getMakeAndModel()
	{
		return makeAndModel;
	}
	public String getState()
	{
		return state;
	}
	
	//metodo predicado retornado se o estado tem seguros sem culpa
	public boolean isNoFaultState()
	{
		boolean noFaultState;
		
		switch(getState())
		{
		case "MA": case "NJ": case "PA":
			noFaultState = true;
			break;
		default:
			noFaultState = false;
			break;
		}
		return noFaultState;
	}
}
