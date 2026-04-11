package study.core.lr4.example3;

public class Main {
	public static void main(String[] args) {
		try {
			System.out.println("0");
			throw new RuntimeException("ошибка");
		} catch (NullPointerException e) {
			System.out.println("1");
		} catch (RuntimeException e) {
			System.out.println("2");
		} catch (Exception e) {
			System.out.println("3");
		}
		System.out.println("4");
	}
}
