import java.util.ArrayList;

public class ArrList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Non - Generic
		ArrayList emp =new ArrayList();
		emp.add("Avinash");  //0
		emp.add(001);		//1
		emp.add("Admin");	//2
		emp.add(12.7);	//3       Why don't it print index 3 in output
		
		System.out.println(emp);
		
		emp.remove(1);  // here index 1 is removed
		emp.remove(2);   // here index 2 is removed but shown in output and Index 3 should be displayed as it is removed.
		System.out.println(emp);
	
	}
	
	

}
