import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Hash1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int id = 001;
//		String name = "Chris";
//		String lname = "Turner";
//		double points = 321.2;
//		
		HashMap<String, Integer> eid = new HashMap<String, Integer>();
		eid.put("id", 100);
		eid.put("id1", 1001);
		
		HashMap<String, String> fname = new HashMap<String, String>();
		fname.put("name", "chris");
		
		HashMap<String, String> mname = new HashMap<String, String>();
		mname.put("lname", "Turner");
		
		HashMap<String, Double> pts = new HashMap<String, Double>();
		pts.put("points", 321.2);
		
		System.out.println(" eid is " + eid + " fname is "  + fname + " mName is " + mname + " points is " + pts);
		
	//	______________----_____
		
		System.out.println("ccontains="+mname.containsValue("Turner1"));  // checks the value
		System.out.println(eid.size());     // Size 1 means??
		eid.replace("id", 568);
	//System.out.println( + "Hello");
		Iterator iterator = eid.entrySet().iterator();
        while (iterator.hasNext()) {
             Map.Entry me2 = (Map.Entry) iterator.next();
          System.out.println("Key: "+me2.getKey() + " & Value: " + me2.getValue());
        } 
	
	// why getting 1?
	//	System.out.println(fname.keySet());
		System.out.println(mname.values());		
		
		 iterator = mname.entrySet().iterator();
        while (iterator.hasNext()) {
             Map.Entry me2 = (Map.Entry) iterator.next();
          System.out.println("Key: "+me2.getKey() + " & Value: " + me2.getValue());
        } 
	      
	      

	}

}
