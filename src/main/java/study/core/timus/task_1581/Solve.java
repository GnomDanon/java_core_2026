package study.core.timus.task_1581;

import java.io.PrintWriter;
import java.util.Scanner;

public class Solve {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);

		int N = in.nextInt();
		int lastNumber = in.nextInt();
		int count = 1;
		String result = "";

		for (int i = 1; i < N; i++) {
			int number = in.nextInt();
			if (number == lastNumber) {
				count++;
			} else {
				result += (count + " " + lastNumber + " ");
				lastNumber = number;
				count = 1;
			}
		}
		result += (count + " " + lastNumber + " ");

		out.println(result);
		out.flush();
	}
}
