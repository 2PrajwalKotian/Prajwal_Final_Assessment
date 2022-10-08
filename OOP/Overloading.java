package oopsprograming;

public class Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overloading add1 = new Overloading();
		add1.add(2,8);
		add1.add(4.25f,3.37f);
		add1.add(5,3,4);
	}
	void add(int a,int b)
	{
		int c=a+b;
		System.out.println(a+"+"+b+"="+c);
	}
	void add(float a,float b)
	{
		float c=a+b;
		System.out.println(a+"+"+b+"="+c);
	}
	void add(int a,int b,int c)
	{
		int d=a+b+c;
		System.out.println(a+"+"+b+"+"+c+"="+d);
	}
}
