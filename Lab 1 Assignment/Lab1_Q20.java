
import java.util.*;
class Lab1_Q20
{
	public static void main(String args[])
	{
		int n;
		System.out.println("Enter decimal number to convert in Hexadecimal:");
		Scanner sc=new Scanner (System.in);
		n =sc.nextInt();
		System.out.println("Decimal to Hexadecimal Conversion");
		

		long b=0;
		int r, i=1;
		char [] a= {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		String avalue=" ";

		while (n!=0)
		{
			r=n%16;
			n/=16;
			avalue=avalue+a[r];    
			//i=i*10;
			
		}
		
		System.out.print("ConDTH:"+avalue);
		
	}
}



/*
import java.util.*;
class Ass20
{
	public static void main(String args[])
	{
		int num;
		System.out.println("Enter decimal number to convert in octal:");
		Scanner sc=new Scanner (System.in);
		num =sc.nextInt();
		System.out.println("Decimal to Hexadecimal Conversion");
		long hexadecimal=convertDecimalToHexadecimal(num);
		System.out.println("Hexadecimal Number ="+ hexadecimal);
	
	}
	public static long convertDecimalToHexadecimal(int n)
	{
		long b=0;
		int r, i=1;
		char [] a= {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		String avalue=" ";

		while (n!=0)
		{
			r=n%16;
			n/=16;
			avalue=avalue+a[r];    // b+r*i;
			//i=i*10;
			
		}
		
		return avalue;
		
	}
}
*/