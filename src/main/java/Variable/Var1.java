package Variable;

public class Var1 {

	//Program on global variable
	int p=50;//nonstatic variable
	public void m1()
	
	{
		int a=10;//local variable
		int b=20;
		System.out.println(a);
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Var1 aj=new Var1();
           System.out.println(aj.p);
           aj.m1();
           
           
		
	}

}
