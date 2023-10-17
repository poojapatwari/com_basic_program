package Casting;

public class Implicit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//converting lower data type to higher data type
		int a=10;
		System.out.println(a);
		double b=a;
		System.out.println(b);
		//converting higher data type to lower data type--Explicit
		double c=25.0;
		System.out.println(c);
		int d=(int)c;
		System.out.println(d);
	}

}
