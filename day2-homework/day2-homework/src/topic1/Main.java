package topic1;

public class Main {

	public static void main(String[] args) {
		//�������󣬲�Ϊ���Ը�ֵ
		Vehicle vehicle = new Vehicle(50.0,30.5);
		
		//�������
		System.out.println("�ٶ��ǣ�" + vehicle.getSpeed());
		System.out.println("����ǣ�" + vehicle.getSize());
		
		//���ü��ٺͼ��ٷ���
		vehicle.speedUp();
		vehicle.speedDown();
	}

}
