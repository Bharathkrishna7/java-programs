package demopack1;
public class Emp
{
	private int empId;
	private String empName;
	private double empSal;
	public int getEmpId()
	{
		return empId;
    }
	public void setEmpId(int empId)
	{
	this.empId=empId;
	}
	public String getEmpName()
	{
		return empName;
    }
	public void setEmpName(String empName)
	{
	this.empName=empName;
	}
	public double getEmpSal()
	{
		return empSal;
    }
	public void setEmpSal(double empsal)
	{
	this.empSal=empSal;
	}
	public class Test
	{
	  public void main(String[] args)
	  {
		  Emp e1=new Emp();
		  e1.setEmpId(20);
		  e1.setEmpName("radha");
		  e1.setEmpSal(5600.2);
		  System.out.println(e1.getEmpId());
		  System.out.println(e1.getEmpName());
		  System.out.println(e1.getEmpSal());
		  }
	   }
	}
