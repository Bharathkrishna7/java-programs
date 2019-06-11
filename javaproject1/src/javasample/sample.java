package javasample;

public class sample
{
	public static void main(String [] args)
	{
		String s="radha";
		char ch='a';
		{
			for(int i=1;i<=4;i++)
			{
				System.out.println("print "+s);
				System.out.println("print "+ch);
			}
			
		}
		
		int a[]={24,64,84,65,41};
		int big=a[0];
		for(int i=1;i<=a.length-1;i++)
		{
			if(a[i]>big)
			{
				big=a[i];
			}
		}
		System.out.println(big);
	}

}
