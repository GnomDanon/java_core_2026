package study.core.timus.task_1110;

import java.io.PrintWriter;
import java.util.Scanner;

public class Solve {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		StringBuilder result = new StringBuilder();

		int N = in.nextInt(), M = in.nextInt(), Y = in.nextInt();

		for (int x = 0; x < M; x++) {
			if (powMod(x, N, M) == Y) {
				if (result.length() > 0) {
					result.append(" ");
				}
				result.append(x);
			}
		}

		if (result.length() == 0) {
			System.out.println(-1);
		} else {
			System.out.println(result);
		}
		out.flush();
	}


	private static int powMod(int base, int exp, int mod) {
		long result = 1;
		long b = base % mod;

		while (exp > 0) {
			if ((exp & 1) == 1) {
				result = (result * b) % mod;
			}
			b = (b * b) % mod;
			exp >>= 1;
		}

		return (int) result;
	}
}
