package TalentozPackage;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrList {

	public static void main(String[] args) {
		
		int i;
		
		ArrayList<String> al1 = new ArrayList<String>();
		
		//Declaring the Array list
		al1.add("Optimus");
		al1.add("Bumble");
		al1.add("Optimus");
		al1.add("Megatron");
		al1.add("Seninel Prime");
		
		//Obtaining the size
		al1.size();
		System.out.println("Size of the Array list: "+al1.size());
		
		System.out.println(al1);
		
		/*
		 * for(i=0;i<=al1.size();i++) {
		 *  System.out.println(al1.get(i)); 
		 *  }
		 */
		
		//Including the Iterator
		
		Iterator<String> itr = al1.iterator();
		
		while (itr.hasNext()) {
			String e = itr.next();
			if(e.equals("Megatron")) {
				itr.remove();
			}
		}
		System.out.println("List after removal" +al1);
			
		}
}
		

	


