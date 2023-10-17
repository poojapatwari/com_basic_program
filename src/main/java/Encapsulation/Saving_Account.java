package Encapsulation;

public class Saving_Account implements Bank {

	@Override
	public void MinimumBalence() {
		// TODO Auto-generated method stub
		
		System.out.println("Minimum Balence:500");
	}

	@Override
	public void Intrest() {
		// TODO Auto-generated method stub
		System.out.println("Intrest 7.5" +"%");
	}

	@Override
	public void MonyTransfer() {
		// TODO Auto-generated method stub
		System.out.println("MoneyTransfer:50000");
		
	}
	public void NewFeature()
	{
		System.out.println("New Feature:A");
	}

}
