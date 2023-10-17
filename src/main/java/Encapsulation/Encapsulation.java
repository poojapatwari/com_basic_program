package Encapsulation;

public class Encapsulation  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JIo j=new JIo();
		System.out.println("Features of jio simcard..");
		j.audiocalling();
		j.sms();
		j.Internet();
		j.Newfeature();
		
		System.out.println("Features of IDEA simcard");
		IDEA i=new IDEA();
		i.audiocalling();
		i.sms();
		i.Internet();
		i.Newfeature();
		
	}

}
