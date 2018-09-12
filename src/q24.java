
public class q24 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10,b=20,c;
		{
			// using third variable without using third variable
			c=a;  //a=a+b; 
			a=b;    //b=a-b;
			b=c;		//a=a-b;
			System.out.println(a);
			System.out.println(b);
		}

	}

}
