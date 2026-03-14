package study.core.lr2.practice9;

public class Triangle extends Shape {

	private double firstSide;
	private double secondSide;
	private double thirdSide;

	public Triangle(double firstSide, double secondSide, double thirdSide) {
		this.firstSide = firstSide;
		this.secondSide = secondSide;
		this.thirdSide = thirdSide;
	}

	public double getFirstSide() {
		return firstSide;
	}

	public Triangle setFirstSide(double firstSide) {
		this.firstSide = firstSide;
		return this;
	}

	public double getSecondSideSide() {
		return secondSide;
	}

	public Triangle setSecondSide(double secondSide) {
		this.secondSide = secondSide;
		return this;
	}

	public double getThirdSide() {
		return thirdSide;
	}

	public Triangle setThirdSide(double thirdSide) {
		this.thirdSide = thirdSide;
		return this;
	}

	@Override
	public double getArea() {
		return Math.sqrt((getPerimeter() / 2) * (getPerimeter() / 2 - firstSide) * (getPerimeter() / 2 - secondSide) * (getPerimeter() / 2 - thirdSide));
	}

	@Override
	public double getPerimeter() {
		return firstSide + secondSide + thirdSide;
	}
}
