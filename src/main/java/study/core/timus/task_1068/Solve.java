package study.core.timus.task_1068;

import java.io.PrintWriter;
import java.util.Scanner;

public class Solve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		PrintWriter writer = new PrintWriter(System.out);

		int N = in.nextInt();
		boolean reverse = N < 1;

		writer.println(reverse ? sum(N, 1) : sum(1, N));
		writer.flush();
	}

	public static int sum(int start, int end) {
		int sum = 0;

		for (int i = start; i <= end; i++) {
			sum += i;
		}

		return sum;
	}
}
