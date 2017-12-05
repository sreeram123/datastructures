

public class DoublyList {
	public Dnode head=null;
	
	public void insert_at_head(int value)
	{	
		Dnode newnode = new Dnode(value);
		if (head==null)
			head = newnode;
		else
		{
			newnode.next = head;
			head.prev = newnode;
			head = newnode;
		}
	}
	
	public void insert_at_tail(int value){
		Dnode newnode = new Dnode(value);
		if(head==null)
			head=newnode;
		else
		{
			Dnode temp=head;
			while(temp.next!=null)
				temp=temp.next;
			temp.next=newnode;
			newnode.prev = temp;
		}
	}
	
	public void insert_at_position(int value,int k){
		Dnode newnode = new Dnode(value);
		if(k<1 || k>getLength())
			System.out.println("Invalid Index");
		else if(k==1)
			insert_at_head(value);
		else if(k==getLength())
			insert_at_tail(value);
		else
		{
			Dnode temp=head;
			for(int i=0;i<k-1;i++)
				temp=temp.next;
			newnode.next=temp.next;
			temp.next.prev=newnode;
			temp.next=newnode;
			newnode.prev=temp;
		}
				
	}
	
	public int getPosition(Dnode n)
	{
		int count = 1;
		Dnode temp=head;
		while(temp.data!=n.data)
		{
			temp=temp.next;
			count++;
		}
		return count;
	}
	
	public void delete_a_value(int value){
		Dnode tail = head;
		while(tail.next!=null)
			tail=tail.next;
		if(head==null)
			System.out.println("List empty");
		else if(value == head.data)
		{
			head.next.prev=null;
			head=head.next;
			
		}
		else if (value ==tail.data)
		{
			tail.prev.next=null;
			tail.prev=null;
		}
		else
		{
			Dnode temp=head;
			int pos=0;
			while(temp.data!=value)
			{
				temp=temp.next;
				pos++;
			}
			Dnode curr=null,prev=null;
			int count=0;
			curr=head;
			while(count!=pos)
			{
				prev=curr;
				curr=curr.next;
				count++;
			}
			curr.next.prev=prev;
			prev.next=curr.next;
			curr.next=null;
			curr.prev=null;
		}
	}
	
	public int getLength(){
		Dnode temp=head;
		int c=0;
		while(temp.next!=null)
		{
			temp=temp.next;
			c++;
		}
		c=c+1;
		return c;
	}
	
	public void print(){
		if(head==null)
			System.out.println("Empty List");
		else
		{
			Dnode temp=head;
			while(temp!=null)
			{
				System.out.print(temp.data + " ");
				temp=temp.next;
			}
		}
	}

	public void reverse( int k){
		int x = k;
		Dnode head_next=null;
		Dnode h = head;
		Dnode head_prev = null;
		while(h!=null && x>0){
			head_next = h.next;
			h.next = head_prev;
			h.prev=head_next;
			head_prev = h;
			h = head_next;
			x--;
		}
		head.next = head_next;
		head = head_prev;
	}
	
	
}
