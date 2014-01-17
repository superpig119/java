package mypackage;

import java.util.*;

public class Employee extends Person
{
	public Employee(String n, double s, int year,int month,  int day)
	{
		super(n);
//		name = n;
		salary = s;
		GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);
		hireDay = calendar.getTime();
	}

	public String getDescription()
	{	
		return String.format("an employee with a salary of $%.2f", salary);
	}
/*
	public String getName()
	{
		return name;
	}
*/
	public double getSalary()
	{
		return salary;
	}

	public Date getHireDay()
	{
		return (Date)hireDay.clone();
	}

	public void raiseSalary(double byPercent)
	{
		double raise = salary * byPercent / 100;
		salary += raise;
	}

//	private String name;
	private double salary;
	private Date hireDay;
}
