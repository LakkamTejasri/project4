
public class a31 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int j=25;j<=100;j++)
		{
			int c=0,n=j;
			for(int i=1;i<=n;i++)
			{
				if(n%i==0)
				{
					c++;
					
				}
			}	
				if(c==2)
				{
					System.out.println(n);
				}
		}
		

	}

}
