package study.core.timus.task_1001;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		PrintWriter writer = new PrintWriter(System.out);

		List<Long> numbers = new ArrayList<>();

		while (in.hasNextLong()) {
			numbers.add(in.nextLong());
		}

		String[] answer = new String[numbers.size()];

		for (int i = 0; i < answer.length; i++) {
			answer[answer.length - i -1] = String.format("%.4f", Math.sqrt(numbers.get(i)));
		}

		writer.println(String.join("\n", answer));
		writer.flush();
	}
}
