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
		System.out.println("�̱꣺" + getBrand() +", " + 
	"��ɫ��" + getColor() + "," + "��λ��" + seats);
	}
	
}
