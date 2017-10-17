import java.util.Scanner;
class EnormousInput
{
	public static void main(String[] args) {
		int count=0,n,k,i;
	long input;
	Scanner s=new Scanner(System.in);
	n=s.nextInt();
	k=s.nextInt();
	for(i=0;i<n;i++)
	{
		input=s.nextLong();
		if(input%k==0)
			count++;
	}
	System.out.println(count);
	}

}