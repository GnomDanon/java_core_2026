package study.core.lr2.practice8;

public class Dog extends Animal {

	private String breed;

	public Dog(String name, int age, String breed) {
		super(name, age);
		this.breed = breed;
	}

	public String getBreed() {
		return breed;
	}

	public Dog setBreed(String breed) {
		this.breed = breed;
		return this;
	}

	public void displayBreed() {
		System.out.println("Порода: " + getBreed());
	}

	@Override
	public void voice() {
		System.out.println("Гав");
	}
}
