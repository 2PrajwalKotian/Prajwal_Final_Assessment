package oopsprograming;
interface in1{
	void method1();
}
public class Interface implements in1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interface obj = new Interface();
		obj.method1();
	}
	public void method1() {
		System.out.println("hello world");
	}

}
