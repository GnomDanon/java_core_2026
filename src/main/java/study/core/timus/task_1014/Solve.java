package study.core.timus.task_1014;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Solve {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);

		int N = in.nextInt();

		out.println(getSolution(N));
		out.flush();
	}

	private static String getSolution(int N) {
		if (N == 0)
			return "10";

		if (N < 10)
			return String.valueOf(N);

		List<Integer> digits = new ArrayList<>();
		for (int i = 9; i > 1; i--) {
			while (N % i == 0) {
				N /= i;
				digits.add(i);
			}
		}

		if (N > 1)
			return "-1";

		Collections.sort(digits);

		StringBuilder result = new StringBuilder();
		for (int digit : digits)
			result.append(digit);
		return result.toString();
	}
}
