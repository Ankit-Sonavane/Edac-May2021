import java.util.*;
class Lab1_Q7
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int x= sc.nextInt();
		int end=11;
		for(int start=1; start<end; start++)
		{
			int y=start*x;
			System.out.println(x+" x "+start+" = "+y );
		}
		
	}
	
}