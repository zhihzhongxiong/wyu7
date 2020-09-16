package topic2;

public class Person {
	private String name;
	private int age;
	private String gender;
	
	public Person() {
		System.out.println("姓名：" + name + "," + "年龄：" + age
				+ "," + "性别:" + gender);
	}

	public Person(String name, int age, String gender) {
		
		this.name = name;
		this.age = age;
		this.gender = gender;
		System.out.println("姓名：" + this.name + "," + "年龄：" + this.age
				+ "," + "性别:" + this.gender);
	}
	
	
}
