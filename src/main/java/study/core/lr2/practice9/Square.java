package study.core.lr2.practice9;

public class Square extends Shape {

	private double length;

	public Square(double length) {
		this.length = length;
	}

	public double getLength() {
		return length;
	}

	public Square setLength(double length) {
		this.length = length;
		return this;
	}

	@Override
	public double getArea() {
		return length * length;
	}

	@Override
	public double getPerimeter() {
		return length * 4;
	}
}
