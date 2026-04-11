package study.core.lr4.practice2;

import java.util.Arrays;
import java.util.Scanner;

public class Practice2 {
	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3}, { 4, 5, 6 }, { 7, 8, 9 }};

		Scanner in = new Scanner(System.in);
		System.out.println("Введите номер столбца: ");
		int column = Integer.parseInt(in.nextLine());

		System.out.println(Arrays.toString(matrix[column]));
	}
}
