package Oops_Concept;

public class Hyrachical_Inharitance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Properties of Son");
		Son obj=new Son();
		obj.bike();
		obj.car();
		obj.Home();
		obj.Money();
		
		System.out.println("Properties of Son2");
		Son2 obj1=new Son2();
		obj1.mobile();
		obj1.car();
		obj1.Money();
		obj1.Home();
		
		System.out.println("Properties of Son3");
		Son3 obj3=new Son3();
		obj3.cycle();
		obj3.car();
		obj3.Home();
		obj3.Money();
		
	}

}
