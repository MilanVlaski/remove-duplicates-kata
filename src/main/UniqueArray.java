package main;

import java.util.LinkedHashSet;
import java.util.Set;

public class UniqueArray {
	private final Set<Integer> set = new LinkedHashSet<>();
	
	public void add(int element) {
		set.add(element);
	}
	
	public int size() {
		return set.size();
	}
	
	public int[] get() {
		
		int[] result = new int[set.size()];
		int i = 0;
		for (int element : set) {
			result[i++] = element;
		}
		return result;
	}
}
