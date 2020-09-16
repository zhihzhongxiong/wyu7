package topic4;

public class Main {

	public static void main(String[] args) {
		
		Car c = new Car("特斯拉","黑色",4);
		c.run();
		c.showCar();
		c.showInfo();
		
		Truck t = new Truck("奔驰", "红色", 4.5F);
		t.showInfo();
	}

}
