package Access_Modifiers;

public class Demo {
	
	private int a=20;//private access modifier scope within the class
	
	private void m1()//scope within the class
	{
		System.out.println("running m1 private method");
	}
	public void m2()//scope within the project
	{
		System.out.println("running m2 public method");
	}
 void m3()//Default access modifier-scope within the package
	{
		System.out.println("running m3 default method");
	}
 
    protected void m4()//scope within the package if we can  access protected data through Inharitance operation
    {
    	System.out.println("running m4 protect method");
    	
    }
	

}
