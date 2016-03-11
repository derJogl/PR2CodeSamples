package sorting.lv.car;

import java.util.Comparator;

public class CarSeatComparatorAsc implements Comparator<Car> {

	@Override
	public int compare(Car o1, Car o2) {
		//ASC according to number of seats
		if(o1.getSeats() < o2.getSeats())
			return -1;
		if(o1.getSeats() > o2.getSeats())
			return 1;
		
		return 0;
	}

}
