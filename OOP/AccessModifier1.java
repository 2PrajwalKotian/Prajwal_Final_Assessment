package oopsprograming;
	class PrivateDefault { 
		private void method1()
		{
			System.out.println("Private");
		}
		 void method2()
		{
			System.out.println("Default");
		}
		public void method3()
		{
			System.out.println("Public");
		}

	}
	public class AccessModifier1 extends PrivateDefault{
		public static void main(String[] args) {
			
		AccessModifier1 obj1 = new AccessModifier1();
			obj1.method2();
			obj1.method3();
		}
	}