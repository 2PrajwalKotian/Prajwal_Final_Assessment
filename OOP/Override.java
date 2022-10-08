package oopsprograming;
class Car{
	void car(){
		System.out.println("All the cars are listed");	
	}
}
public class Override extends Car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Override car1 = new Override();
		car1.car();
	}
	void car() {
		super.car();
		System.out.println("Maruti car details");
	}

}
