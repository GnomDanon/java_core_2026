package study.core.lr2.practice6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Введите радиус круга:");
		Circle circle = new Circle(in.nextDouble());
		System.out.printf("Площадь круга: %f; периметр круга: %f\n", circle.getArea(), circle.getPerimeter());

		System.out.println("Введите сторону квадрата:");
		Square square = new Square(in.nextDouble());
		System.out.printf("Площадь квадрата: %f; периметр квадрата: %f\n", square.getArea(), square.getPerimeter());

		System.out.println("Введите стороны треугольника:");
		Triangle triangle = new Triangle(in.nextDouble(), in.nextDouble(), in.nextDouble());
		System.out.printf("Площадь треугольника: %f, периметр треугольника: %f\n", triangle.getArea(), triangle.getPerimeter());
	}
}
