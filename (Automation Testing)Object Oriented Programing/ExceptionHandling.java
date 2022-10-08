package oopsprograming;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c[] = new int[5];
		try
		{
			int a=10,b=0;
			c[7]=a/b;
		}
		catch(ArithmeticException e)
		{
			throw new ArithmeticException("Cannot divide by 0 enter other than zero");
		}
		 finally {  
	            
	          System.out.println("finally executes always");
	        }
	}
}
