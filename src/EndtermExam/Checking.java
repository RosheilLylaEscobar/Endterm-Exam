package EndtermExam;

public class Checking extends Account {
	
	public Checking(int AccountNo)
	{
		super(AccountNo);
	}
	
	public int getAccountNumber()
	{
		return AccountNo;
	}
	
	public double getBalance()
	{
		return balance;
	}
	

	public String getInformation()
	{
		return("Checking Account Information: " + getAccountNumber() + "\nBalance: " + getBalance());
	}

}
