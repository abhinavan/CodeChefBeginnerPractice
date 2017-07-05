package beginnerPack;

import java.util.Scanner;

public class TransformTheExpression 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter input String ");
		String input=sc.next(),output;
		InToPost trans=new InToPost(input);
		output=trans.doTrans();
		System.out.println("Postfix expression is "+output);
		
	}

}
