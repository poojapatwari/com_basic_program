package Encapsulation;

public class Test_Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("The Features of Saving Account");
		Saving_Account save=new Saving_Account();
		save.MinimumBalence();
		save.MonyTransfer();
		save.Intrest();
		save.NewFeature();
		System.out.println("The Features of Current Account");
		Current_Account current=new Current_Account();
		current.MinimumBalence();
		current.MonyTransfer();
		current.Intrest();
		current.NewFeature();
	}

}
