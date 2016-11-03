package org.cursocoritel.prBuffer2;

import static org.junit.Assert.*;

import org.cursocoritel.prBuffer2.Buffer;
import org.junit.Test;

import mockit.Deencapsulation;

public class BufferTest {
	@Test
	public void shouldConstructorCreateABufferWithTheRightCapacity() {
		Buffer<Integer> buffer = new Buffer<Integer>(25) ;

		//assertEquals(25, buffer.getCapacity()) ;
		assertEquals(25, (int)Deencapsulation.getField(buffer, "capacity")) ;
	}

	@Test
	public void shouldGetCapacityReturnTheRightValue() {
		int capacity = 15 ;
		Buffer<Integer> buffer = new Buffer<Integer>(capacity) ;
		assertEquals(capacity, buffer.getCapacity()) ;
	}
}
