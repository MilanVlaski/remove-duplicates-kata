package test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import main.UniqueArray;

class TestArray {

	
	@Test 
	void shouldBeUnique() {
		assertTrue(UniqueArray.occurs(1, Arrays.asList(1)));
	}
	
	@Test
	void shouldNotBeUnique() {
		assertFalse(UniqueArray.occurs(2, Arrays.asList(1)));
	}
	
	@Test
	void shouldAddInteger() {
		UniqueArray array = new UniqueArray();
		array.add(3);
		assertEquals(1, array.size());
	}
	
	@Test
	void shouldAddOnlyOnce_IfSameNumber() {
		UniqueArray array = new UniqueArray();
		array.add(3);
		array.add(3);
		assertEquals(1, array.size());
	}
	
	@Test
	void shouldGetArray() {
		UniqueArray array = new UniqueArray();
		array.add(1);
		assertArrayEquals(new int[] {1}, array.get());
	}

}
