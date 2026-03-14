package study.core.lr2.practice9;

public class Circle extends Shape {

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
