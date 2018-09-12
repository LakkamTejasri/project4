
public class q33 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	//	System.out.print("Test");
		int a,n=1000,temp=0,m,sum=0;
		m=n;
		int t=n,avg=1;
		for(int i=100;i<=t;i++)
		{
			n=i;
			temp=0;
		while(n!=0)
		{
			a=n%10;
			temp=(temp*10)+a;
			n=n/10;
		}
		
		if(i==temp)
		{
			//sum=sum+i;
			//avg++;
			
			System.out.println(i);
		}
		//System.out.println(sum/avg);
		}

	}
	
}