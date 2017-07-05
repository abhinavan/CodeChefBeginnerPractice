package beginnerPack;

public class StackX 
{
	private int maxSize;
	private char[] stackArray;
	private int top;
	
	public StackX(int size)
	{
		this.maxSize=size;
		top=-1;
		stackArray=new char[maxSize];
	}
	public boolean isEmpty()
	{
		if(top==-1)
		{
			return true;
		}
		return false;
	}
	public boolean isFull()
	{
		if(top==maxSize-1)
		{
			return true;
		}
		return false;
	}
	public void push(char c)
	{
		stackArray[++top]=c;
	}
	public char pop()
	{
		return stackArray[top--];
	}
	public char peek()
	{
		return stackArray[top];
	}
	public int size()
	{
		return stackArray.length;
	}
	public char peekN(int n)
	{
		return stackArray[n];
	}
	
	public void displayStack(String s)
	{
		System.out.println(s);
		for(int j=0;j<size()-1;j++)
		{
			System.out.println(peekN(j));
			System.out.println(" ");
		}
		System.out.println(" * *");
	}

}
