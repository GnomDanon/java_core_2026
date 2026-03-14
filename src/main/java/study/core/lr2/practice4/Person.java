package study.core.lr2.practice4;

public class Person {

	private String name;
	private int age;
	private String gender;

	public Person(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public Person setName(String name) {
		this.name = name;
		return this;
	}

	public int getAge() {
		return age;
	}

	public Person setAge(int age) {
		this.age = age;
		return this;
	}

	public String getGender() {
		return gender;
	}

	public Person setGender(String gender) {
		this.gender = gender;
		return this;
	}
}
