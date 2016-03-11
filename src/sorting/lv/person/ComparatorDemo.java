package sorting.lv.person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {

	public static void main(String[] args) {
		
		List<Person> lp = new ArrayList<>();
		lp.add(new Person(4321,"Max","Mustermann"));
		lp.add(new Person(3456,"Silvia","Musterfrau"));
		
		System.out.println(lp);
		System.out.println();
		
		//ordering according to IdComparatorAsc
		Collections.sort(lp,new IdComparatorAsc());
		
		System.out.println(lp);
		System.out.println();
		
		//ordering according to comparator
		//given as anonymous / inner class
		//using last name
		Collections.sort(lp,new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				return o1.getLastName()
						.compareTo(o2.getLastName());
			}
		});
		
		System.out.println(lp);

	}
	
}
