package main;

public class DuplicateRemover {

	
	public static int[] work1(int[] input) {
		UniqueArray uniqueArray = new LinkedSetImplementation();
		
		for (int i = 0; i < input.length; i++)
			uniqueArray.add(input[i]);

		return uniqueArray.get();
	}
	
	public static int[] work2(int[] input) {		
		UniqueArray uniqueArray = new HashMapImplementation();
		
		for (int i = 0; i < input.length; i++)
			uniqueArray.add(input[i]);

		return uniqueArray.get();
	}
}
