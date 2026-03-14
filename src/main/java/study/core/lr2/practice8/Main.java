package study.core.lr2.practice8;

public class Main {

	public static void main(String[] args) {
		Dog dog = new Dog("Тузик", 3, "Овчарка");
		dog.displayBreed();
		dog.voice();

		Cat cat = new Cat("Барсик", 4, "Сухой корм");
		cat.displayFood();
		cat.voice();

		Bird bird = new Bird("Вуди", 2, true);
		bird.fly();
		bird.voice();
	}
}
