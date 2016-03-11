package sorting.lv.car;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CarDemo {

	public static void main(String[] args) {
		
		List<Car> cars = new ArrayList<>();
		cars.add(new Car(20000,7));
		cars.add(new Car(10000,4));
		
		System.out.println("before sorting:");
		for(Car c:cars) {
			System.out.println(c);
		}
		
		//we explicitly specify the sorting with our
		//own Comparator class
		Collections.sort(cars, new CarSeatComparatorAsc());
		
		System.out.println("after sorting:");
		for(Car c:cars) {
			System.out.println(c);
		}
				
	}
	
}
