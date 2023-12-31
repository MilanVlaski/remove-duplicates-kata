package test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

import main.DuplicateRemover;

class TestRemoveDuplicates {

	@Test
	void shouldReturnOriginalEmptyArray() {
		int[] emptyArray = new int[] {};
		assertArrayEquals(emptyArray, DuplicateRemover.remove2(emptyArray));
	}

	@Test
	void shouldReturnOriginalArrayLengthOne() {
		int[] array = new int[] { 1 };
		assertArrayEquals(array, DuplicateRemover.remove2(array));
	}

	@Test
	void shouldReturnOriginalArrayLengthTwo() {
		int[] array = new int[] { 1, 2 };
		assertArrayEquals(array, DuplicateRemover.remove2(array));
	}

	@Test
	void shouldRemoveDuplicate_IfRepeatsOnce() {
		assertArrayEquals(new int[] { 1 },
				DuplicateRemover.remove2(new int[] { 1, 1 }));
	}

	@Test
	void shouldRemoveDuplicates_IfRepeatsTwice() {
		assertArrayEquals(new int[] { 1 },
				DuplicateRemover.remove2(new int[] { 1, 1, 1}));
	}

	@Test
	void shouldRemoveDuplicates_IfArrayStartsWithAnotherNumber() {
		assertArrayEquals(new int[] { 1, 2 },
				DuplicateRemover.remove2(new int[] { 1, 2, 2 }));
	}

	@Test
	void shouldRemoveTwoConsecutiveDuplicates() {
		assertArrayEquals(new int[] { 1, 2 },
				DuplicateRemover.remove2(new int[] { 1, 1, 2, 2 }));
	}
	
	@Test
	void shouldRemoveNonConsecutiveduplicates() {
		assertArrayEquals(new int[] { 1, 2 },
				DuplicateRemover.remove2(new int[] { 1, 2, 1 }));
	}
}
