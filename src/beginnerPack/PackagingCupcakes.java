package beginnerPack;

import java.util.Scanner;

/*
 *  Chef has finished baking and frosting his cupcakes, it's time to package them. Chef has Ncupcakes, 
 *  and needs to decide how many cupcakes to place in each package. Each package must contain the same number of cupcakes. 
 *  Chef will choose an integer A between 1 and N, inclusive, and place exactly A cupcakes into each package. 
 *  Chef makes as many packages as possible. Chef then gets to eat the remaining cupcakes. 
 *  Chef enjoys eating cupcakes very much. Help Chef choose the package size A that will let him eat as many cupcakes
 *   as possible.
 *   
 *   ---Input----
 *   
 *   Input begins with an integer T, the number of test cases. Each test case consists of a single integer N, 
 *   the number of cupcakes.
 *   
 *   1<=T<=10002
 *   2<=N<=10002
	-----Output--------
	
	For each test case, output the package size that will maximize the number of leftover cupcakes.
	 If multiple package sizes will result in the same number of leftover cupcakes, print the largest such size.
 * */
public class PackagingCupcakes 
{
	public static int numberOfCupcakes,testCases;
	public static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		
		{
			testCases=sc.nextInt();
			if(testCases>=1 && testCases<=10002)
			{
				while(testCases-->0)
				{
					System.out.println("Number of cupcakes");
					numberOfCupcakes=sc.nextInt();
					if(numberOfCupcakes>=2 && numberOfCupcakes<=10002)
					{
						System.out.println((numberOfCupcakes/2)+1);
					}
					else
					{
						break;
					}
				}
			}
			
			
		}
		
	}

}
