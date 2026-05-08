package study.core.timus.task_1585;

import java.io.PrintWriter;
import java.util.Scanner;

public class Solve {
	public static final String EMPEROR = "Emperor Penguin";
	public static final String MACARONI = "Macaroni Penguin";
	public static final String LITTLE = "Little Penguin";

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);

		int count = Integer.parseInt(in.nextLine());

		int emperor = 0;
		int macaroni = 0;
		int little = 0;

		for (int i = 0; i < count; i++) {
			switch (in.nextLine()) {
				case EMPEROR:
					emperor++;
					break;
				case MACARONI:
					macaroni++;
					break;
				case LITTLE:
					little++;
					break;
			}
		}

		out.println(emperor > macaroni && emperor > little ? EMPEROR : macaroni > emperor && macaroni > little ? MACARONI : LITTLE);
		out.flush();
	}
}
