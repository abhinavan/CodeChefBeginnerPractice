package beginnerPack;

import java.util.Scanner;

/*
 * Calculate factorial of small positive integers 
 * ---------Input--------------
 * An integer t, 1<=t<=100,denoting the number of test cases ,followed by t lines , each containing a single integer n,
 * 1<=n<=100
 * 
 * --------Output----------------
 * 
 * For each integer n given at input , display a line with value of n!
 * 
 * */
public class SmallFactorial 
{
	public static Scanner sc=new Scanner(System.in);
	public static int testCase;
	
	public static long takeInput()
	{
		
		// taking number as input whose factorial is to be found
		int number=sc.nextInt();
		// input number must be greater or equal than 1 and less or equal than 100
		if(number>=1 && number<=100)
		{
			// calling calculateFactorial(number) which will find factorial
			return calculateFactorial(number);
		}
		return 0;
		
	}
	public static long calculateFactorial(int number)
	{
		// if number is less or equal than 0 , then it will return 1;
		if(number<=0)
		{
			return 1;
		}
		// recursion
		return number*calculateFactorial(number-1);
	}
	public static void main(String[] args) 
	{
		// taking number of testcases
		testCase=sc.nextInt();
		// input number must be greater or equal than 1 and less or equal than 100
		if(testCase>=1 && testCase<=100)
		{
			// decrementing test case by 1 and performing operation on each step
			while(testCase-->0)
			{
				// calling takeInput() method
				if(takeInput()==0)
				{
					break;
				}
				System.out.println(takeInput());
			}
		}
		
		
		
	}

}
