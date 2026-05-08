package study.core.lr6.practice3;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static long parallelSum(int[] array) throws InterruptedException {
		int numThreads = Runtime.getRuntime().availableProcessors();

		long[] partialSums = new long[numThreads];
		List<Thread> threads = new ArrayList<>();

		int chunkSize = array.length / numThreads;

		for (int i = 0; i < numThreads; i++) {
			final int threadIndex = i;

			final int start = i * chunkSize;

			final int end = (i == numThreads - 1)
					? array.length
					: start + chunkSize;

			Thread thread = new Thread(() -> {
				long sum = 0;

				for (int j = start; j < end; j++) {
					sum += array[j];
				}

				partialSums[threadIndex] = sum;
			});

			threads.add(thread);
		}

		for (Thread thread : threads) {
			thread.start();
		}
		for (Thread thread : threads) {
			thread.join();
		}

		long totalSum = 0;

		for (long sum : partialSums) {
			totalSum += sum;
		}

		return totalSum;
	}

	public static void main(String[] args) throws InterruptedException {
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

		long result = parallelSum(array);

		System.out.println("Сумма элементов: " + result);
	}
}