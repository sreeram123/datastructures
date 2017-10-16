package lab4;
import java.util.*;
public class Paranthesis {
	
		public static void main(String args[])
		{
			char op;
			Paranthesis ob=new Paranthesis();
			System.out.println("Enter the paranthesis string");
			Scanner scn=new Scanner(System.in);
			String s=scn.nextLine();
			for(int i=0;i<s.length();i++)
			{
				op=s.charAt(i);
				if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='[')
					ob.push(op);
				else if(op==')')
				{
					if(ob.peek()=='(')
						ob.pop();
					else
					{
						System.out.println("Not Balanced");
						break;
					}

				}
				else if(op=='}')
				{
					if(ob.peek()=='{')
						ob.pop();
					else
					{
						System.out.println("Not Balanced");
						break;
					}
				}			
				else if(op==']')
				{
					if(ob.peek()=='[')
						ob.pop();
					else
					{
						System.out.println("Not Balanced");
						break;
					}
				}
			}
			if(ob.isEmpty())
				System.out.println("Balanced");
		}
	

	
		int top=-1;
		char c[]=new char[1000];
		public void push(char opr)
		{
			top++;
			c[top]=opr;
		}
		public char pop()
		{
		return c[top--];
		}

		public boolean isEmpty()
		{
		return (top==-1)?true:false;
		}

		public char peek()
		{
		return c[top];
		}
	}
	

