package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.UniqueElementsArray;
import main.UniqueElementsArray.ElementNotPresent;

class TestArray {

	
	@Test 
	void shouldBeUnique() {
		assertTrue(UniqueElementsArray.isUnique(2, new int[] { 1, 2, 1 }));
	}
	
	@Test
	void shouldNotBeUnique() {
		assertFalse(UniqueElementsArray.isUnique(1, new int[] { 1, 2, 1 }));
	}
	
	@Test
	void shouldThrowElementNotPresent() {
		Exception exception = assertThrows(ElementNotPresent.class,() ->
				UniqueElementsArray.isUnique(3, new int[] { 1, 2, 1 }));
		assertEquals("Element \"3\" was not found.", exception.getMessage());
	}

}
