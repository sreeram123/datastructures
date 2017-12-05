import java.util.*;
public class Queue {
	
	public static void main (String args[]) {
		StackInt s1 = new StackInt();
		StackInt s2 = new StackInt();
		Scanner s = new Scanner(System.in);
			int ch = -1;
			while(ch !=4){
			System.out.println("Enter an option");
			System.out.println("1:Insert an element");
			System.out.println("2:Delete an element");
			System.out.println("3:Display");
			ch = s.nextInt();
			switch(ch){
				case 1:int n = s.nextInt();
						while(s1.IsEmpty()!=1){
							s2.push(s1.pop());
	}
						s1.push(n);
						while(s2.IsEmpty()!=1){
							s1.push(s2.pop());
}
						break;
				case 2:s1.pop();
						
				case 3:s1.print();
				break;
			}
		}
		
}
}
