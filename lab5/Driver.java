
import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter no of petrol pumps");
		int n = s.nextInt();
		int[] p = new int[n+5];
		int[] d = new int[n+5];
		for(int i = 0;i < n;i++){
			p[i] = s.nextInt();
			d[i] = s.nextInt();
		}
		int j = 0;
		int t = 0;
		int c =0;
		int pos =-1;
		for(int i = 0;i < n-1;i++){
			t = p[i] - d[i];
			if(t<0)
				continue;
			else{
				c= 0;
				j = i+1;
				while(c<n){
					t += p[j];
					if(t < d[j])
						break;
					else
						t = t - d[j];
					j++;
					if(j==n-1)
						j = 0;
					c++;
				}
				if(c == n){
					pos = i;
					break;
				}
			}
			
			
		}System.out.println(pos);
	}

}
