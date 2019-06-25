package Arrays;

public class highestvalue 
{
	public static void main(String[]args)
	{
		int i[]=new int[4];
		i[0]=2220;
		i[1]=511111;
		i[2]=824;
		i[3]=614;
		if(i[0]>i[1] && i[0]>i[2] && i[0]>i[3])
		{
			System.out.println("i[0]is grater value");
		}
		else if(i[1]>i[2] && i[1]>i[3])
		{
			System.out.println("i[1]is grater value");
		}
		else if(i[2]>i[3])
		{
			System.out.println("i[2] is grater value");
		}
		else
		{
			System.out.println("i[3] is grater value");
		}
	
	
	System.out.println("*************");
		
	int a1[]={26,54,86,81};
	int big=a1[0];
	for(int k=1;k<=a1.length-1;k++)
	{
		if(a1[k]>big)
		{
			big=a1[k];
		}
	}
	System.out.println(big); 
	}

}
