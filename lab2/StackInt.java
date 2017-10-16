package stack;

import java.util.*;
public class StackInt {
	
	public int top=-1;
	public int[] a;
	public int size = 15;
	
	public StackInt()
	{
		a=new int[15];
	}
	
	public StackInt(int size){
		a = new int[size];
		this.size = size;
	}
	
	public void push(int n)
	{
		if(IsFull())
		System.out.println("The stack is full");
		else
		{
			top++;
			a[top]=n;
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
		System.out.print(a[i]+" ");
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
	
	public int getTop(){
		return top;
	}
	
	public int peek(){
		if(top == -1){
			System.out.println("Stack is empty");
			return -1;
		}
		else
			return a[top];
	}
	
	public boolean equals(StackInt another){
		if(this.top != another.getTop()){
			return false;
		}
		else{
			for(int i=top;i>=0;i--){
				if(this.a[i]!=another.a[i]){
					return false;
				}
				
			}
			return true;
				
		}
		}
	
	public int getminElement(){
		if(IsEmpty())
		{
			System.out.println("Empty Stack");
			return -1;
		}
		else{
		int min=a[0];
		for(int i=0;i<size;i++){
			if(a[i]<min)
				min = a[i];
		}
		return min;
		}
	}
	
	public StackInt copystack(){
		StackInt m = new StackInt(this.size); 
		for(int i=0;i<=top;i++){
			m.push(a[i]);
		}
		return m;
	}
	

	
}
	
	
	



