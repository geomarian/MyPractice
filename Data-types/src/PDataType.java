//These are Primitive DataTypes

public class PDataType {

	//int datatype
	static int number = 778888646; //max 9 can be added still output shows 7 why?
	
	
	public static void main(String[] args) {
	
		number = 7;
		System.out.println("Int is = " + number);

		// Here if I don't mention static in INT then it shows error! 
		// And If I don't add Static then I have add data type after main
		
		//double
		double duos = 53.123456789012345655; // added more than 16 digits. see output
		System.out.print("Double is = " + duos);
		System.out.println();
		
		//Float
		float flaws = 897.1234567f; //If I don't add f it shows error. Added 7 digit but see output. Why does it limit entry?
		System.out.print("float is = " + flaws);
		System.out.println();
		//Byte
		byte b1 = 44;
		short s1 = 24444;
		long l1 = 12312312; //If i add more than this it shows out of range
		char c1 = 'R';  // what is the use of char if only 1 is assigned. In which case it will be usefull.
		
		System.out.print("byte is = " + b1 + ", short is =  " + s1 + ", long is =  " + l1 + ", char is  " + c1);
		System.out.println();
		System.out.println();
		
		//boolean with Int
		int num1 = 7;
		int num2 = 9;
		int c= num1+num2;
	    boolean result = true;
		 
		 if(c==17) {
			 System.out.print("Boolean Result is: " + result);
		 } else {
			 System.out.println("Boolean - It's False");
		 }
		 
		
	}

}
