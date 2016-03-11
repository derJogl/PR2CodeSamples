package sorting.lv.person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparableDemo {

	public static void main(String[] args) {
		
		String[] words = {"Max","Susi","Susanne","Manfred"};
		//String class implements Comparable out of the box
		//so this works as expected -> lexicographic ascending sort order
		Arrays.sort(words);
		
		for(String w:words) {
			System.out.println(w);
		}
		System.out.println();
		
		Person[] people = {new Person(4321,"Max","Mustermann"),
						 	new Person(3456,"Silvia","Musterfrau")};
		
		//we have to make sure that Person implements Comparable
		//otherwise this would lead to a RuntimeException -> ClassCastException
		Arrays.sort(people);
		
		for(Person p:people) {
			System.out.println(p);
		}
		System.out.println();

		List<Person> lp = new ArrayList<>();
		lp.add(new Person(4321,"Max","Mustermann"));
		lp.add(new Person(3456,"Silvia","Musterfrau"));
		
		//the same then works for list types as well
		//by using the helper class java.util.Collections
		Collections.sort(lp);
		
		for(Person p:lp) {
			System.out.println(p);
		}

	}
	
	
}
