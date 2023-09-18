package main;

import java.util.HashMap;
import java.util.Map;

public class UniqueArray {
	private final Map<Integer, Integer> map = new HashMap<>();
	private int size = 0;

	public void add(int element) {
		if (!map.containsValue(element))
			map.put(size++, element);
	}

	public int size() {
		return size;
	}

	public int[] get() {
		int[] result = new int[map.size()];
		
		for (int i = 0; i < map.size(); i++)
			result[i] = map.get(i);

		return result;
	}
	
}
