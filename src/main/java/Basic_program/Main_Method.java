package Basic_program;

public class Main_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println("Start the main method");
      m1();
      Main_Method var=new Main_Method();
      var.nonstatic();
      System.out.println("End the main method");
	}
	public static void m1()
	{
		System.out.println("run the static method");
	}
	public void nonstatic()
	{
		System.out.println("running the nonstatic method");
	}

}
