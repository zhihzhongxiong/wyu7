package topic4;

public class Car extends Vehicles{
	private int seats;
	
	public Car(String brand, String color, int seats) {
		super(brand, color);
		this.seats = seats;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}
	
	public void showCar() {
		System.out.println("商标：" + getBrand() +", " + 
	"颜色：" + getColor() + "," + "座位：" + seats);
	}
	
}
