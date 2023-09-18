package main;

public class DuplicateRemover {

	
	public static int[] work1(int[] input) {
		return work(input, new LinkedSetImplementation());
	}
	
	public static int[] work2(int[] input) {		
		return work(input, new HashMapImplementation());
	}

	private static int[] work(int[] input, UniqueArray uniqueArray) {
		for (int i = 0; i < input.length; i++)
			uniqueArray.add(input[i]);

		return uniqueArray.get();
	}
	
}
