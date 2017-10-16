package Sample;

import java.util.*;
public class Circular {
	
	int front=-1;
	int back=-1;
	int[] b;
	int size;
	
	public Circular(int n)
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
			back=(back+1)%size;
			b[back]=n;
		}
		
		
	}
	
	public void dequeue()
	{
		if(IsEmpty()==1)
		System.out.println("Queue is empty");
		else if (front==back)
		{
			front=-1;
			back=-1;
		}
		else
			front=(front+1)%size;	
	}
	
	public void display()
	{
		if(front<=back){
		for(int i=front;i<=back;i++)
		System.out.print(b[i]+" ");
		System.out.println();
	}
		else{
			for(int i=front;i<=size-1;i++){
				System.out.print(b[i]+" ");
			}
			for(int j=0;j<=back;j++){
				System.out.print(b[j]+" ");
			}
		}
		System.out.println();
	}
	
	public int IsFull()
	{
		if (front==((back+1)%size))
		return 1;
		else
		return 0;
	}
	
	public int IsEmpty()
	{
		if (front==-1&&back==-1)
		return 1;
		else
		return 0;
	}
	
	public int getFront(){
		if(front ==-1)
			return front;
		else
			return b[front];
	}

	public int getNo(){
		if(IsEmpty()==1)
			return -1;
		else if(front>back)
			return size-front+back+1;
		else if(IsFull()==1)
			return size;
		else
			return back-front+1;
	}

	public int getSize(){
		return size;
	}
	
		public boolean equals(Circular another){
		if(this.getFront()==-1)
			{System.out.println("Empty");
			return false;}
		else if(this.getFront() != another.getFront())
			return false;
		else if(this.getNo()!=another.getNo())
			return false;
		else{
			if(front<back){
			for(int i=front;i>=back;i++){
				if(this.b[i] != another.b[i]){
					return false;
				}
			}
			}
			else{
				for(int i=front;i<=size-1;i++){
					if(this.b[i] != another.b[i]){
						return false;
				}
				for(int j=0;j<=back;j++){
					if(this.b[j] != another.b[j]){
						return false;
				}
			}
		}
		
		
	}
}
		return true;
		}
		
	public void splitq(){
			if(IsEmpty()==1)
				System.out.println("Queue is empty");
			
		else{
				Circular even = new Circular(size/2);
				Circular odd = new Circular(size/2);
				if(front<=back){
					for(int i=front,j=1;i<=back;i++,j++){
						if(j%2==0){
							even.enqueue(this.b[i]);
							this.dequeue();
						}
						else if(j%2!=0){
							odd.enqueue(this.b[i]);
							this.dequeue();
						}
						
					}			
					}
					else{
						for(int i=front,k=1;i<=size-1;i++,k++){
							if(k%2==0){
								even.enqueue(this.b[i]);
								this.dequeue();
							}
							else if(k%2!=0){
								odd.enqueue(this.b[i]);
								this.dequeue();
							}
						}
						for(int j=0, k=(size-1-front);j<=back;j++){
							if(k%2==0){
								even.enqueue(this.b[j]);
								this.dequeue();
							}
							else if(k%2!=0){
								odd.enqueue(this.b[j]);
								this.dequeue();
							}
						}
					}
				even.display();
				odd.display();
			}	
		}
	
	public void getMin(){
		if(IsEmpty()==1)
			System.out.println("Queue is empty");
		else{
			int min = getFront();
			if(front<=back){
				
				for(int i=front;i<=back;i++){
					if(min>b[i])
						min = b[i];
					
				}			
				}
			else{
				
				for(int i=front;i<=size-1;i++){
					if(min<b[i])
						min = b[i];
				}
				for(int j=0;j<=back;j++){
					if(min<b[j])
						min = b[j];
				}
			}
		System.out.println("The minimum element is " + min);
		}
	}


	public static void main (String args[]) {
		
		
		int choice=0,s=0; int c;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of the queue");
		s=sc.nextInt();
		Circular arr=new Circular(s);
		while(choice!=7)
		{
		System.out.println("Enter 1 to add an element");
		System.out.println("Enter 2 to delete an element");
		System.out.println("Enter 3 to get the element at the front");
		System.out.println("Enter 4 to check if two circular queues are equal");
		System.out.println("Enter 5 to split queue into odd and even elements");
		System.out.println("Enter 6 to get the minimum element of a circular queue");
		System.out.println("Enter 7 to exit");
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
				System.out.println("Enter size of queue");
				int n =sc.nextInt();
				Circular another = new Circular(n);
					System.out.println("Enter the queue");
					for(int i=0;i<n;i++){
						int a = sc.nextInt();
						another.enqueue(a);
					}
				boolean b = arr.equals(another);
				if(b)
				System.out.println("Queues are equal");
				else
					System.out.println("Queues are not equal");
				break;
			}
			
			case 5:{
				arr.splitq();
				break;
				
			}
			case 6:{
				arr.getMin();
				break;
			}
			case 7:{
			break;	
			}
			default:
			System.out.println("Invalid Input");
		
			
		
	}
}
}
}