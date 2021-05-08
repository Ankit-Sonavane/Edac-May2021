import java.util.*;
class Lab1_Q6
{
public static void main(String[]args)
{

Scanner sc = new Scanner(System.in);
int a,b,p,q,r,s,t;

System.out.println("Enter First Number:");
a=sc.nextInt();

System.out.println("Enter Seccond Number:");
b=sc.nextInt();

p=a+b;
q=a-b;
r=a*b;
s=a/b;
t=a%b;

System.out.println("Addition:"+p);
System.out.println("Subraction:"+q);
System.out.println("Multiplication:"+r);
System.out.println("Division:"+s);
System.out.println("Modulus:"+t);
}
}
