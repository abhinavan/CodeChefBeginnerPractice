package beginnerPack;

import java.util.Scanner;
/*
 * Given an integer N , Write a program to obtain sum of first and last digit of number.
 * 
 * -------Input--------------
 * The first line contains an integer T , number of testCases .Then follow T lines , each contains an integer N 
 * 1<=T<=1000
 * --------Output----------
 * 
 * Display the sum of first and last digit of N .
 * */
public class FirstAndLastDigit 
{
	public static Scanner sc=new Scanner(System.in);
	public static Integer number,testCases;
	public static void operate(Integer number)
	{
		String temp=number.toString();
		int a=Integer.parseInt(temp.substring(temp.length()-1));
		int b=Integer.parseInt(temp.substring(0,1));
		System.out.println(a-b);
	}
	public static void main(String[] args) 
	{
		System.out.println("Enter number of testCases");
		testCases=sc.nextInt();
		if(testCases>=1 && testCases<=1000)
		{
			while(testCases-->0)
			{
				System.out.println("Enter number");
				number=sc.nextInt();
				operate(number);
			}
		}
		
	}

}
