package main;

import java.util.ArrayList;
import java.util.List;

public class UniqueArray {
	private final List<Integer> list = new ArrayList<>();
	
	public void add(int element) {
		if(!occurs(element, list))
			list.add(element);
	}
	
	public int size() {
		return list.size();
	}

	public static boolean occurs(int element, List<Integer> inList) {
		for (Integer integer : inList) {
			if (integer == element)
				return true;
		}
		return false;
	}

	public int[] get() {
		return intListToArray(list);
	}

	private static int[] intListToArray(List<Integer> list) {
		int[] result = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			result[i] = list.get(i);
		}
		return result;
	}
}
