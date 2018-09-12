
public class q30 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			int a,n=25696,b,temp=0,sum=0,t=0;
			while(n>0)
			{   
				
				a=n%10;
			    temp=temp*10+a;
			    n=n/10;
			}   
			while(temp!=0)
			{
				t=temp%10;
				System.out.print(t+ "+");
				
				temp=temp/10;
			}
			//System.out.println(t);
				
		}
	}
}
