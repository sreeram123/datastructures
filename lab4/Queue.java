package queue;

import java.util.*;
public class Queue {
	
	int front=-1;
	int back=-1;
	int[] b;
	int size;
	
	public Queue(int n)
	{
		b=new int[n];
		size=n;
		
	}
	
	public void enqueue(int n)
	{
		if(IsFull()==1)
		System.out.println("The queue is full");
		
		else if (IsEmpty()==1)
		{
			front=back=0;
			b[front]=n;
		}
		else
		{
			back++;
			b[back]=n;
		}
		
		
	}
	
	public void dequeue()
	{
		if(IsEmpty()==1)
		System.out.println("Queue is empty");
		else
		front++;
		
		
	}
	
	public void display()
	{
		for(int i=front;i<=back;i++)
		System.out.print(b[i]+" ");
		System.out.println();
	}
	
	public int IsFull()
	{
		if (back==size-1)
		return 1;
		else
		return 0;
	}
	
	public int IsEmpty()
	{
		if (front==-1)
		return 1;
		else
		return 0;
	}
	
	public int getFront()
	{
		return b[front];
	}
	
	public boolean isEqual(Queue another){
		if(this.getFront() != another.getFront()){
			return false;
		}
		else{
			for(int i=front;i<=back;i++){
				if(this.b[i]!=another.b[i]){
					return false;
				}
				
			}
				
		}			
		return true;

		}

	
	
	public static void main (String args[]) {
		
		
		int choice=0,s=0; int c;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of the queue");
		s=sc.nextInt();
		Queue arr=new Queue(s);
		while(choice!=5)
		{
		System.out.println("Enter 1 to add an element");
		System.out.println("Enter 2 to delete an element");
		System.out.println("Enter 3 to get the element at the front");
		System.out.println("Enter 4 to check if two queues are equal");
		System.out.println("Enter 5 to exit");
		choice=sc.nextInt();
		switch(choice)
		{
			case 1:{
				System.out.println("Enter the element to insert");
				c=sc.nextInt();
				arr.enqueue(c);
				arr.display();
				break;
			}
			
			case 2:{
				arr.dequeue();
				arr.display();
				break;
			}
			
			case 3:{
				arr.getFront();
				break;
			}
			
			case 4:{
				int k;
				Queue another = new Queue(s);
				System.out.println("Enter the elements of the new queue");
				for(int i=0;i<s;i++)
				{
				k=sc.nextInt();
				another.enqueue(k);
				}
				boolean result=arr.isEqual(another);
				if(result==true)
					System.out.println("Queues are equal");
				else
					System.out.println("Queues are not equal");
				break;
				
			}
			
			case 5:{
				break;
			}
			default:
			System.out.println("Invalid Input");
		
			
		
	}
}
}
}
