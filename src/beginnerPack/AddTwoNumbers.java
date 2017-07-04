package beginnerPack;

import java.util.Scanner;

/*
 * Given two integers A and B , write a program to add two integers 
 * 
 * ----------Input--------------------
 * The first line contains an integer T, total number of test cases . Them follow T lines, each line contains two integers A and B 
 * 
 * ---------Output--------------------
 * 
 * Add A and B , display the result
 * */
public class AddTwoNumbers 
{
	public static int a , b,testCases;
	public static Scanner sc=new Scanner(System.in);
	public static int addNumbers()
	{
		System.out.println("Enter first number ");
		a=sc.nextInt();
		b=sc.nextInt();
		
		if((a>=1 && a<=10000) && (b>=1 && b<=10000))
		{
			return a+b;
		}
		return -1;
	}
	public static void main(String[] args) 
	{
		System.out.println("Enter number of testcases ");
		testCases=sc.nextInt();
		
		if(testCases>=1 && testCases<=10000)
		{
			while(testCases-->0)
			{
				System.out.println(addNumbers());
			}
		}
		
		
		
	}

}
