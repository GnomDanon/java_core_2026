package study.core.timus.task_1131;

import java.io.PrintWriter;
import java.util.Scanner;

public class Solve {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);

		int N = in.nextInt(), K = in.nextInt();
		int time = getSolution(N, K);

		out.println(time);
		out.flush();
	}

	public static int getSolution(int N, int K) {
		int completed = 1, time = 0;

		while (completed < N && completed < K) {
			completed *= 2;
			time++;
		}

		if (completed >= N) {
			return time;
		}

		int remaining = N - completed;
		return time + (remaining + K - 1) / K;
	}
}
