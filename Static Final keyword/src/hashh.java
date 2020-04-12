import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hashh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create a hash map
	      HashMap<Integer, String> hm = new HashMap();
	      
	      // Put elements to the map
	      hm.put(1, "xyz");

	    //  hm.put(1, "abc");
	      hm.put(2, "pqr");
	      
	      Set set = hm.entrySet();
	      
	      Iterator i = set.iterator();
	
	while(i.hasNext()) {							// Explain
        Map.Entry me = (Map.Entry)i.next();
        System.out.print(me.getKey() + ": ");
        System.out.println(me.getValue());
     }
     System.out.println();
     
    
     System.out.println("value =" +  hm.get(2) + hm);
}

}
