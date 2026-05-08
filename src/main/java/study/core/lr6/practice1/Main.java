package study.core.lr6.practice1;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		Thread[] threads = new Thread[10];

		for (int i = 0; i < threads.length; i++) {
			threads[i] = new Thread(() -> {
				String name = Thread.currentThread().getName();
				System.out.println(name.charAt(name.length() - 1));
			});
		}

		for (Thread thread : threads) {
			thread.start();
		}

		for (Thread thread : threads) {
			thread.join();
		}
	}
}
