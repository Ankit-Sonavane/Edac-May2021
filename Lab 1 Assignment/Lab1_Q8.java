class Lab1_Q8
{
	public static void main(String args[])
	{
		
		for(int row=1;row<=4;row++)
		{
			for(int col=1;col<=25;col++)
			{
				if(row==1 & col==4 | row==2 & col==4 | row==3 & col==1 | row==3 & col==4 | row==4 & col==2 | row==4 & col==3)
				{
					System.out.print("J");
				}
				else if(row==1 & col==8 | row==2 & col==7 | row==2 & col==9 | row==3 & col==6 | row==3 & col==7 | row==3 & col==8 | row==3 & col==9 | row==3 & col==10 | row==4 & col==5 | row==4 & col==11)
					{
						System.out.print("a");
					}
					else if(row ==1 & col==12 | row==1 & col==18 | row==2 & col==13 | row==2 & col==17 | row==3 & col==14 | row==3 & col==16 | row==4 & col==15)
					{
						System.out.print("v");
					}
					else if(row==1 & col==22 | row==2 & col==21 | row==2 & col==23 | row==3 & col==20 | row==3 & col==21 | row==3& col==22 | row==3 & col==23 | row==3 & col==24 |row==4 & col==19 | row==4 & col==25)
					{
						System.out.print("a");
					}
					else
					{
						System.out.print(" ");
					}
				
				
			}
			System.out.println();
		}
	}
}	