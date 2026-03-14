package study.core.lr2.practice6;

public class Circle implements Shape {

	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public Circle setRadius(double radius) {
		this.radius = radius;
		return this;
	}

	@Override
	public double getArea() {
		return Math.pow(Math.PI * radius, 2);
	}

	@Override
	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}
}
