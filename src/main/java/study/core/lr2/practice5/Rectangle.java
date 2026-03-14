package study.core.lr2.practice5;

public class Rectangle {

	private int length;
	private int width;

	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}

	public int getLength() {
		return length;
	}

	public Rectangle setLength(int length) {
		this.length = length;
		return this;
	}

	public int getWidth() {
		return width;
	}

	public Rectangle setWidth(int width) {
		this.width = width;
		return this;
	}

	public int getArea() {
		return length * width;
	}

	public int getPerimeter() {
		return length * 2 + width * 2;
	}
}
