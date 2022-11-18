import java.util.*;
class AlphabetToAsciiValue
{
	public static void main(String vaishnu[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the letter which you want to chack");
		
		char c=((sc.nextLine()).charAt());
		int a = c;  
		System.out.println("The ASCII value of " + c + " is: " + a);  

	}
}