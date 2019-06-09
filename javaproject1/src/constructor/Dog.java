package constructor;

public class Dog 
{
	String dname;
	Dog(String name)
    {
		dname=name;
    }
	public static void main(String[] args)
	{
		System.out.println("in main");
		Dog rv1=new Dog("jimmy");
		Dog rv2=new Dog("snoopy");
		Dog rv3=new Dog("tommy");
	    System.out.println(rv1.dname);
		System.out.println(rv2.dname);
		System.out.println(rv3.dname);
		System.out.println("out main");
  }
}	
