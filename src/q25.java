
public class q25 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stubl
		int c=0,n=9;
		for(int i=2;i<=500;i++)
		{
			if(n%i==0)
			{
				c++;
			}
		}	
			if(c==2)		
			{
				System.out.println("the given number is prime");
			}
			else
			{
				System.out.println("the given number is not prime");
			}	

	}

}
