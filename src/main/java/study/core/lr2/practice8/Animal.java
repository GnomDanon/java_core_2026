package study.core.lr2.practice8;

public class Animal {

	private String name;
	private int age;

	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public Animal setName(String name) {
		this.name = name;
		return this;
	}

	public int getAge() {
		return age;
	}

	public Animal setAge(int age) {
		this.age = age;
		return this;
	}

	public void voice() {
		throw new UnsupportedOperationException();
	}
}
