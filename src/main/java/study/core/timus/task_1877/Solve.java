package study.core.timus.task_1877;

import java.io.PrintWriter;
import java.util.Scanner;

public class Solve {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);

		int first = in.nextInt(), second = in.nextInt();
		out.println(first % 2 == 0 || second % 2 != 0 ? "yes" : "no");
		out.flush();
	}
}
