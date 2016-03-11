package sorting.lv.car;

public class Car implements Comparable<Car> {
	
	private double price;
	private int seats;

	public Car(double price,int seats) {
		super();
		this.price = price;
		this.seats = seats;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Car [price=");
		builder.append(price);
		builder.append(", seats=");
		builder.append(seats);
		builder.append("]");
		return builder.toString();
	}
	
	@Override
	public int compareTo(Car o) {
		//ASC according to price
		if(this.price < o.price)
			return -1;
		if(this.price > o.price)
			return 1;
		
		return 0;
		
	}

}
