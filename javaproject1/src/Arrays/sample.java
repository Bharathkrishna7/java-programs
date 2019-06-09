package Arrays;

public class sample
{
	public static void main(String[] args)
	{
		int i[] =new int[4];
		
		i[0]=20;
		i[1]=51;
		i[2]=84;
		i[3]=64;
		//for(int k=0;k<=3;k++)
		//{
			System.out.println(i[1]);
			System.out.println(i[2]);
			System.out.println(i[3]);
		//}
        
		int big=i[0];
		for(int j=1;j<=i.length;j++)
		{
			if(i[j]>big)
			{
				big=i[j];
			}
		}
			System.out.println(big);
	}

}
