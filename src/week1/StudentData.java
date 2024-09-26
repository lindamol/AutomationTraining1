package week1;
import java.util.Scanner;


public class StudentData {


	int empid;
	String name;
	public static void main(String args[])
	{
		StudentData s1 = new StudentData();
		//s1.display();
		s1.name = "Linda";
		s1.empid();
		s1.display();
		
	}
	void display()
	{
		System.out.println("Student name and id is " +name+ " , " +empid);
	}
	
		public void empid() 
	{
		System.out.println("Enter employee ID : " );
		Scanner input = new Scanner(System.in);
		empid = input.nextInt();
		System.out.println("EMP id inputted is :" +empid);
	
	}
}
