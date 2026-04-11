package study.core.timus.task_1264;

import java.io.PrintWriter;
import java.util.Scanner;

public class Solve {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);

		out.println(in.nextInt() * (in.nextInt() + 1));
		out.flush();
	}
}
