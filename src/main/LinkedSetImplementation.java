package main;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedSetImplementation implements UniqueArray {
	private final LinkedHashSet<Integer> set = new LinkedHashSet<>();
	
	@Override
	public void add(int element) {
		set.add(element);
	}
	
	@Override
	public int size() { 
		return set.size();
	}
	
	@Override
	public int[] get() {
		
		int[] result = new int[set.size()];
		int i = 0;
		for (int element : set) {
			result[i++] = element;
		}
		return result;
	}
}
