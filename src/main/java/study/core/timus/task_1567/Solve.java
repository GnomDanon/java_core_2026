package study.core.timus.task_1567;

import java.io.PrintWriter;
import java.util.Scanner;

public class Solve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);

		String s = in.nextLine();
		int sum = 0;

		for (char c : s.toCharArray()) {
			switch (c) {
				case 'a': case 'd': case 'g':
				case 'j': case 'm': case 'p':
				case 's': case 'v': case 'y':
				case ' ': case '.':
					sum += 1;
					break;

				case 'b': case 'e': case 'h':
				case 'k': case 'n': case 'q':
				case 't': case 'w': case 'z':
				case ',':
					sum += 2;
					break;

				case 'c': case 'f': case 'i':
				case 'l': case 'o': case 'r':
				case 'u': case 'x': case '!':
					sum += 3;
					break;
			}
		}

		out.println(sum);
		out.flush();
	}
}
