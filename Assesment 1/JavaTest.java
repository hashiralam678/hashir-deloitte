import java.util.Scanner;

class JavaTest 
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no :");
		int n = sc.nextInt();
		int sum=0,rem;
		if(n<0)
		{
			System.out.println("Invalid Input");
		}
		else
		{
		while(n>0)
		{
			rem=n%10;
			if(rem%2!=0)
			{
				sum=sum+rem;
			}	
			n=n/10;
			
		}
		System.out.println("Sum of odd digits :"+sum);
		}	
	}

}