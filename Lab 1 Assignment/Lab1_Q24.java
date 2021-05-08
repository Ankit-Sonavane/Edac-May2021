//Q.24

import java.util.*;
 
public class Lab1_Q24
{
	public static void main(String args[]) 
	{
        	int decimal = 0,octal=0, i=0;
   	
        	Scanner sc = new Scanner(System.in);
        	System.out.print("Enter a Binary Num:");
        	String b1 = sc.nextLine();

       		int n = Integer.parseInt(b1);
        	while(n != 0)								
		{
            	 decimal += (n%10)*Math.pow(2, i);  					 
											 
											
            	 n = n /10;							
            	 i++;									
        	} 
		
		i = 1;

		while (decimal != 0) 
		{
		octal += (decimal % 8) * i;
      		decimal = decimal/ 8;
      		i *= 10;
   		 }
   
      		System.out.println("Octal Number : "+ octal);
    	}
}