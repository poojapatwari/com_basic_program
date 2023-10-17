package Polymorphism;

public class TestSon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Original Properties of Father");
		father pro=new father();
		pro.Car();
		pro.Money();
		System.out.println("...Modified properties of son");
		Son s=new Son();
		s.Car();
		s.Money();
	}

}
