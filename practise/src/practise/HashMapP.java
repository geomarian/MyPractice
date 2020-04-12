package practise;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> student = new HashMap<String, Integer>();
		student.put("Ayan", 111);
		student.put("Bilal", 222);
		student.put("Ciyan", 333);

		HashMap<String, Double> grade = new HashMap<String, Double>();
		grade.put("A", 9.2);
		grade.put("B", 8.01);
		grade.put("C", 7.211);

		HashMap<Integer, String> pt = new HashMap<Integer, String>();
		pt.put(999, "Run");
		pt.put(888, "Walk");
		pt.put(777, "Cycling");

		System.out.println("Names are: " + student + " Grades are" + grade + " PT is" + pt);
		System.out.println();

		student.replace("Ciyan", 444);

		Iterator iterator = student.entrySet().iterator();

		while (iterator.hasNext()) {
			Map.Entry map1 = (Map.Entry) iterator.next();

			System.out.println("Key: " + map1.getKey() + " & Value: " + map1.getValue());
			// System.out.println();
		}

		grade.remove("A", 9.2);
		// System.out.println("Removed A");
		Iterator iterator1 = grade.entrySet().iterator();

		for (Map.Entry map2 : grade.entrySet()) {

			System.out.println(map2.getKey() + "" + map2.getValue());
			System.out.println();

		}
		pt.replace(999, "ALANWALKER");

		Iterator iterator2 = grade.entrySet().iterator();

		for (Map.Entry map3 : pt.entrySet()) {
			System.out.println(map3.getKey() + "" + map3.getValue());

			pt.replaceAll((k, v) -> "GEO"); // replaceAll repeated 3 times

			for (Map.Entry map31 : pt.entrySet()) {
				System.out.println(map31.getKey() + "" + map31.getValue());
			}

		}
	}

}
