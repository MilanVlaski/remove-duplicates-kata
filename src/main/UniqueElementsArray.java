package main;

import java.util.ArrayList;
import java.util.List;

public class UniqueElementsArray {
	private final List<Integer> list = new ArrayList<>();

	public static boolean isUnique(int integer, int[] array) {
		int occurences = 0;
		for (int i : array) {
			if(occurences > 1) {
				return false;
			}
			if (i == integer) {
				occurences++;
			}
		}
		if(occurences == 0) {
			throw new ElementNotPresent(integer);
		}
		return !(occurences > 1);
	}

	@SuppressWarnings("serial")
	public static class ElementNotPresent extends RuntimeException {

		public ElementNotPresent(Object element) {
			super("Element: \"" + element + "\" was not found.");
		}
	}
}
