package study.core.timus.task_1785;

import java.io.PrintWriter;
import java.util.Scanner;

public class Solve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		PrintWriter writer = new PrintWriter(System.out);

		writer.println(translate(in.nextInt()));
		writer.flush();
	}

	public static String translate(int count) {
		if (1 <= count && count <= 4)
			return "few";
		else if (5 <= count && count <= 9)
			return "several";
		else if (10 <= count && count <= 19)
			return "pack";
		else if (20 <= count && count <= 49)
			return "lots";
		else if (50 <= count && count <= 99)
			return "horde";
		else if (100 <= count && count <= 249)
			return "throng";
		else if (250 <= count && count <= 499)
			return "swarm";
		else if (500 <= count && count <= 999)
			return "zounds";
		else
			return "legion";
	}
}
