package study.core.lr2;

import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Введите количество строк:");
		int m = in.nextInt();

		System.out.println("Введите количество столбцов:");
		int n = in.nextInt();

		int[][] nums = new int[m][n];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				int index = i % 2 == 0 ? j : n - j - 1;
				System.out.printf("Введите значение для позиции %d,%d\n", i, index);
				nums[i][index] = in.nextInt();
			}
		}

		System.out.println("Введенный массив:");
		for (int i = 0; i < m; i++) {
			StringBuilder row = new StringBuilder();
			for (int j = 0; j < n; j++) {
				row.append(String.format("%d ", nums[i][j]));
			}
			System.out.println(row);
		}
	}
}
