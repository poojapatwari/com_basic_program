package Control_Statement;

public class Nested_IF_else {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String UN="ABC";
		String password="xyz";
		if(UN=="ABC")
		{
			System.out.println("Correc UN");
			if(password=="xyz1")
			{
				System.out.println("Correct Password");
				System.out.println("SuccessFully Login");
			}
			else
			{
				System.out.println("Wrong Password");
				System.out.println("Failed Login");
			}
		}
		else
		{
			System.out.println("Wrong UN");
			System.out.println("Failed Login");
		}
	}

}
