import java.util.*;
import java.text.*;
public class cs1
{
	public static void main (String [] args)
	{
	Scanner inScan = new Scanner(System.in);
	NumberFormat currency = NumberFormat.getCurrencyInstance(Locale.US);
	do
	{
	double plain = 10.00, pepperoni = 12, slice = 2, cherrypie = 10, charm = 50;	
	boolean inputcorrect = true;
	double totalcharms = 0, totalcherry = 0, totalplain = 0, totalpepperoni = 0, totalboth = 0, totalpizza = 0;	
	int howmanycharms = 0, howmanyslices = 0, howmanywholepies = 0, howmanyplain = 0, howmanypepperoni = 0, changemind = 0;
	double totalbill = 0, totaltax = 0;
	System.out.println("");
	System.out.println("");
	System.out.println("");
	System.out.print("	Welcome to Pies, Pies, and Pi's! ");
	System.out.println("");
	System.out.println("");
	System.out.println("");
	System.out.print(" Where we proudly have been serving for 50 years pizza, cherry pies and gold pi charms!");
	System.out.println("");
	System.out.println("");
	System.out.print("	This is the only place you can eat dinner and dessert, while also commemorating the world's most famous transcendental number! ");
	System.out.println("");
	System.out.println("");
	System.out.println("");	
	do
	{
		System.out.println("");
		System.out.println("");
		System.out.println( " Is there a customer to be waited on?");
		System.out.println( " Please enter yes or no:");
		System.out.println("");
		System.out.println("");
		String yesono = inScan.nextLine();
		if (yesono.equals("yes"))
		{
			inputcorrect = true ;
		}
		else if (yesono.equals("no"))
		{
			System.exit(0);
			inputcorrect = true;
		}
		else
		{ 
			System.out.println("Please enter yes or no. "); 
			inputcorrect = false;
		}
	}
	while (inputcorrect == false);
		
	System.out.println("");
	System.out.println("");
	System.out.println(" Do you have our special Pie Card? ");
	System.out.println("");
	System.out.println(" Enter 1 for yes ");
	System.out.println(" Enter 2 for no ");
	System.out.println("");
	System.out.println("");
	int card = inScan.nextInt();
	while (card != 1 && card != 2)
	{ 
		System.out.print( " Please enter 1 for yes or 2 for no. Thank you!"); 
		card = inScan.nextInt();
	}	
	if (card == 1)
	{
		plain = 10;
		pepperoni = 12 - 2;
		slice = 1.75;
		cherrypie = 8;
		charm = 45;
		
	
		System.out.println("");
		System.out.println("");
		System.out.print(" Great! You will recieve the following discounts with your purchase!");
		System.out.println("");
		System.out.println("");
		System.out.print(" Pepperoni pizza for the price of plain, you save $2.00! ");
		System.out.println("");
		System.out.println("");
		System.out.print(" $0.25 off a slice of Fruit Pie or $2.00 off the entire pie!");
		System.out.println("");
		System.out.println("");
		System.out.print(" 10% off each charm you buy!");
		System.out.println("");
		System.out.println("");
		System.out.print("And 10% off over and above any other discounts if the overall order (after other discounts) is $100.00 or more!");
		System.out.println("");
			
	}			
	System.out.println("");
	System.out.println("");
	System.out.print(" Let me show you our menue: ");
	System.out.println("");
	System.out.println("");
	System.out.println("");
	System.out.println("");
	System.out.print(" Pizza: Plain: $" + currency.format(plain) + " Pepperoni: $" + currency.format(pepperoni) + "." );
	System.out.println("");
	System.out.print(" Our Pizzas come in one size");
	System.out.println("");
	System.out.println("");
	System.out.print(" Cherry Pies: $" + currency.format(slice) + " per slice or only $" + currency.format(cherrypie) + " for the entire pie!");
	System.out.println("");
	System.out.print(" One whole pie has 6 slices.");
	System.out.println("");
	System.out.println("");
	System.out.print(" Pi Charms: Only $" + currency.format(charm) + " for each charm! They are 14k gold!");
	System.out.println("");
	System.out.println("");
	
	do
	{	
		System.out.println("");
		System.out.println("");
		if (changemind == 0)
		{
			System.out.print(" Ok, now that you have seen your choices, let's get started! ");	
			System.out.println("");
			System.out.println("");
		}
		else 
		{
			System.out.println("");
			System.out.println(""); 
			System.out.print(" Let's start all over again :)");
			System.out.println("");
			System.out.println("");
		}
		System.out.print(" Would you like pizza? ");
		System.out.println("");
		System.out.println("");
		System.out.println(" Enter 1 for yes ");
		System.out.println(" Enter 2 for no ");
		System.out.println("");
		System.out.println("");
		// must figure out how to allow for user to chose both plain and pepperoni.
		inScan.nextLine();
		int iwantpizza= inScan.nextInt();
		if	(iwantpizza == 1)
		{
			System.out.print(" Would you like a plain pizza, pepperoni pizza or both? ");
			System.out.println("");
			System.out.println("");
			System.out.println(" Enter 1 for plain ");
			System.out.println(" Enter 2 for pepperoni ");
			System.out.println(" Enter 3 for both ");
			System.out.println("");
			int plainpizza = inScan.nextInt();
			
				if (plainpizza == 1)
				{
					System.out.print("How many plain pizzas would you like?");
					System.out.println("");
					System.out.println("");
					howmanyplain = inScan.nextInt();
					totalplain = howmanyplain * plain; 
						
				}
				else if (plainpizza == 2)
				{
					System.out.print(" How many pepperoni pizzas would you like?");
					System.out.println("");
					System.out.println("");
					howmanypepperoni = inScan.nextInt();
					totalpepperoni = howmanypepperoni * pepperoni;
				}
				else if (plainpizza == 3)
				{
					System.out.print("How many plain pizzas would you like?");
					System.out.println("");
					System.out.println("");
					howmanyplain = inScan.nextInt();
					
					System.out.print(" How many pepperoni pizzas would you like?");
					System.out.println("");
					System.out.println("");
					howmanypepperoni = inScan.nextInt();
					totalpepperoni = howmanypepperoni * pepperoni;
					totalplain = howmanyplain * plain; 

					//totalboth = (howmanypepperoni * pepperoni) + (howmanyplain * plain); 
				}
		}
		
		totalpizza = totalpepperoni + totalplain;
				
		System.out.print(" Would you like Cherry Pie?");
		System.out.println("");
		System.out.println("");
		System.out.println(" Enter 1 for yes ");
		System.out.println(" Enter 2 for no ");
		System.out.println("");
		System.out.println("");
		int cherrypies = inScan.nextInt();
		
		if (cherrypies == 1)
		{
			System.out.print("How many slices would you like?");
			System.out.println("");
			System.out.println("");
			howmanyslices = inScan.nextInt();
			totalcherry = 0;
			totalcherry += ((howmanyslices / 6) * cherrypie);
			totalcherry += ((howmanyslices % 6) * cherrypie);
			howmanywholepies =	(howmanyslices / 6);
			howmanyslices =(howmanyslices % 6);
		}
		System.out.print(" Would you like Pi charms? ");
		System.out.println("");
		System.out.println("");
		System.out.println(" Enter 1 for yes ");
		System.out.println(" Enter 2 for no ");
		System.out.println("");
		System.out.println("");
		
		System.out.println("");
		System.out.println("");
		int picharms = inScan.nextInt();

		if (picharms == 1)
		{
			System.out.print("How many charms would you like?");
			System.out.println("");
			System.out.println("");
			howmanycharms = inScan.nextInt();
			totalcharms = howmanycharms * charm;
		}	


	totalbill = totalcharms + totalcherry + totalpizza; 
	if (card == 1)
	{ 
		totalbill = totalbill -(0.10 * totalbill); 
	}	
	totaltax = (0.07 * totalbill ) + totalbill;
		
	System.out.print("You have asked for " + howmanyplain + " plain pizzas for the total price of $" + totalplain);
	System.out.println("");
	System.out.println("");
	System.out.print("You have asked for " + howmanypepperoni + " pepperoni pizzas for the total price of $" + totalpepperoni);
	System.out.println("");
	System.out.println("");
	System.out.print("You have asked for " + howmanyslices + " slices of cherry pie and " + howmanywholepies + " whole pies for the price of $" + totalcherry);
	System.out.println("");
	System.out.println("");
	System.out.print("You have asked for " + howmanycharms + " pi charms for the total price of $" + totalcharms);
	System.out.println("");
	System.out.println("");
	System.out.print("Your subtotal without tax is $" + totalbill); 
	System.out.println("");
	System.out.println("");
	System.out.print(" Would you like to make any chnages?");
	System.out.println("");
	System.out.println("");
	System.out.println(" Enter 1 for yes ");
	System.out.println(" Enter 2 for no ");
	System.out.println("");
	System.out.println("");
	changemind = inScan.nextInt();

}
while (changemind == 1);
	

System.out.println("");
System.out.println("");
System.out.print("Your total with tax " + totaltax); 
System.out.println("");
System.out.println("");
	
	
System.out.print(" Please type in the amount you are paying: ");
System.out.println("");
System.out.println("");
double userpay = inScan.nextInt();
double change = 0.0;
boolean correctpay = false;
System.out.print(userpay);
while (correctpay == false)
{
	if (userpay >= totaltax)
	{
	System.out.print(userpay);

		change = userpay - totaltax;
		correctpay = true;
	}
	else 
	{		
		change = totaltax - userpay;
		System.out.println(" I am sorry, you didn't pay enough. Please pay the difference of $" + change + ". Thank you!");
		System.out.println("");
		System.out.println("");
		userpay = inScan.nextInt();
		correctpay = false;
	}	
		
}
	//10% issue
System.out.println("");
System.out.println("");	
System.out.print(" You paid $" + userpay + ". Your change is $" + change); 
System.out.println("");
System.out.println("");
System.out.print(" Thank you for shopping with us! Have a great day!");
System.out.println("");
}
while (true);
	//what if user under pays? must place a test.
	//need a loop back to beginig
	//fix 10% of total
	//fix price for each?
	}
}	