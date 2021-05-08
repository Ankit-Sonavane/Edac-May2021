import java.util.Scanner;
public class Lab1_Q21 
{
   public static void main(String[] args)
   {	 
	int rem;
	char[] a = {'0','1','2','3','4','5','6','7'};
	String s1 ="";

	System.out.print("Enter Decimal number: ");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();

	while (n!=0) 					
	{
		rem=n%8;				
		s1 =  a[rem] + s1;					
		n=n/8;				
	}											
	
	System.out.print(s1);
	
  }
}