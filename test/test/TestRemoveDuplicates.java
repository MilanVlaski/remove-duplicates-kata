package test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.DuplicateRemover;

class TestRemoveDuplicates {

	DuplicateRemover duplicateRemover;

	@BeforeEach
	void setup() {
		duplicateRemover = new DuplicateRemover();
	}

	@Test
	void shouldReturnOriginalEmptyArray() {
		int[] emptyArray = new int[] {};
		assertArrayEquals(emptyArray, duplicateRemover.work(emptyArray));
	}

	@Test
	void shouldReturnOriginalArrayLengthOne() {
		int[] array = new int[] { 1 };
		assertArrayEquals(array, duplicateRemover.work(array));
	}

	@Test
	void shouldReturnOriginalArrayLengthTwo() {
		int[] array = new int[] { 1, 2 };
		assertArrayEquals(array, duplicateRemover.work(array));
	}

	@Test
	void shouldRemoveDuplicate_IfRepeatsOnce() {
		assertArrayEquals(new int[] { 1 },
				duplicateRemover.work(new int[] { 1, 1 }));
	}

	@Test
	void shouldRemoveDuplicates_IfRepeatsTwice() {
		assertArrayEquals(new int[] { 1 },
				duplicateRemover.work(new int[] { 1, 1, 1}));
	}

	@Test
	void shouldRemoveDuplicates_IfArrayStartsWithAnotherNumber() {
		assertArrayEquals(new int[] { 1, 2 },
				duplicateRemover.work(new int[] { 1, 2, 2 }));
	}

	@Test
	void shouldRemoveTwoConsecutiveDuplicates() {
		assertArrayEquals(new int[] { 1, 2 },
				duplicateRemover.work(new int[] { 1, 1, 2, 2 }));
	}
	
	@Test
	void shouldRemoveNonConsecutiveduplicates() {
		assertArrayEquals(new int[] { 1, 2 },
				duplicateRemover.work(new int[] { 1, 2, 1 }));
	}
}
