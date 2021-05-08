import java.util.*;
 
class Lab1_Q18
{
	public static void main(String args[]) 
	{
        	int decimal1 = 0,rem,decimal2 = 0, i=0,binary=0;
   	
        	Scanner sc = new Scanner(System.in);

        	System.out.print("Enter First Binary Num:");
        	String b1 = sc.nextLine();

		System.out.print("Enter Second Binary Num:");
        	String b2 = sc.nextLine();

       		int n1 = Integer.parseInt(b1);
      		int n2 = Integer.parseInt(b2);
        	while(n1 != 0 && n2 != 0)						
		{
            	 decimal1 += (n1%10)*Math.pow(2, i); 					 
		 decimal2 += (n2%10)*Math.pow(2, i); 					 
											
            	 n1 = n1 /10;								
            	 n2 = n2 /10;	
		 i++;									
        	} 
   
      		System.out.println("Decimal Number : "+ decimal1);
		System.out.println("Decimal Number : "+ decimal2);
		int result;
		result = decimal1*decimal2;
		
		System.out.println("result : "+ result);
		int j=1;
		while (result!=0) 					
		{
		rem = result % 2;				
		result = result/2;					
		binary = binary + rem*j;		
		j= j*10;					
		}
		System.out.print(binary);	
    	}
}

