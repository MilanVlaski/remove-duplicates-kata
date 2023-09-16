package test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.UniqueArray;

class TestArray {

	UniqueArray array;
	
	@BeforeEach
	void setup() {
		array = new UniqueArray();
	}
	
	@Test
	void shouldAddInteger() {
		array.add(3);
		assertEquals(1, array.size());
	}
	
	@Test
	void shouldAddOnlyOnce_IfSameNumber() {
		array.add(3);
		array.add(3);
		assertEquals(1, array.size());
	}
	
	@Test
	void shouldGetArray() {
		array.add(1);
		assertArrayEquals(new int[] {1}, array.get());
	}

}
