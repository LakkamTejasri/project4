
public class q29R {	
	public static void main(String[] args)
	{
		int a,n=221,temp=0;
		while(n!=0)
		{
			a=n%10;
			temp=(temp*10)+a;
			n=n/10;
		}
		System.out.println(temp);
	}

}
