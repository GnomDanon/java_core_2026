package study.core.timus.task_2100;

import java.io.PrintWriter;
import java.util.Scanner;

public class Solve {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);

		int count = Integer.parseInt(in.nextLine());
		int guestsCount = 2;
		for (int i = 0; i < count; i++) {
			String[] guests = in.nextLine().split("\\+");
			guestsCount += guests.length;
		}

		out.println((guestsCount == 13 ? guestsCount + 1 : guestsCount) * 100);
		out.flush();
	}
}
