package topic4;

public class Vehicles {
	private String brand;
	private String color;
	public Vehicles(String brand, String color) {
		System.out.println("���ø���Ĺ��췽��");
		this.brand = brand;
		this.color = color;
	}
	
	public void run() {
		System.out.println("���Ѿ�����");
	}
	
	public void showInfo() {
		System.out.println("�̱꣺" + brand + "," + "��ɫ��" + color);
		
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
