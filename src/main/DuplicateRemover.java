package main;

public class DuplicateRemover {

	public int[] work(int[] input) {
		HashMapImplementation hashMapImplementation = new HashMapImplementation();

		for (int i = 0; i < input.length; i++)
			hashMapImplementation.add(input[i]);

		return hashMapImplementation.get();
	}

}
