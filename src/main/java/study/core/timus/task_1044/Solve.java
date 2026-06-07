package study.core.timus.task_1044;

import java.util.Scanner;

public class Solve {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int N = in.nextInt();
		int k = N / 2;

		int limit = 1;
		for (int i = 0; i < k; i++) {
			limit *= 10;
		}

		int[] cnt = new int[9 * k + 1];

		for (int num = 0; num < limit; num++) {
			int x = num;
			int sum = 0;

			for (int i = 0; i < k; i++) {
				sum += x % 10;
				x /= 10;
			}

			cnt[sum]++;
		}

		long answer = 0;

		for (int c : cnt) {
			answer += (long) c * c;
		}

		System.out.println(answer);
	}
}
