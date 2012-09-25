import java.util.*;

public class lab3
{
	public static void main (String [] args)
	{
	
int x;
	Scanner inScan = new Scanner(System.in);
	System.out.println("");
	System.out.println("");
	System.out.print(" Hello! My name is Bob, what's your name?");
	System.out.println("");
	System.out.println("");
	System.out.println("");
	String name = inScan.nextLine();
	System.out.println("");
	System.out.println("");
	System.out.println("");
	System.out.println("");
	System.out.println("");
	System.out.println("");
	System.out.print( "Nice to meet you " + name + "! ");
	System.out.println("");
	System.out.println("");
	System.out.println(" Let's calculate Logs!");
	System.out.println("");
	System.out.println("");
	System.out.println("");
	System.out.println("");
	System.out.println("");
	System.out.println("");
	System.out.println("");


	
	
	while (true)
	{
	
	System.out.print( name + ", Please enter an integer base, b, greater than 1: ");
	System.out.println("");
	System.out.println("");
	System.out.println("");
	System.out.println("");
	int b = inScan.nextInt();
		
		if (b <= 1)
		{ 
		
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.print( name + "! Brain fart? The base, b, has to be greater than 1. Try again next time!");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("Goodbye! ");
			System.out.println("");
		System.exit(0);
	}

		
	do 
	{ 
	System.out.println("");
	System.out.println("");
	System.out.println("");
	System.out.print( name + ", Please enter a positive integer X: ");
	System.out.println("");
	System.out.println("");
	System.out.println("");
	System.out.println("");
	x = inScan.nextInt();
	
	if (x <= 0) 
	{
	System.out.println("");
	System.out.println("");
	System.out.println("");
	System.out.print( " Seriously?  " + name + ", Please pay attention to my instructions. Please enter a positive integer X!");
	System.out.println("");
	}
	}  while  (x <= 0);
		
			
	System.out.println("");
	System.out.println("");
	System.out.println("");
	System.out.print("Good Job!" + name + "! let's calculate: ");
	System.out.println("");
	
		int count = 0;
		int x1= x;
		while (x>=b)
		{
		x/=b;
		count++;
	
	}
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("Answer: ");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.print( "Using a given base, b = " + b + ", " );
		System.out.println("");
		System.out.print( "We define Y = logbX to be an exponent such that b^Y = X." );
		System.out.println("");
		System.out.print( "And X = " + x1 + ".");
		System.out.println("");
		System.out.print( "So, your Y = " + count + "."); 
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("Let's do it again!");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
	
	
	
	}
	}	
}