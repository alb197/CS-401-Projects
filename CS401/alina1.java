import java.util.*;

public class alina1
{
	public static void main (String [] args)
	{
	Scanner inScan = new Scanner(System.in);
	
	//do
	//{
	
	System.out.println("");
	System.out.println("");
	System.out.println("");
		System.out.print("	Welcome to Pies, Pies, and Pi's! ");
	System.out.println("");
	System.out.println("");
	System.out.println("");
	System.out.print(" Where we proudly have been serving for 50 years pizza, cherry pies and gold p charms!");
	System.out.println("");
	System.out.println("");
	System.out.print("	This is the only place you can eat dinner and dessert, while also commemorating the world's most famous transcendental number! ");
	System.out.println("");
	System.out.println("");
	System.out.println("");
	
	System.out.println(" Do you have our special Pie Card? ");
	String card = inScan.nextLine();
		if (card.equals("yes"))
			{
				System.out.print(" Great! You will recieve the following discounts with your purchase!");
				System.out.println("");
				System.out.println("");
				System.out.print(" Pepperoni Pizza for the Price of plain, you save $2.00! ");
				System.out.println("");
				System.out.println("");
				System.out.print(" $0.25 off a slice of Fruit Pie or $2.00 off the entire pie!");
				System.out.println("");
				System.out.println("");
				System.out.print(" 10% off each charm you buy and 10% off over and above any other discounts if the overall order (after other discounts) is $100.00 or more!");
		    }
		else if	card.equals("no"))
			{	
				System.out.print(" That's alright! Let me show you our menue ");
				System.out.println("");
				System.out.println("");
				System.out.print(" Pizza [one size]: Plain: $10.000 Pepperoni: $12.00 ");
				System.out.print(" Cherry Pies: $2.00 per slice or $10.00 for a whole pie [a whole pie has 6 slices]");
				System.out.print(" Pi Charms: $50.00 each [they are 14k gold]");
				System.out.println("");
				System.out.println("");
		    }
			
			System.out.print(" Would you like a plain pizza? Please state yes or no.");
			String plainpizza = inScan.nextLine();
			if (plainpizza.equals("yes"))
				{
					System.out.print("How many plain pizzas would you like?");
					int howmanyplain = inScan.nextInt();
					
				}
			else if (plainpizza.equals("no"))
			    {
					System.out.print(" How many peperoni pizzas would you like?");
					int howmanypeperoni = inScan.nextInt();
				}
				
			System.out.print(" Would you like Cherry Pie");
			String cherrypie = inScan.nextLine();
			if (cherrypie.equals("yes"))
				{
					System.out.print("How many slices would you like?");
					int howmanyslices = inScan.nextInt();
						if (howmanyslices = 6)
						{
							wholepie = 10
						}
						else 
						
				}
			
			
			
		
	System.out.print( " Is there another customer behind you who needs to be waited on?");
	System.out.println("");
	System.out.println("");
	String yesono = inScan.nextLine();
		if (yesono.equals("yes"))
			{
				System.out.print(" Program will restart the while loop"); //must figure out how to do the while loop)
			}
		else if (yesono.equals("no"))
			{
				System.exit(0);
			}
		else
			{ 
				System.out.println("Please enter yes or no");
			}
		
	int plain = 10, pepperoni = 12, slice = 2, cherrypie = 10, charm = 50 ;	
	
	
		
	
    //}
 
   }

}	
	
	