package study.core.timus.task_1409;

import java.io.PrintWriter;
import java.util.Scanner;

public class Solve {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);

		int G = in.nextInt(), L = in.nextInt();
		int total = G + L - 1;

		out.printf("%d %d", total - G, total - L);
		out.flush();
	}
}
