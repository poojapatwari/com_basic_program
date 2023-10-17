package Encapsulation;

public class Current_Account implements Bank 
{

	@Override
	public void MinimumBalence() {
		// TODO Auto-generated method stub
		System.out.println("Minimum Balenece:1000");
	}

	@Override
	public void Intrest() {
		// TODO Auto-generated method stub
		System.out.println("Intrest:8" +"%");
		
	}

	@Override
	public void MonyTransfer() {
		// TODO Auto-generated method stub
		System.out.println("MoneyTransfer:100000");
	}
	public void NewFeature()
	{
		System.out.println("New Feature:B");
	}

}
