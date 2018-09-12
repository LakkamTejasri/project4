
public class q28 {
	public static void main(String[] args)
	{
		int a,n=121,temp=0,m;
		m=n;
		while(n!=0)
		{
			a=n%10;
			temp=(temp*10)+a;
			n=n/10;
		}
		if(m==temp)
		{
			System.out.println("given number  palidrom");
		}
		else
		{
			System.out.println("the given number is not palidrom");
		}

}
}	
