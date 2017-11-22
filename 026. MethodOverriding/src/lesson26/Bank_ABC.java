package lesson26;

public class Bank_ABC extends BANK
{ 
	int getIntrestRate() // in method overriding you cannot change name/ and return type / and nr. of arguments and this happens between classes
	{
		return 5;
	}
	
	int getIntrestRate(int abc)  //this method is method overloading becouse its overloading within a class
	{
		return 5;
	}
} 
