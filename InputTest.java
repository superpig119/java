import java.util.*;

public class InputTest
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("What's your name?");
		String name = in.nextLine();

		System.out.print("How old are you?");
		int age = in.nextInt();
		
		System.out.println("Hello " + name + ", next year you will be " + (age + 1) + "?");

	}
}
