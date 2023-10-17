package Control_Statement;

import java.util.Scanner;

public class Student_Marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Student marks");
	int marks=sc.nextInt();
	if(marks>=35)
	{
		System.out.println("Student is pass");
	}
	else
	{
		System.out.println("Student is fail");
		}
	}

}
