package com.arracollec;

import java.util.List;
import java.util.ArrayList;

public class GenericArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
				//Generic
				List<String> empl = new ArrayList<String>();
				empl.add("Vaibhav");						// 1
				List<Integer> numb = new ArrayList<Integer>();
				numb.add(002);								// 2
				List<String> empl1 = new ArrayList<String>();
				empl1.add("CEO");							// 3
				List<Boolean> tf = new ArrayList<Boolean>();
				tf.add(true);								// 4
				
				System.out.println("Name is " + empl  + " Number is  " + numb + " Position is "+ empl1 + " tf is" + tf);
//				_______________--
				// Messed UP from down onwards
				
				empl.remove(0);
				for(int i=0;i<empl.size();i++) {
					System.out.println(empl.get(i));
				}
				
				empl.add("G");
				for(int i=0;i<empl.size();i++) {
					System.out.println(empl.get(i));
				}
				
				empl.remove(0);
				int i =0;
				while(i<empl.size()) {
					i++;
					System.out.println(empl.get(i));
				}
				
				
				empl1.add("Manager");{
					int j=2;
					do {
						j++;
						System.out.println(empl1.get(j));
					}
					while(j<empl1.size());

				}
				
	}
	
}
