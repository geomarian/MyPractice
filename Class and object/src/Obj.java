
public class Obj {
	int number = 3412;
	String vehicle = "SKODA";
	String vehicle1 = "HONDA";
	String vehicle2= "TATA";
	
	 void Car(int n, String v) {
		number=n;
		vehicle = v;
	}
	
	void Bike(int n, String v) {
		
		number = n;
		vehicle = v;
	}
	
	void Truck(int n, String v) {
		number = n;
		vehicle = v;
	}
	void displayInfo() {
		System.out.println("Model is "  + number +" & "+ "vehicle is " + vehicle);
		System.out.println("Model is "  + number +" & "+ "vehicle is " + vehicle1);
		System.out.println("Model is "  + number +" & "+ "vehicle is " + vehicle2);
	}
 
}
