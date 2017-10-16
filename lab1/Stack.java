/*
 * Stack.java
 * 
 * Navaneeth S 
 * AM.EN.U4CSE16144
 * 21/7/17
 * 
 */

import java.util.*;
public class Stack {
	
	int top=-1;
	int[] a;
	
	public Stack()
	{
		a=new int[15];
	}
	
	public void insert(int n)
	{
		if(IsFull())
		System.out.println("The stack is full");
		else
		{
			top++;
			a[top]=n;
		}
	}
	
	public void delete()
	{
		if(IsEmpty())
		System.out.println("Array is empty");
		else
		top--;
	}
	
	public void display()
	{
		for(int i=0;i<=top;i++)
		System.out.print(a[i]+" ");
	}
	
	public boolean IsFull()
	{
		if (top==14)
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
	
	
	public static void main (String args[]) {
		
		Stack arr=new Stack();
		int choice=0,n;
		Scanner sc= new Scanner(System.in);
		
		while(choice!=3)
		{
		System.out.println("Enter 1 to add an element");
		System.out.println("Enter 2 to delete an element");
		System.out.println("Enter 3 to exit");
		choice=sc.nextInt();
		switch(choice)
		{
			case 1:{
				System.out.println("Enter the element to insert");
				n=sc.nextInt();
				arr.insert(n);
				arr.display();
				break;
			}
			
			case 2:{
				arr.delete();
				arr.display();
			}
			
			case 3:{
				break;
			}
			default:
			System.out.println("Invalid Input");
		
			
		
	}
}
}
}

