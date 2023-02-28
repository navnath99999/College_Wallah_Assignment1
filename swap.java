package Assignment1;

public class swap
{

	public static void main(String[] args) 
	{
		int num1 = 2 ;
		int num2 = 3 ;
		
		System.out.println("Two numbers are: " +num1+" "+num2);
	
		int temp = num1 ;
		num1 = num2 ;
		num2=temp ;
		
		System.out.println("Numbers After swaping: " +num1+" "+num2);
	}

}
