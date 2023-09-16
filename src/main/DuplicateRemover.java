package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DuplicateRemover {

	public int[] work(int[] input) {
		UniqueArray uniqueArray = new UniqueArray();

		for (int i = 0; i < input.length; i++)
			uniqueArray.add(input[i]);

		return uniqueArray.get();
	}

}
