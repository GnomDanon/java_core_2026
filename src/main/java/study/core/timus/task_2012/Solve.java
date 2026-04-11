package study.core.timus.task_2012;

import java.io.PrintWriter;
import java.util.Scanner;

public class Solve {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		PrintWriter writer = new PrintWriter(System.out);

		int f = in.nextInt();
		writer.println(f + 240 / 45 >= 12 ? "YES" : "NO");
		writer.flush();
	}
}
