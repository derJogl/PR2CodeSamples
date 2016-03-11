package sorting.ue.carts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DemoCarts {
	
	public static void main(String[] args) {
		
		List<Cart> carts = new ArrayList<>();
		carts.add(new Cart("Max Mustermann", 3, 3, 129.90));
		carts.add(new Cart("Ano Nym", 1, 10, 31.80));
		carts.add(new Cart("Silvia Musterfrau", 2, 5, 498.00));
		
		System.out.println("-> before sorting:");
		for(Cart c : carts) {
			System.out.println(c);
		}
		
		Collections.sort(carts);
		System.out.println("-> after sorting:");
		for(Cart c : carts) {
			System.out.println(c);
		}
		
		Collections.sort(carts, new CartUsernameComparator());
		System.out.println("-> after sorting by username ASC:");
		for(Cart c : carts) {
			System.out.println(c);
		}
		
		Collections.sort(carts, new CartTotalItemsComparator());
		System.out.println("-> after sorting by totalItems DESC");
		for(Cart c : carts) {
			System.out.println(c);
		}
		
	}

}
