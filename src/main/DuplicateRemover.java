package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DuplicateRemover {

	public int[] work(int[] input) {
		if(input.length >= 2) {
			List<Integer> tempList = new Stack<>();
			tempList.add(input[0]);
			
			for(int i = 0; i < input.length - 1; i++) {		
				if(input[i] != input[i+1]) 
					tempList.add(input[i+1]);
			}
				
			return intListToArray(tempList);
		} else {
			return input;
		}
		
	}
	
	private boolean isUnique(int integer, int[] array) {
		int occurences = 0;
		for (int i : array) {
			if(i == integer) {
				occurences++;
			}
		}
		return occurences > 1;
	}

	private int[] intListToArray(List<Integer> list) {
		int[] result = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			result[i] = list.get(i);
		}
		return result;
	}
}
