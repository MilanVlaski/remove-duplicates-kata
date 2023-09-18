package main;

import java.util.HashMap;
import java.util.Map;

public class HashMapImplementation implements UniqueArray {
	private final Map<Integer, Integer> map = new HashMap<>();
	private int size = 0;

	@Override
	public void add(int element) {
		if (!map.containsValue(element))
			map.put(size++, element);
	} 

	@Override
	public int size() {
		return size;
	}

	@Override
	public int[] get() {
		int[] result = new int[map.size()];

		for (int i = 0; i < map.size(); i++)
			result[i] = map.get(i);

		return result;
	}

}
