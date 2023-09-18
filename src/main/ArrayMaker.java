package main;

import java.util.Random;

public class ArrayMaker {
	public static int[] array(int length, int maxValue) {
		Random random = new Random();
		int[] array = new int[length];

		for (int i = 0; i < length; i++) {
			array[i] = random.nextInt(0, maxValue);
		}
		
		return array;
	}
}
