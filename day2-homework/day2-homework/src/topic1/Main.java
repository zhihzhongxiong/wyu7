package topic1;

public class Main {

	public static void main(String[] args) {
		//创建对象，并为属性赋值
		Vehicle vehicle = new Vehicle(50.0,30.5);
		
		//输出属性
		System.out.println("速度是：" + vehicle.getSpeed());
		System.out.println("体积是：" + vehicle.getSize());
		
		//调用加速和减速方法
		vehicle.speedUp();
		vehicle.speedDown();
	}

}
