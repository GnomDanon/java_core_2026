package study.core.lr6.practice2;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static int findMaxParallel(int[] array) throws InterruptedException {
		int numThreads = Runtime.getRuntime().availableProcessors();

		int[] localMax = new int[numThreads];
		List<Thread> threads = new ArrayList<>();

		int chunkSize = array.length / numThreads;

		for (int i = 0; i < numThreads; i++) {
			final int threadIndex = i;

			final int start = i * chunkSize;

			final int end = (i == numThreads - 1)
					? array.length
					: start + chunkSize;

			threads.add(new Thread(() -> {
				int max = array[start];

				for (int j = start + 1; j < end; j++) {
					if (array[j] > max) {
						max = array[j];
					}
				}

				localMax[threadIndex] = max;
			}));
		}

		for (Thread thread : threads) {
			thread.start();
		}
		for (Thread thread : threads) {
			thread.join();
		}

		int globalMax = localMax[0];

		for (int i = 1; i < numThreads; i++) {
			if (localMax[i] > globalMax) {
				globalMax = localMax[i];
			}
		}

		return globalMax;
	}

	public static void main(String[] args) throws InterruptedException {
		int[] array = {3, 7, 2, 15, 9, 21, 4, 18};

		int max = findMaxParallel(array);

		System.out.println("Максимальный элемент: " + max);
	}
}