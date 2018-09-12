
public class q37 
	{
		public static void main(String[] args)
		{
			int a,temp=0,n=153,j;
			j=n;
			while(n!=0)
			{
				a=n%10;
				temp=temp+a*a*a;
				n=n/10;
			}
			if(temp==j)
			{
				System.out.println("given number is am");		
			}
			else
			{
				System.out.println("given number is not  AM");			}
			
		}
	}
