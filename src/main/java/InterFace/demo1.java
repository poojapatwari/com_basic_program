package InterFace;

public class demo1 implements demo {

	

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("m1:completed in implementation class");
	}

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		System.out.println("m2:completed in implementation class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		demo1 d=new demo1();
		d.m2();
		d.m3();
	}
}
