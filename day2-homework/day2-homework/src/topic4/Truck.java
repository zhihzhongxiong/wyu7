package topic4;

public class Truck extends Vehicles {
	private float load;
	public Truck(String brand, String color, float load) {
		super(brand, color);
		this.load = load;
	}
	
	public void showTruck() {
		System.out.println("商标：" + getBrand() +", " + 
	"颜色：" + getColor() + "," + "载重：" + load);
	}

	public float getLoad() {
		return load;
	}

	public void setLoad(float load) {
		this.load = load;
	}
	
}
