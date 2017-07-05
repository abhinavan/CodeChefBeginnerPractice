package beginnerPack;

import java.util.Scanner;

/*
 * You're given an integer N. Write a program to calculate the sum of all the digits of N.
 * 
 * --------Input-------------
 * 
 * The first line contains an integer T, total number of testcases. Then follow T lines, each line contains an integer N.
 * 
 * 1<=T<=1000 ; 1<=N<=10000
 * -------Output--------------
 * 
 * Calculate the sum of digits of N.
 * 
 * 
 * */
public class SumOfDigits 
{
	public static Scanner sc=new Scanner(System.in);
	public static Integer number,testCases;
	public static Integer[] numberArray;
	
	public static void calculate(Integer number)
	{
		
		int remainder,sum=0;
		while(number>0)
		{
			remainder=number%10;
			sum+=remainder;
			number=number/10;
		}
		System.out.println(sum);
		
	}
	public static void main(String[] args) 
	{
		System.out.println("Enter number of testcases");
		testCases=sc.nextInt();
		if(testCases>=1 && testCases<=1000)
		{
			while(testCases-->0)
			{
				System.out.println("Enter the number");
				number=sc.nextInt();
				if(number>=1 && number<=10000)
				{
					calculate(number);
				}
				else
				{
					break;
				}
			}
		}
		
	}

}
