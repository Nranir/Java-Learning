package lesson4;
//to zostalo zimportowane  automatycznie jak najechalo sie na klase skanner
import java.util.Scanner;

public class MyClass
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		//line to read text from user
		Scanner scan = new Scanner(System.in);
		//#############INT#########################
		//wyciaganie od uzytkowanika numeru
		System.out.println("Enter some number");
		int user_input_numer = scan.nextInt();
		System.out.println("The entered value is ");
		System.out.print(user_input_numer);
		//#############Double#########################
		Scanner scan1 = new Scanner(System.in);
		System.out.print("\n Enter some decimal value\n ");
		double user_input_double = scan1.nextDouble();
		System.out.print("The entered value is \n ");
		System.out.print(user_input_double);	
		
		//#############String#########################
		Scanner scan2 = new Scanner(System.in);
		System.out.print("\n Enter some string value\n ");
		String user_input_string = scan2.nextLine();
		System.out.print("The entered value is \n ");
		System.out.print(user_input_string);	

	}

}
