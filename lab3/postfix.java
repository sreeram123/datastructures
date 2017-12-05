

import java.util.*;
public class postfix {
	public int top=-1;
	public char[] exp;
	public char[] stack;
	public int size = 15;
	public String result="";

	public postfix()
	{
		stack=new char[15];
		exp = new char[size];
	}

	public postfix(int size){
		stack = new char[size];
		exp = new char[size];
		this.size = size;
	}
	
	public String convert()
	{
		for(int i=0;i<size;i++)
		{
			if (exp[i]!='+' && exp[i]!='-' && exp[i]!='*' && exp[i]!='/' && exp[i]!='(' && exp[i]!=')')
			{
				result = result+exp[i];
			}
			else if(exp[i]=='+'||exp[i]=='-'||exp[i]=='*'||exp[i]=='/')
			{
				while(!IsEmpty()&&stack[top]!='{'&&(pres(exp[i])<=pres(peek())))
						{
							result = result + stack[top];
							pop();
						}
				push(exp[i]);
			}
			else if(exp[i]=='(')
			{
				push(exp[i]);
			}
			else if(exp[i]==')')
			{
				while(!IsEmpty()&&stack[top]!='(')
				{
					result = result+stack[top];
					pop();
				}
				pop();
			}
		}
		char a;
		while(!IsEmpty())
		{
			System.out.println(stack[top]);
			result = result+stack[top];
			pop();
		}
		
		return result;
	}
			
	public char peek(){
		if(top == -1){
			System.out.println("Stack is empty");
			char a = 1;
			return a;
		}
		else
			return stack[top];
	}
	
	public int pres(char ch)
	{
		if(ch=='+'||ch=='-')
			return 1;
		else if(ch=='*'||ch=='/')
			return 2;
		else if(ch=='^')
			return 3;
		return 0;
	}	

	public void push(char n)
	{
		if(IsFull())
		System.out.println("The stack is full");
		else
		{
			top++;
			stack[top]=n;
		}
	}

	public void pop()
	{
		if(IsEmpty())
		System.out.println("Array is empty");
		else
		top--;
	}

	public void print()
	{
		for(int i=top;i>=0;i--)
		System.out.print(stack[i]+" ");
	}

	public boolean IsFull()
	{
		if (top==size-1)
		return true;
		else
		return false;
	}

	public boolean IsEmpty()
	{
		if (top==-1)
		return true;
		else
		return false;
	}
	
	public static void main(String args[])
	{
		postfix a = new postfix(20);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the expression");
		String e= sc.next();
		for(int i=0;i<e.length();i++)
			a.exp[i]=e.charAt(i);
		String r = a.convert();
		System.out.println(r);
	}
	}

	



