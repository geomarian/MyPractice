package practise;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HM2 {

	int id;
	String fname, mname, lname;
	double points;
	String car;

	public HM2(int id, String fname, String mname, String lname, double d) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.fname = fname;
		this.mname = mname;
		this.lname = lname;

	}

	public HM2(String car) {
		this.car = car;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Creating Map
		Map<Integer, HM2> map = new HashMap<Integer, HM2>();
		// New Create
		HM2 h1 = new HM2(101, "Rose", "P", "Menin", 5.6);
		HM2 h2 = new HM2(102, "Melon", "S.", "Iyer", 69.2);
		HM2 h3 = new HM2(103, "Ren", "P.", "Sandy", 78.0);

		// Adding to map
		map.put(1, h1);
		map.put(2, h2);
		map.put(3, h3);

		// Creating 2nd Map
		Map<String, HM2> gel = new HashMap<String, HM2>();
		// New 2 create
		HM2 h4 = new HM2("Mandy");
		HM2 h5 = new HM2("Ciaz");
		HM2 h6 = new HM2("Honda");
		gel.put("M", h4);
		gel.put("C", h5);
		gel.put("H", h6);

		//
		for (Map.Entry<String, HM2> entry : gel.entrySet()) {
			String key = entry.getKey();
			HM2 hh = entry.getValue();
			System.out.println(key + "Car name is");
			System.out.println(hh.car);
			System.out.println();
		}

		// Transversing -accesing all objects stored in list

		for (Entry<Integer, HM2> entry : map.entrySet()) {
			Integer key = entry.getKey();
			HM2 h = entry.getValue();
			System.out.println(key + " - Detail");
			System.out.println(h.id + " " + h.fname + " " + h.mname + "" + h.lname + " ");
		}


	}

}
