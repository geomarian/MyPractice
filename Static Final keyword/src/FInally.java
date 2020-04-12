
public class FInally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj = new B();
		obj.show();
	}
}

//Overriding method
	class A {
	final	public void show() {				//method
			System.out.println("In Class A");
		}
		
	}    // does not allow - same for class
	 class B extends A{
		public void show() {
			System.out.println("In class B");
		}
		}
	


