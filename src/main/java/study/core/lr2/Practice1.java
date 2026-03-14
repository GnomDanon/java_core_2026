package study.core.lr2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Введите размер массива");
		int size = in.nextInt();

		if (size < 1) {
			System.out.println("Массив пустой");
		}

		int[] nums = new int[size];
		Random random = new Random();

		int minValue = Integer.MAX_VALUE;
		List<Integer> indexes = new ArrayList<>();

		for (int i = 0; i < nums.length; i++) {
			int value = random.nextInt(200);
			nums[i] = value;

			if (value < minValue) {
				minValue = value;
				indexes.clear();
				indexes.add(i);
			} else if (value == minValue) {
				indexes.add(i);
			}
		}

		System.out.printf("Полученный массив: %s\n", Arrays.toString(nums));
		System.out.printf("Минимальное значение: %d; индексы элементов с минимальным значением: %s", minValue, Arrays.toString(indexes.toArray()));
	}
}
