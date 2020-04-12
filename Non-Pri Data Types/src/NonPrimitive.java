
public class NonPrimitive {
	
	 static String number="23456789";

	public static void main(String[] args) {
		String abs = "QWERTYUIOPAFGHJKLZXCVBNM";
		String chars = "!@#$%^&*()";
		
		System.out.println(abs);
		System.out.println();
		System.out.println(chars);
		System.out.println();
		System.out.println(number);  //Change it to static. Will make any difference?
		
		// type of an arry
		int a[] = new int[5];
		a[0]=1;
		a[1]=2;
		a[2]=3;
		a[3]=4;
		
		System.out.println();
		System.out.println("Array is " + a); //Why it is printing #code?
	}

}
