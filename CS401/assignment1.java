import java.util.*;

public class assignment1
{
	public static void main (String [] args)
	{
	Scanner inScan = new Scanner(System.in);
	
	System.out.print("Welcome to Pies, Pies, and Pi's! Do you have our special Pie card? ");
	
	String yesono = inScan.nextLine();
		if (yesono.equals("yes"))
	{
			System.out.println("Please enter the card number");
		}
		else if (yesono.equals("no"))
		{
			System.out.println("Would you like the special card? you will get a disscount!");
		
		} 
		
		else
		{ 
		System.out.println("Please enter yes or no");
		}
	
	String card = inScan.nextLine();
		if (card.equals("yes"))
		{
			System.out.println("Please copy down the following number once we generate the card number for you.");
		Random numbgen = new Random();
		
	for (int i = 0; i < 10; i++) {
	int numb = numbgen.nextInt(6) + 1;
	System.out.println(numb);
	}
	}
		else 
		{
		System.out.println("Next Function");
		}		
		
		//Random numbgen = new Random();
		
	//for (int i = 0; i < 10; i++) {
	//int numb = numbgen.nextInt(6) + 1;
	//System.out.println(numb);
	//}
	
	
//String cardnumbs = inScan.nextLine();
//{
//Writer output = null;
  //File cardfile = new File("card.txt");
  //output = new BufferedWriter(new FileWriter(cardfile));
  //output.write(cardnumbs);
  //output.close();
 //}
  
	//FileWriter cardfile = new FileWriter("cardnumbers.txt");
	//BufferedWriter cards = new BufferedWriter(cardfile);
	//String cardnum = inScan.nextLine(); 
	//cards.write(cardnum);
	//out.close();
  
	//private static Random rnd = new Random();

	//public static String getRandomNumber(int digCount) {
		//StringBuilder sb = new StringBuilder(digCount);
    //for(int i=0; i < digCount; i++)
      //  sb.append((char)('0' + numb.nextInt(10)));
    //return sb.toString();
	//}
	//new BigInteger(getRandomNumber(10000));
	
    }
 
   }

	
	
	