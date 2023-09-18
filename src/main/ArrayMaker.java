package main;

import java.util.Random;

public class ArrayMaker {
	public static Integer[] array(int length, int maxValue) {
		Random random = new Random();
		Integer[] array = new Integer[length];

		for (int i = 0; i < length; i++) {
			array[i] = random.nextInt(0, maxValue);
		}
		
		return array;
	}
}
