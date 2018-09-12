
public class q32 {
	public static void main(String[] args)
		{
		int sum=0,l=0;
			for(int j=25;j<=100;j++)
			{
				int c=0,n=j;
				for(int i=1;i<=n;i++)
				{
					if(n%i==0)
					{	
						c++;
						//System.out.println(sum/l);
					}
						
				}	
					if(c==2)
					{
						sum=sum+n;
						l++;
						//System.out.println(sum/l);
					}
					
			}
			System.out.println(sum/l);

		}
}
