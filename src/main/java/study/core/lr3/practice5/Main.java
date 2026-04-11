package study.core.lr3.practice5;

import java.util.HashMap;

public class Main {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		map.put(0, "Ноль");
		map.put(1, "Один");
		map.put(2, "Два");
		map.put(3, "Три");
		map.put(4, "Четыре");
		map.put(5, "Пять");
		map.put(6, "Шесть");
		map.put(7, "Семь");
		map.put(8, "Восемь");
		map.put(9, "Девять");

		String keyGraterThenFive = "";
		String zeroValue = "";
		int multipleWithFiveLength = 1;

		for (Integer key : map.keySet()) {
			if (key > 5) {
				keyGraterThenFive += " " + map.get(key);
			} else if (key == 0) {
				zeroValue = map.get(key);
			}
			if (map.get(key).length() > 5) {
				multipleWithFiveLength *= key;
			}
		}

		System.out.println(keyGraterThenFive);
		System.out.println(zeroValue);
		System.out.println(multipleWithFiveLength);
	}
}
