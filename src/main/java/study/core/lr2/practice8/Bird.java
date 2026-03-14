package study.core.lr2.practice8;

public class Bird extends Animal {

	private boolean canFly;

	public Bird(String name, int age, boolean canFly) {
		super(name, age);
		this.canFly = canFly;
	}

	public boolean isCanFly() {
		return canFly;
	}

	public Bird setCanFly(boolean canFly) {
		this.canFly = canFly;
		return this;
	}

	public void fly() {
		if (canFly) {
			System.out.println(getName() + " полетел");
		} else {
			System.out.println(getName() + " не умеет летать");
		}
	}

	@Override
	public void voice() {
		System.out.println("Фьють");
	}
}
