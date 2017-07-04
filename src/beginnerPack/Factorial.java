package beginnerPack;

import java.util.Scanner;

/*
 * For any positive integer N,Z(N) is the number of zeroes at the end of decimal form of the number N!.They noticed that the 
 * function never decreases. If we have two numbers N1<N2,then Z(N1)<=Z(N2). It is because we can never lose any trailing 
 * zero by multiplying by any positive integer. We can only get new and new zeroes.The function Z is very interesting , so we 
 * need a computer program that determine its value efficiently.
 * 
 * ----------Input---------------
 * 
 * There is a single positive integer T on the first line of input(equal to about 100000). It stands for the number of 
 * lines to follow.
 * Then there are T lines , each containing exactly one positive integer number N, 1<=N<=1000000000.
 * 
 * --------Output--------------
 * 
 * For every number N , output a single line containing the single non negative integer Z(N).
 * */
public class Factorial 
{
	
	public static long n;
	public static Scanner sc=new Scanner(System.in);
	
	public static long factorial(long n)
	{
		if(n<=0)
		{
			return 1;
		}
		return n*factorial(n-1);
	}
	public static void main(String[] args) 
	{
		int count=0;
		while(true)
		{
			int x=5;
			System.out.println("Enter the number ");
			n=sc.nextLong();
			long result=factorial(n);
			while(result<=1)
			{
				result=result/x;
				x=x*5;
				count++;
			}
			System.out.println(count);
			break;
		}
	
	}

}
