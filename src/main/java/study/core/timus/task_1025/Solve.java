package study.core.timus.task_1025;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Solve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		PrintWriter writer = new PrintWriter(System.out);

		int count = in.nextInt();
		int[] groups = new int[count];

		for (int i = 0; i < count; i++) {
			groups[i] = in.nextInt();
		}

		writer.println(getSolution(groups));
		writer.flush();
	}

	public static int getSolution(int[] groups) {
		Arrays.sort(groups);

		int result = 0;

		for (int i = 0; i < groups.length / 2 + 1; i++) {
			result += groups[i] / 2 + 1;
		}

		return result;
	}
}
