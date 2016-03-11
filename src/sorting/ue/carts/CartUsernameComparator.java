package sorting.ue.carts;

import java.util.Comparator;

public class CartUsernameComparator implements Comparator<Cart> {

	@Override
	public int compare(Cart o1, Cart o2) {

		//ASCENDING according to username
		//we just delegate to the String class compareTo method
		return o1.getUsername().compareTo(o2.getUsername());
		
	}

}
