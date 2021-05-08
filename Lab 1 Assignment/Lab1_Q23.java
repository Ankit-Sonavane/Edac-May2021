import java.util.Scanner;


public class Lab1_Q23 
{

    public static void main(String[] args)
{
	System.out.print("Enter Binary num up to 16 bits:");
        Scanner sc = new Scanner(System.in);
        int b1 = sc.nextInt();
       
        String hex[] = {"0","1","2","3","4","5","6","7","8","9","A", "B", "C", "D", "E", "F"};
        String bin[] = {"0000","0001","0010","0011","0100","0101","0110","0111","1000","1001","1010","1011","1100","1101","1110","1111"};
        String s1 ="";
	String num ="";
    
        int rem;
        while (b1 > 0)							
	 {
            rem = b1 % 10000;						
            b1 = b1 / 10000;
            num = "" + rem;						
            if (num.length() < 4) 
		{
                String zero = "0";
                num = zero + num;
           	}

            int a = 0,b = 0;

            for (int i = 0; i < bin.length;i++)	
		 { 
                  String b2 = bin[i];					
                  String b3 = hex[i];					
                  for (int j = 0; j < num.length();j++) 
		 { 
                    char c = num.charAt(j);				
                    char d = b2.charAt(j);				
                    a = ((int) (c));
                    b = ((int) (d));
                    if (a != b)
                        break;
                }
                if (a == b)
                    s1 = b3 + s1;
		}

         }
        System.out.println("Hex Value is:"+ s1);
        }

    }