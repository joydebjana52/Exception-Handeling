import javax.swing.JFrame;

// how to create custom exception

class AgeInvalidException extends Exception
{
	AgeInvalidException()
	{
		super("Age is invalid !");
	}
}

class Example
{
	public static void main(String[] args)
	{
		System.out.println("Program started...");

		try
		{
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			System.out.println("We have got two numbers");
			int result = a/b;
			System.out.println(result);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Division by zero");
			System.out.println(e.getMessage());
		}
		catch(NumberFormatException e)
		{
			System.out.println("Invalid numbers");
			System.out.println(e.getMessage());
		}
		catch(Exception e)
		{
			System.out.println("Error !");
			System.out.println(e.getMessage());
		}

		System.out.println("Program Terminated...");
	}
}