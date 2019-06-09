package demopack1;

public class Pattern2 
{
	public static void main(String [] args)
	{
		String S="JSPIDERS";
		{
			for(char ch=1;ch<=5;ch++)
			{
				for(char j=1;j<=4;j++)
				{
					if(ch>=j)
					{
						System.out.print(S+" ");
				   }
				}
				System.out.println();
			}
			
		}
	}

}
