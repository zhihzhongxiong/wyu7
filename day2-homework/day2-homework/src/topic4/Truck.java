package topic4;

public class Truck extends Vehicles {
	private float load;
	public Truck(String brand, String color, float load) {
		super(brand, color);
		this.load = load;
	}
	
	public void showTruck() {
		System.out.println("�̱꣺" + getBrand() +", " + 
	"��ɫ��" + getColor() + "," + "���أ�" + load);
	}

	public float getLoad() {
		return load;
	}

	public void setLoad(float load) {
		this.load = load;
	}
	
}
