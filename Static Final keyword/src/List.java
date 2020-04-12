import java.util.ArrayList;

public class List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList nos= new ArrayList(); 
		nos.add(1);
		nos.add("two");
		
		for(int i=0;i<nos.size();i++) {
			System.out.println(nos.get(i));
		}
		

		nos.add("three");
		
		for(int i=0;i<nos.size();i++) {
			System.out.println(nos.get(i));
		}
		

		nos.remove(0);
		
		
		
		for(int i=0;i<nos.size();i++) {
			System.out.println(nos.get(i));
		}
		
		nos.remove(1);
		
		for(int i=0;i<nos.size();i++) {
			System.out.println(nos.get(i));
		}
	}

}
