package beginnerPack;

import java.util.Scanner;

/*
 * Given an integer N, write a program to reverse the given number
 * 
 * -------Input--------
 * The first line contains an integer T, total number of testCases . Then follow T lines , each line contains an integer N
 * 
 * --------Output----------
 * 
 * Display the reverse of number N 
 * */
public class ReverseTheNumber 
{
	public static Scanner sc=new Scanner(System.in);
	public static Integer number,testCases;
	public static void reverseNumber(Integer number)
	{
		String temp=number.toString();
		char[] c=temp.toCharArray();
		StringBuffer sb=new StringBuffer();
		for(int j=c.length-1;j>=0;j--)
		{
			sb.append(c[j]);
		}
		System.out.println(sb);
	}
	public static void main(String[] args) 
	{
		System.out.println("Enter number of testcases");
		testCases=sc.nextInt();
		if(testCases>=1 && testCases<=1000)
		{
			while(testCases-->0)
			{
				System.out.println("Enter number");
				number=sc.nextInt();
				reverseNumber(number);
			}
		}
		
	}

}
