package study.core.timus.task_1787;

import java.io.PrintWriter;
import java.util.Scanner;

public class Solve {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);

		int k = in.nextInt(), n = in.nextInt();
		int queue = 0;

		for (int i = 0; i < n; i++) {
			queue += in.nextInt();
			queue -= k;
			queue = Math.max(0, queue);
		}

		out.println(queue);
		out.flush();
	}
}
