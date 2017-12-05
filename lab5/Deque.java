

public class Deque {
	
	int front=-1;
	int back=-1;
	int[] b;
	int size;
	
	public Deque(int n)
	{
		b=new int[n];
		size=n;
		
	}
	
	public void InsertFront(int n)
	{	

		if(IsFull()==1)
		System.out.println("The queue is full");
		
		else if (IsEmpty()==1)
		{
			front=back=0;
			b[front]=n;
		}
		
		else if(front==0)
		{
			front=size-1;
			b[front]=n;
		}
		else
		{
			front=(front-1)%size;
			b[front]=n;
		}
		
	}
	
	public void InsertRear(int n)
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
	
	public void DeleteFront()
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
	
	public void DeleteRear()
	{
		if(IsEmpty()==1)
			System.out.println("Queue is empty");
			else if (front==back)
			{
				front=-1;
				back=-1;
			}
		
			else if(back==0)
			{
				back=size-1;
			}
			else
				back=(back-1)%size;	
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
	
	public void getFront()
	{
		System.out.println(b[front]);
	}
	
	public void getRear()
	{
		System.out.println(b[back]);
	}
	
	public static void main (String args[]) {
		Deque arr=new Deque(5);
		arr.InsertFront(10);
		arr.InsertRear(20);
		arr.InsertFront(30);
		arr.DeleteFront();
		arr.DeleteRear();
		arr.InsertRear(25);
		arr.InsertFront(40);
		arr.InsertFront(50);
		arr.getRear();
		arr.getFront();
		arr.display();
		
}
}
