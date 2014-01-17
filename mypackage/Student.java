package mypackage;

public class Student extends Person
{
	public Student(String n, String m)
	{
		super(n);
		major = m;
	}

	public String getDescription()
	{
		return "a student major in " + major;
	}

	private String major;
}
