package Loop;

public class Palindrome {

	public static void main(String[] args) {
		int number = 414414414,
		rev=0,
		rem,
		temp;
		
		temp=number;
		
		while(temp!=0) 
		{
			rem = temp%10;
			rev = rev *10 + rem;
			temp /= 10; 
		}
		if(number==rev) 
		{
			System.out.println("Given number is Palindrome");
		}
		else
		{
		System.out.println("Not a Palindrome");	
		}
		}
}
