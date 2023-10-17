package Abstract_class;

public class Abs_Class1 extends Abs_Class {
	

	

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		System.out.println("M3 Abstract method implemented in subclass");
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("M2 Abstract method implemented in subclass");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Abs_Class1 ab=new Abs_Class1();
		ab.m1();
		ab.m2();
		ab.m3();
		
	}

}
