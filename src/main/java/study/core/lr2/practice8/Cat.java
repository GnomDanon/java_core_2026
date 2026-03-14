package study.core.lr2.practice8;

public class Cat extends Animal {

	private String food;

	public Cat(String name, int age, String food) {
		super(name, age);
		this.food = food;
	}

	public String getFood() {
		return food;
	}

	public Cat setFood(String food) {
		this.food = food;
		return this;
	}

	public void displayFood() {
		System.out.println("Тип корма: " + food);
	}

	@Override
	public void voice() {
		System.out.println("Мяу");;
	}
}
