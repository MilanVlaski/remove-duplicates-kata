package test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.LinkedHashMap;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.HashMapImplementation;

class TestArray {

	HashMapImplementation array;
	
	@BeforeEach
	void setup() {
		array = new HashMapImplementation();
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
