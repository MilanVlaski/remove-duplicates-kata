package main;

public class DuplicateRemover {

	private final UniqueArray uniqueArray = new LinkedSetImplementation();
	
	public int[] work(int[] input) {
		for (int i = 0; i < input.length; i++)
			uniqueArray.add(input[i]);

		return uniqueArray.get();
	}

}
