package main;

public class MainClass {

	public static void main(String[] args) {
		double startTime;
		double endTime;
		
		startTime = System.currentTimeMillis();
		DuplicateRemover.remove2(ArrayMaker.array(100000, 100000));
		endTime = System.currentTimeMillis();
		
		System.out.println("Execution time is: " + (endTime - startTime) + "ms");
	}
}
