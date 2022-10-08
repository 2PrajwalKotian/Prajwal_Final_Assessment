package oopsprograming;

class Info1{
	void login(){
		System.out.println("Login Successfully");	
	}
}
class Info2 extends Info1{
	void sendbank(){
		System.out.println("Choose Bank Account to send money");	
	}
}
public class Inheritance extends Info2 {

	public static void main(String[] args) {
		
		Inheritance add = new Inheritance();
		add.login();
		add.sendbank();
		add.transfer();
	}
	void transfer(){
		System.out.println("Amount transferred successfully");	
	}

}
