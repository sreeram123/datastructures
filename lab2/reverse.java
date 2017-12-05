
class reverse{
	
public int top=-1;
public char[] a;
public int size = 15;

public reverse()
{
	a=new char[15];
}

public reverse(int size){
	a = new char[size];
	this.size = size;
}

public void push(char n)
{
	if(IsFull())
	System.out.println("The stack is full");
	else
	{
		top++;
		a[top]=n;
	}
}

public void pop()
{
	if(IsEmpty())
	System.out.println("Array is empty");
	else
	top--;
}

public void print()
{
	for(int i=top;i>=0;i--)
	System.out.print(a[i]+" ");
}

public boolean IsFull()
{
	if (top==size-1)
	return true;
	else
	return false;
}

public boolean IsEmpty()
{
	if (top==-1)
	return true;
	else
	return false;
}
}










