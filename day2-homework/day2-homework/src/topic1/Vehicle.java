package topic1;

public class Vehicle {
	private double speed;//�ٶ�����
	private double size;//�������
	//�вι���
	public Vehicle(double speed, double size) {
		super();
		this.speed = speed;
		this.size = size;
	}
	//�޲ι���
	public Vehicle() {
		super();
	}
	
	//���ٷ���
	public void speedUp(){
		System.out.println("����");
	}
	//���ٷ���
	public void speedDown(){
		System.out.println("����");
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
