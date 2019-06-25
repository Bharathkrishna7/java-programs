package javasample;

public class Palindrome
{
	public static void main(String[]args)
	{
	int i[]={4,6,5,8};
	int big=i[0];
	for(int j=1;j<=i.length-1;j++)
	{
		if(i[j]>big)
		{
			big=i[j];
		}
	}
	System.out.println(big);
	
	}

}
