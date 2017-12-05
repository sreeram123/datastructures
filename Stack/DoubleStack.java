
import java.util.Scanner;
public class DoubleStack {
	int topf=-1;
	int topb=-1;
	int stack[];
	int size;
	
	DoubleStack(int n){
		stack=new int[n];
		size=n;
	}
	
	public void pushfront(int n) {
		if(IsFull())
			System.out.println("The stack is full");
			else
			{
				topf++;
				stack[topf]=n;
			}
	}
	
	public void pushback(int n) {
		if(IsFull())
			System.out.println("The stack is full");
			else if(topb==-1)
			{
				topb=size-1;
				stack[topb]=n;
			}
			else
			{
				topb--;
				stack[topb]=n;
			}
	}
	
	public void popfront() {
		if(topf==-1)
			System.out.println("Array is empty");
			else
			topf--;
	}
	
	public void popback() {
		if(topb==-1)
			System.out.println("Array is empty");
		else if(topb==size-1)
			topb=-1;
			else
			topb++;
	}
	
	public boolean IsFull() {
		if(topf==topb-1)
			return true;
		else
			return false;
		
	}
	

	
	public void displayf() {
		for(int i=0;i<=topf;i++) {
			System.out.println(stack[i]);
		}
	}
	
	public void displayb(){
		for(int i=topb;i<size;i++) {
			System.out.println(stack[i]);
		}
	}
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the stack");
		int n=sc.nextInt();
		DoubleStack ds=new DoubleStack(n);
		int choice=0;
		while(choice!=7)
		{
			System.out.println("Enter 1 to add element to first stack");
			System.out.println("Enter 2 to add element to second stack");
			System.out.println("Enter 3 to delete element from first stack");
			System.out.println("Enter 4 to delete element from second stack");
			System.out.println("Enter 5 to display first stack");
			System.out.println("Enter 6 to display second stack");
			System.out.println("Enter 7 to exit");
			choice=sc.nextInt();
			switch(choice) {
			case 1:{
				System.out.println("Enter number to push");
				n=sc.nextInt();
				ds.pushfront(n);
				break;
			}
			
			case 2:{
				System.out.println("Enter number to push");
				n=sc.nextInt();
				ds.pushback(n);
				break;
			}
			
			case 3:{
				ds.popfront();
				break;
			}
			
			case 4:{
				ds.popback();
				break;
			}
			
			case 5:{
				ds.displayf();
				break;
			}
			
			case 6:{
				ds.displayb();
				break;
			}
			case 7:{
				break;
			}
			
			default:{
				System.out.println("Invalid option");
			}
			
			
			}
	}
	}
}

