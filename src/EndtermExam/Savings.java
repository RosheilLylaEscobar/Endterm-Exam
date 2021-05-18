package EndtermExam;

public class Savings extends Account {
	
 double interestRate;
	
	public Savings(int AccountNo, double interest)
	{
		super(AccountNo);
		setInterestRate(interest);
	}
	
	public void setInterestRate(double interest)
	{
		this.interestRate = interest;
	}
	public double getInterestRate()
	{
		return interestRate;
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
		return("Savings Account Information: " + getAccountNumber() + "\nBalance: " + getBalance() + "\nInterest Rate: " + getInterestRate() + "%");
	}
}

