package beginnerPack;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * Tomya is a girl. She loves Chef Ciel very much.Tomya like a positive integer p, and now she wants to get a receipt of 
 * Ciel's restaurant whose total price is exactly p. The current menus of Ciel's restaurant are shown the following table.
 * 
 * Price list of menu 
 * -------------------
 * 	1
	2
	4
	8
	16
	32
	64
	128
	256
	512
	1024
	2048
	
	Note that the i-th menu has the price 2i-1 (1 ≤ i ≤ 12).
	
	Since Tomya is a pretty girl, she cannot eat a lot. So please find the minimum number of menus whose total price is
	 exactly p. Note that if she orders the same menu twice, then it is considered as two menus are ordered.
	 
	  ------------Input-------------------
	  
	  The first line contains an integer T, the number of test cases. Then T test cases follow. 
	  Each test case contains an integer p.
 * ---------Output----------------------
 * 
 * For each test case, print the minimum number of menus whose total price is exactly p.
 * */
public class ChefAnfCiel 
{
	public static Scanner sc=new Scanner(System.in);
	public static int[] menu=new int[12];
	public static int p;
	public static ArrayList<Integer> al=new ArrayList<>();
	
	public static void calculateMenu(int[] menu, int p)
	{
		
		int j=1,x=p;
		for(int i=0;i<menu.length;i++)
		{
			int count=0;
			while(x>0)
			{
				x-=menu[i];
				count++;
			}
			if(count!=1 && count!=0)
			{
				al.add(count);
			}
			x=p;
			while(j<=menu.length)
			{
				x=x-(menu[i+1]+menu[j-1]);
				count++;
				j++;
			}
			if(count!=0)
			{
				al.add(count);
			}
			
		}
		for(Integer i:al)
		{
			System.out.println(i);
		}
		System.out.println("---------------------------------");
		calculateMininmumMenu(al);
		
	}
	public static void calculateMininmumMenu(ArrayList<Integer> al)
	{
		int min=al.get(0);
		for(Integer i:al)
		{
			if(min>i)
			{
				min=i;
			}
		}
		System.out.println(min);
	}
	public static void main(String[] args) 
	{
		// creating menu 
		for(int i=0;i<menu.length;i++)
		{
			menu[i]=(int)Math.pow(2,i);
		}
		System.out.println("Enter total amount which Tomya wants from menu");
		p=sc.nextInt();
		calculateMenu(menu, p);
	}

}
