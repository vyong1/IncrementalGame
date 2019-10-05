package core;

public class Main
{
	public static void main(String[] args)
	{
		PeriodicTimer p = new PeriodicTimer(() -> {System.out.println("Beans");});
		System.out.println("Hi!");
	}
}
