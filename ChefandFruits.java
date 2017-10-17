import java.util.Scanner;
class ChefandFruits{
	public static void main(String[] args) {
		int t,m,n,k,d=0;
	Scanner s=new Scanner(System.in);
	t=s.nextInt();
	while(t>0)
	{
		t--;
		n=s.nextInt();
		m=s.nextInt();
		k=s.nextInt();
		if(m==n)
		{
			System.out.println(0);
			continue;
		}
		if(m<n)
			d=n-m;
		else if(m>n)
			d=m-n;
		if(d<=k)
			System.out.println(0);
		else
			System.out.println(d-k);
	}
	}
}