package oopsprograming;

abstract class Info{
		abstract void info1();
		void info2() {
			System.out.println("welcome");
		}
}
public class Abstract extends Info {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abstract obj = new Abstract();
		obj.info1();
		obj.info2();
	}
	void info1() {
		System.out.println("hello world");
	}
}
