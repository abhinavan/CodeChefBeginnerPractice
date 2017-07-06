package beginnerPack;

import java.util.Scanner;

/*
 * Find the square root of a given integer 
 * 
 * ---------Input---------------
 * 
 * The first line contains an integer T , number of testCases .Each T contains an integer N whose square root needs to be 
 * computed 
 * 
 * ------Output--------------
 * For each line of input , output the square root of the input number 
 * */
public class FindSquareRoot 
{
	public static int testCases;
	public static double inputNumber;
	public static Scanner sc=new Scanner(System.in);
	
	
	public static void calculateMinimumLimit(double number)
	{
		double minLimit=0;
		while((minLimit*minLimit)<=number)
		{
			minLimit++;
		}
		minLimit=minLimit-1;
		//System.out.println(minLimit);
		findSquareRoot(number, minLimit);
		
	}
	
	/*
	 * ----------Logic to find square root--------------
	 * 
	 * (x+r)<=squareRoot(inputNumber)  // x is the minLimit passed as a parameter 
	 * 								   // r is the decimal value which we can add to minLimit and see if their product 
	 * 									  become equal to the product
	 * 
	 * Squaring both sides 
	 * 
	 * (x+r)(x+r)<=inputNumber
	 * 
	 * (x*x)+(r*r)+(2*x*r)<=inputNumber
	 * 
	 * 
	 * */
	public static void findSquareRoot(double number,double minLimit)
	{
		double addFactor=0.01;
		double productOfMinLimit=minLimit*minLimit;
		double tempResult=(addFactor*addFactor)+(productOfMinLimit)+(2*addFactor*minLimit);
		while(tempResult<number)
		{
			addFactor=addFactor+0.01;
			tempResult=(addFactor*addFactor)+(productOfMinLimit)+(2*addFactor*minLimit);
			
		}
		System.out.println((minLimit+addFactor)-0.01);
	}
	public static void main(String[] args) 
	{
		System.out.println("Enter number of testcases");
		testCases=sc.nextInt();
		if(testCases<=20)
		{
			while(testCases-->0)
			{
				System.out.println("Enter number");
				inputNumber=sc.nextDouble();
				calculateMinimumLimit(inputNumber);
			}
			
		}
		
		
		
	}

}
