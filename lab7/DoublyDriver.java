

import java.util.Scanner;
public class DoublyDriver {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		DoublyList d = new DoublyList();
		int choice=0,n=0,pos=0;
		while(choice!=6)
		{
			System.out.println("Enter 1 to insert elements into the list");
			System.out.println("Enter 2 to insert at a position");
			System.out.println("Enter 3 to delete a value");
			System.out.println("Enter 4 to reverse first n elements");
			System.out.println("Enter 5 to print the elements");
			System.out.println("Enter 6 to exit");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
			{
				System.out.println("Enter the element to insert");
				n=sc.nextInt();
				d.insert_at_head(n);
				break;
			}
			case 2:
			{
				int p=0;
				System.out.println("Enter the element to insert");
				n=sc.nextInt();
				System.out.println("Enter node to insert after");
				p=sc.nextInt();
				Dnode t = new Dnode(p);
				pos=d.getPosition(t);
				d.insert_at_position(n, pos);
				break;
			}
			case 3:
			{
				System.out.println("Enter the value to delete");
				n=sc.nextInt();
				d.delete_a_value(n);
				break;
			}
			case 4:
			{
				System.out.println("Enter the number of nodes to reverse");
				n=sc.nextInt();
				d.reverse(n);
				break;
			}
			case 5:
			{
				d.print();
				break;
			}
			case 6:
			{
				break;
			}
			}
		}
	}
}
