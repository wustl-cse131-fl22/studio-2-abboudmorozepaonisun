package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter starting amount.");
		int startAmount = in.nextInt();
		int m = startAmount;
		System.out.println("Enter win limit.");
		int winLimit = in.nextInt();
	
 System.out.println("Enter number of plays per day");
  	int playPerDay = in.nextInt();	
		System.out.println("Enter number of days");
		int totalSimulation = in.nextInt();
	// Outer for loop is days and at the end of the for loop ypu would print the day on the same line as the rest, same concept

	if (startAmount > winLimit)
	{
		System.out.println("Error");
	}
	else
	{
		while (startAmount > 0 && startAmount <= winLimit)
		{
			for(m = startAmount; m <= winLimit; m++);
			{
				double money = Math.random();
				if (money > .5)
				{
					System.out.println(startAmount++);
				}
				else 
				{
					System.out.println(startAmount--);
				}
			}
		}

		if (startAmount <= 0)
		{
			System.out.println("You suck, you lose all your money. DAY RUINED!");
		}
		else
		{
			System.out.println("You win " + winLimit + " stop daydreaming, wake up fool.");
		}
		
	}
		
		
	}

}
