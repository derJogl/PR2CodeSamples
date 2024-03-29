package sorting.lv.person;

import java.util.Comparator;

public class IdComparatorAsc
	implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
		
		//ascending using id
		if(o1.getId() < o2.getId())
			return -1;
		if(o1.getId() > o2.getId())
			return 1;
		
		return 0;
		
	}
	
}
