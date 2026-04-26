package study.core.timus.task_1820;

import java.io.PrintWriter;
import java.util.Scanner;

public class Solve {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);

		int n = in.nextInt(), k = in.nextInt();
		int result = Math.max(2, (2 * n + k - 1) / k);

		out.println(result);
		out.flush();
	}
}
