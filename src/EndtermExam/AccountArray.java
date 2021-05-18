package EndtermExam;

public class AccountArray {
	
	public static void main(String[] args)
	{
		
		Account[] Array = new Account[10];
		
		Array[0] = new Checking(1);
		Array[1] = new Checking(2);
		Array[2] = new Checking(3);
		Array[3] = new Checking(4);
		Array[4] = new Checking(5);
		Array[5] = new Checking(6);
		Array[6] = new Savings(7, 0.1);
		Array[7] = new Savings(8, 1.2);
		Array[8] = new Savings(9, 2.3);
		Array[9] = new Savings(10, 1.4);
		Array[10] = new Savings(11, 1.0);
		
		
		for(int z = 0; z < Array.length; z++)
			
			System.out.println(Array[z].getInformation());
	}

}
