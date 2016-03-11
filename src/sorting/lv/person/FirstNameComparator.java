package sorting.lv.person;

import java.util.Comparator;

public class FirstNameComparator
	implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
		//delegates to compareTo of String class
		//which itself implements Comparable
		return o1.getFirstName().compareTo(o2.getFirstName());
	}

}
