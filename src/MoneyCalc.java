import java.util.Scanner;

public class MoneyCalc
{
	public static void main (String args[])
	{		
		
	double pay = 0;
	int hours = 0;
	double totalPay;
	boolean flag;
	
	System.out.println("Please enter your wage with the following format: \"0.00\".");	
	
	flag = false;
	
	do 
	{
		Scanner userPay = new Scanner (System.in);
		if (userPay.hasNextDouble())
		{
			flag = true;
			pay = userPay.nextDouble();
		}
		else
		{
			System.out.println("Format of entry was incorrect, please try again.");
		}
		
	} while (!flag);
	
	System.out.println("Next, enter the number of hours as a single integer.");
	
	flag = false;
	
	do
	{
		Scanner userHours = new Scanner (System.in);
		if (userHours.hasNextInt())
		{
			flag = true;
			hours = userHours.nextInt();
		}
		else
		{
			System.out.println("Format of entry was incorrect, please try again.");
		}
	} while (!flag);
	
	if (hours>40)
	{
		totalPay = (pay * 40) + (pay * 1.5 * (hours - 40));
	}
	else
	{
		totalPay = pay * hours;
	}

	System.out.printf("Your total pay is: $%.2f", totalPay);
	}
}

//Still unable to figure out why I cannot close the scanners.