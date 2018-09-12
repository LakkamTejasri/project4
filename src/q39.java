
public class q39 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=0,sum=0;
		for(int j=100;j<=1000;j++)
		{
			int c=0,n=j;
			for(int i=1;i<=n;i++)
			{
				if(n%i==0)
				{	
					c++;	
				}
			}	
			
				if(c==2){
				
					k++;
					
				
				
				if(k%2!=0)
				{
					sum=sum+n;
					
				
				}

				}
		}
		System.out.println(sum);
	}

}