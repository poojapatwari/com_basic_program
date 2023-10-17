package InterFace;

public class Implement_class implements Interface1,InterFace2 {

	

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		System.out.println("m3 from interface2");
	}

	@Override
	public void m4() {
		// TODO Auto-generated method stub
		System.out.println("m4 from interface2");
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("m1 from interface1");
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("m2 from interface1");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Implement_class imp=new Implement_class();
		imp.m1();
		imp.m2();
		imp.m3();
		imp.m4();
		
	}

}
