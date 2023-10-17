package Encapsulation;

public class JIo implements  simcard {

	@Override
	public void audiocalling() {
		// TODO Auto-generated method stub
		System.out.println("audiocalling unlimited");
	}

	@Override
	public void sms() {
		// TODO Auto-generated method stub
		System.out.println("sms-150");
	}

	@Override
	public void Internet() {
		// TODO Auto-generated method stub
		System.out.println("Internate:2gb");
		
	}
	public void Newfeature()
	{
		System.out.println("Feature:A");
	}
	

}
