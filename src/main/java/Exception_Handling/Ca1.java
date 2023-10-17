package Exception_Handling;

public class Ca1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Main Start");
		String s=null;
		try
		{
			System.out.println("Inside Catch Block");
			System.out.println(s.equals("Hi"));
		}
		catch(Exception e)
		{
			System.out.println(e.getClass());
		}
		finally
		{
			System.out.println("Finally block");
		}
		System.out.println("In Main methods");
	}

}
