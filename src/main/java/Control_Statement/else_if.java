package Control_Statement;

import java.util.Scanner;

public class else_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the marks");
		int marks=sc.nextInt();
		if(marks>75)
		{
			System.out.println("distinction");
		}
		else if(marks>65)
		{
			System.out.println("first Class");
		}
		else if(marks>50)
		{
			System.out.println("Second Class");
		}
		else if(marks>35)
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}

}
