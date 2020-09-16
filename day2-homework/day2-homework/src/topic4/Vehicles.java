package topic4;

public class Vehicles {
	private String brand;
	private String color;
	public Vehicles(String brand, String color) {
		System.out.println("调用父类的构造方法");
		this.brand = brand;
		this.color = color;
	}
	
	public void run() {
		System.out.println("我已经开动");
	}
	
	public void showInfo() {
		System.out.println("商标：" + brand + "," + "颜色：" + color);
		
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
	
}
