package study.core.timus.task_1293;

import java.io.PrintWriter;
import java.util.Scanner;

public class Solve {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);

		int N = in.nextInt(), A = in.nextInt(), B = in.nextInt();
		int result = N * A * B * 2;

		out.println(result);
		out.flush();
	}
}
