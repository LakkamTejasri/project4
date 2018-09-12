 
public class q26 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0,b=1,temp;
		{
			System.out.println(a);
			System.out.println(b);
			for(int i=0;i<=5;i++)
			{
				temp=a+b;
				a=b;
				b=temp;
				System.out.println(temp);
						
			}
			
		}

	}

}
