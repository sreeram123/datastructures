
import java.util.*;

public class Test {
	
public static void main (String args[]) {
		
		StackInt arr=new StackInt();
		int choice=0,n;
		boolean check=true;
		Scanner sc= new Scanner(System.in);
		
		while(choice!=8)
		{
		System.out.println("Enter 1 to add an element");
		System.out.println("Enter 2 to delete an element");
		System.out.println("Enter 3 to peek at top");
		System.out.println("Enter 4 to check if two stacks are equal");
		System.out.println("Enter 5 to print the minimum element");
		System.out.println("Enter 6 to copy stack into another stack and print");
		System.out.println("Enter 7 to reverse a string");
		System.out.println("Enter 8 to exit");
		choice=sc.nextInt();
		switch(choice)
		{
			case 1:{
				System.out.println("Enter the element to insert");
				n=sc.nextInt();
				arr.push(n);
				arr.print();
				break;
			}
			
			case 2:{
				arr.pop();
				arr.print();
			}
			
			case 3:{
				arr.peek();
				break;
			}
			
			case 4:{
				System.out.println("Enter the size of stack to be checked");
				int k=sc.nextInt();
				StackInt b= new StackInt(k);
				System.out.println("Enter stack elements");
				for(int i=0;i<k;i++)
					b.push(sc.nextInt());
				
				check=arr.equals(b);
				if(check==true)
					System.out.println("Stacks are equal");
				else
					System.out.println("Not equal");
			}
			
			case 5:{
				int x = arr.getminElement();
				System.out.println(x);
				break;
			}
			
			case 6:{
				StackInt m=arr.copystack();
				m.print();
				break;
			}
			
			case 7:{
				System.out.println("Enter the size of string");
				int p =sc.nextInt();
				reverse s= new reverse(p);
				System.out.println("Enter the string");
				String str = sc.next();
				for(int i=0;i<p;i++)
					s.push(str.charAt(i));
				s.print();
				
			}
			
			case 8:{
				break;
			}
			default:
			System.out.println("Invalid Input");
		
			
		
	}
}
}
}


