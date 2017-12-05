
import java.util.*;
public class Queue {
	
	int front=-1;
	int back=-1;
	char[] b;
	
	public Queue()
	{
		b=new char[15];
	}
	
	public void insert(char n)
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
	
	public void delete()
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
		if (back==14)
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
	
	
	public static void main (String args[]) {
		
		Queue arr=new Queue();
		int choice=0; String c;
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
				c=sc.next();
				char n=c.charAt(0);
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

