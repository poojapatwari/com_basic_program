package Encapsulation;

public class IDEA implements simcard {

	@Override
	public void audiocalling() {
		// TODO Auto-generated method stub
		System.out.println("Audiocalling:Unlimited");
	}

	@Override
	public void sms() {
		// TODO Auto-generated method stub
		System.out.println("SMS:100");
	}

	@Override
	public void Internet() {
		// TODO Auto-generated method stub
		System.out.println("Internet:1GB per day");
		
	}
	public void Newfeature()
	{
		System.out.println("Feature:B");
	}

}
