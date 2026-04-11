package study.core.timus.task_2001;

import java.io.PrintWriter;
import java.util.Scanner;

public class Solve {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);

		int a1 = in.nextInt(), b1 = in.nextInt(), a2 = in.nextInt(), b2 = in.nextInt(), a3 = in.nextInt(), b3 = in.nextInt();
		out.println((a1 - a3) + " " + (b1 - b2));
		out.flush();
	}
}
