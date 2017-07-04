package beginnerPack;

import java.util.Scanner;

public class SumOfTriangle 
{
	public static int[][] finalMatrix;
	public static int line,testCases;
	public static Scanner sc=new Scanner(System.in);
	
	public static void countMaxSum(int[][] matrix,int m , int n )
	{
		// traversing from last index element 
		for(int i=m-1;i>=0;i--)
		{
			// element chosen starts from matrix[m-1][0]
			for(int j=0;j<=i;j++)
			{
				if(matrix[i+1][j]>matrix[i+1][j+1])
				{
					matrix[i][j]+=matrix[i+1][j];
				}
				else
				{
					matrix[i][j]+=matrix[i+1][j+1];
				}
			}
		}
		System.out.println(matrix[0][0]);
	}
	public static void main(String[] args) 
	{
		System.out.println("Enter number of testCases");
		testCases=sc.nextInt();
		while(testCases-->0)
		{
			System.out.println("Enter number of lines ");
			line=sc.nextInt();
			/*int[][] matrix={	{1,0,0},
								{2,3,0},
								{2,3,1}
							};*/
			// making a square matrix of length=line
			finalMatrix=new int[line][line];
			for(int i=0;i<finalMatrix.length;i++)
			{
				System.out.println("Enter element in triangular format");
				for(int j=0;j<finalMatrix.length;j++)
				{
					System.out.println("Enter ["+i+"]["+j+"] element");
					finalMatrix[i][j]=sc.nextInt();
				}
			}
			/*System.out.println("------------------------------------");
			for(int i=0;i<finalMatrix.length;i++)
			{
				for(int j=0;j<finalMatrix.length;j++)
				{
					System.err.println(finalMatrix[i][j]);
			
				}
			}*/
			System.out.println("-------------------------------------");
			// calling method with input matrix and index=matrix.length-1
			countMaxSum(finalMatrix, line-1,line-1);
			
		}
		
	}
}
