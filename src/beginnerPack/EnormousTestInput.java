package beginnerPack;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * ----Input--------------
 * 
 * The input begins with two positive integers n k(n,k<=10^7).
 * The next n lines of input contains one positive integer t, not greater than 10^9 each
 * 
 * ---------Output--------------
 * 
 * Write a single integer to output , denoting how many integers t , are divisible by k 
 * */
public class EnormousTestInput 
{
	public static Scanner sc=new Scanner(System.in);
	public static int n , k , t;
	public static void main(String[] args) 
	{
		//System.out.println("Enter number of integers");
		n=sc.nextInt();
		ArrayList<Integer> al=new ArrayList<>();
		//System.out.println("Enter divisor");
		k=sc.nextInt();
		if((n<=Math.pow(10, 7))&&(k<=Math.pow(10, 7)))
		{
			while(n-->0)
			{
			//	System.out.println("Enter non negative integer");
				t=sc.nextInt();
				if((t<=Math.pow(10, 9))&&t>0)
				{
					if((t%k)==0)
					{
						al.add(t);
					}
				}
				break;
			}
			System.out.println(al.size());
		}
		
	}

}
