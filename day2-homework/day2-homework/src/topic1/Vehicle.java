package topic1;

public class Vehicle {
	private double speed;//速度属性
	private double size;//体积属性
	//有参构造
	public Vehicle(double speed, double size) {
		super();
		this.speed = speed;
		this.size = size;
	}
	//无参构造
	public Vehicle() {
		super();
	}
	
	//加速方法
	public void speedUp(){
		System.out.println("加速");
	}
	//减速方法
	public void speedDown(){
		System.out.println("减速");
	}
	
	
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	public double getSize() {
		return size;
	}
	public void setSize(double size) {
		this.size = size;
	}
	
	
}
