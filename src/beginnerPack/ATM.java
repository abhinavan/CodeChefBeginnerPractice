package beginnerPack;

import java.util.Scanner;

/*
 * Pooja would like to withdraw X USD from an ATM.The cash machine would accept the transaction if X is a multiple of 5 
 * and Pooja account balance has enough cash to perform the withdrawal transaction(including bank charges). For each 
 * successful transaction , bank would charge 0.50 USD. Calculate Pooja account balance after an attempted transaction .
 *
 * 	---------Input-------------
 * 
 * Positive integer 0<X<2000 - the amount of cash which Pooja wishes to withdraw
 * Non negative integer 0<=Y<2000 with two digits of precison .Pooja initial account balance
 * 
 * -------------Output---------------
 * 
 * output the account balance after the attempted transaction , given as a number within two digit of precision .
 * If there is not enough money in the account to complete the transaction , output the current bank balance
 * */

public class ATM 
{
	public static int withdrawAmount;
	public static double accountBalance=0.00;
	public static Scanner sc=new Scanner(System.in);
	
	public static double initialiseBalance()
	{
		System.out.println("Initialising account balance ");
		accountBalance=sc.nextDouble();
		if(accountBalance>=0 && accountBalance<2000)
		{
			return accountBalance;
		}
		System.out.println(accountBalance=0);
		return accountBalance=0;
	}
	public static boolean withdrawAmount(int withdrawAmount,double accountBalance)
	{
		if((accountBalance>=withdrawAmount)&&((withdrawAmount%5)==0))
		{
			return true;
		}
		return false;
	}
	public static double calculateRemainingBalance(int withdrawAmount, double accountBalance)
	{
		
		return accountBalance-withdrawAmount;
	}
	public static void main(String[] args) 
	{
		initialiseBalance();
		while(accountBalance>0)
		{
			System.out.println("Enter withdrawal amount ");
			withdrawAmount=sc.nextInt();
			if(withdrawAmount(withdrawAmount, accountBalance)==true)
			{
				accountBalance=calculateRemainingBalance(withdrawAmount, accountBalance);
				System.out.println(accountBalance);
				
			}
			else
			{
				System.out.println(accountBalance);
				break;
			}
			
		}
		
		
	}

}
