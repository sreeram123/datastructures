import java.io.*;
import java.lang.*;
import java.util.*;
class Post
{
	public static void main(String args[])
	{
		char c;
		Postfix ob=new Postfix();
		System.out.println("Enter a valid postfix expression");
		Scanner scn=new Scanner(System.in);
		String s=scn.nextLine();
		try
		{
		for(int i=0;i<s.length();i++)
		{
			c=s.charAt(i);
			if(Character.isDigit(c))
				ob.push((int)(c-'0'));
			else  if(c=='+'||c=='-'||c=='*'||c=='/'||c=='^')
				ob.action(c);
			else if(c==' ')
			{
				continue;
			}
			else
			{
				System.out.println("Invalid symbol present");
				break;
			}
		}
			if(!Character.isDigit(ob.peek()))
				System.out.println("The result is : "+ob.pop());
			else
				System.out.println("Invalid expression");
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Invalid Expression");
		}
	}
}
class Postfix
{
	int top=-1,result;
	int c[]=new int[1000];
	public void push(int opr)
	{
		top++;
		c[top]=opr;
	}
	public int pop()
	{
	return c[top--];
	}

	public boolean isEmpty()
	{
	return (top==-1)?true:false;
	}

	public int peek()
	{
	return c[top];
	}

	public void action(char op)
	{
		int n2=pop();
		int n1=pop();
		if(op=='+')
		{
			result=n1+n2;
			push(result);
		}
		else if(op=='-')
		{
			result=n1-n2;
			push(result);
		}
		else if(op=='*')
		{
			result=n1*n2;
			push(result);
		}
		if(op=='/')
		{
			result=n1/n2;
			push(result);
		}
		else if(op=='^')
		{
			result=(int)Math.pow(n1,n2);
			push(result);
		}
	}
}
