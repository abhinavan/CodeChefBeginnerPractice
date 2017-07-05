package beginnerPack;

import java.util.Scanner;

/*
 * Write a program to find the remainder when two given numbers are divided.
 * 
 * -------Input-------------
 * The first line contains an integer T, total number of test cases. 
 * Then follow T lines, each line contains two Integers A and B.
 * 
 * 1<=T<=1000 , 1<=A,B<=10002
 * -------Output-------------
 * 
 * Find remainder when A is divided by B.
 * */
public class FindRemainder 
{
	public static Scanner sc=new Scanner(System.in);
	public static int dividend,divisor,remainder,quotient,testCases;
	
	public static void divide(int dividend,int divisor)
	{
		quotient=dividend/divisor;
		remainder=dividend-(quotient*divisor);
		System.out.println(remainder);
	}
	public static void main(String[] args) 
	{
		System.out.println("Enter testcases ");
		testCases=sc.nextInt();
		if(testCases>=1 && testCases<=1000)
		{
			while(testCases-->0)
			{
				System.out.println("Enter dividend");
				dividend=sc.nextInt();
				System.out.println("Enter divisor");
				divisor=sc.nextInt();
				divide(dividend, divisor);
			}
		}	
	}
}
