import java.util.*;
class Lab1_Q19
{
	public static void main(String args[])
	{
		int num;
		System.out.println("Enter decimal number to convert in binary:");
		Scanner sc=new Scanner (System.in);
		num =sc.nextInt();
		System.out.println("Decimal to Binary Conversion");
		long binary=convertDecimalToBinary(num);
		System.out.println("Binary Number ="+ binary);
	
	}
	public static long convertDecimalToBinary(int n)
	{
		long b=0;
		int r, i=1;
		
		while (n!=0)
		{
			r=n%2;
			n/=2;
			b=b+r*i;
			i=i*10;
			
		}
		return b;
		
	}
}