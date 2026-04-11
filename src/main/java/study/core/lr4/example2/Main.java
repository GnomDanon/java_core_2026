package study.core.lr4.example2;

public class Main {
	public static void main(String[] args) {
		try {
			System.out.println("0");
			throw new RuntimeException("Непроверяемая ошибка");
//			System.out.println("1");
		} catch (Exception e) {
			System.out.println("2 " + e);
		}
		System.out.println("3");
	}
}
