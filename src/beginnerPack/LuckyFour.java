package beginnerPack;

import java.util.Scanner;
/*
 * Kostya likes the number 4 much. Of course! This number has such a lot of properties
 * 
 * Impressed by the power of this number, Kostya has begun to look for occurrences of four anywhere. 
 * He has a list of T integers, for each of them he wants to calculate the number of occurrences of the digit 4 in the
 *  decimal representation. He is too busy now, so please help him.
 * ---------Input-----------
 * The first line consists of single integer T, denoting the number of integers in list.
 * Then there are T lines each consisting of single integer from the list.
 * 
 * ----Output-------------
 * 
 * Output T lines . Each of these lines should contain the number of occurences of the digit 4 in respective integer  
 * 
 * */
public class LuckyFour 
{
	public static Integer number,testCases;
	public static Scanner sc=new Scanner(System.in);
	public static void findFour(Integer number)
	{
		String temp=number.toString();
		char[] c=temp.toCharArray();
		int count=0;
		for(int i=0;i<c.length;i++)
		{
			if(c[i]=='4')
			{
				count++;
			}
		}
		System.out.println(count);
	}
	public static void main(String[] args) 
	{
		System.out.println("Enter number of testcases");
		testCases=sc.nextInt();
		if(testCases>=1 && testCases<=10000)
		{
			while(testCases-->0)
			{
				System.out.println("Enter number");
				number=sc.nextInt();
				findFour(number);
			}
				
		}
		
		
	}

}
