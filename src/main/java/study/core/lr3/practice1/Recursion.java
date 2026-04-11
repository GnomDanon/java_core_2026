package study.core.lr3.practice1;

public class Recursion {
	public static void main(String[] args) {
		System.out.println(fact(5));
	}

	public static int fact(int n) {
		if (n == 0) {
			System.out.println("n=0");
			return 0;
		} else if (n == 1) {
			System.out.println("n=1");
			return 1;
		} else {
			int value = fact(n - 2) + fact(n - 1);
			System.out.println("n=" + value);
			return value;
		}
	}
}
