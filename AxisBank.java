package assignment3.weekday1;
public class AxisBank extends BankInfo
{
	public void deposit()
	{
		System.out.println("Vadapalani Axis bank is good for Deposit and all types of accounts");
	}
	
	public static void main(String[] args) 
	{
		AxisBank ax=new AxisBank();
		ax.saving();
		ax.fixed();
		ax.deposit();

	}

}
