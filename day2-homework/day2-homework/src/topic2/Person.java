package topic2;

public class Person {
	private String name;
	private int age;
	private String gender;
	
	public Person() {
		System.out.println("������" + name + "," + "���䣺" + age
				+ "," + "�Ա�:" + gender);
	}

	public Person(String name, int age, String gender) {
		
		this.name = name;
		this.age = age;
		this.gender = gender;
		System.out.println("������" + this.name + "," + "���䣺" + this.age
				+ "," + "�Ա�:" + this.gender);
	}
	
	
}
