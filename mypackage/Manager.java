package mypackage;

public class Manager extends Employee
{
	public Manager(String n, double s, int year, int month, int day)
	{
		super(n,s,year,month,day);
		bonus = 0;
	}
	public void setBonus(double b)
	{
		bonus = b;
	}


	public double getSalary()
	{
		double baseSalary = super.getSalary();
		return baseSalary + bonus;
	}
	private double bonus;
}
