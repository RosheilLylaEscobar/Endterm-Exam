package EndtermExam;

public abstract class Account {
	
	int AccountNo;
	double balance;
	
	public Account(int num)
	{
		this.AccountNo = num;
		setBalance(0.0);
	}
	
	public void setBalance(double bal)
	{
		this.balance = bal;
	}
	
	public abstract int getAccountNumber();
	public abstract double getBalance();
	
	
	public abstract String getInformation();

}
