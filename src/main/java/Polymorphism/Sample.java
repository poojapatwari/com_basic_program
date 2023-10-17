package Polymorphism;

public class Sample {

	//method overloading
	public void addition(int a,int b)
	{
		System.out.println("Addition of two numbers " +(a+b));
	}
	public void addition(int a,int b,int c)
	{
		System.out.println("Addition of 3 numbers " +(a+b+c));
	}
	public void addition(String add)
	{
		System.out.println(add);
	}
	public static void main(String [] args)
	{
		Sample s=new Sample();
		s.addition("addition");
		s.addition(10, 20);
		s.addition(10, 20, 30);
	}
}
