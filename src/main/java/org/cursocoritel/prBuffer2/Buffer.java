package org.cursocoritel.prBuffer2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Buffer<T> {
	private Queue<T> buffer;
	private int capacity;
	int numberOfPuts = 0;
	int numberOfGets = 0;

	/**
	 * Constructor
	 * 
	 * @param bufferSize
	 */

	public Buffer(int bufferSize) {
		capacity = bufferSize;
		buffer = new LinkedList<T>();
	}

	public void put(T element) throws BufferException {
		if (buffer.size() == capacity)
			throw new BufferException();

		System.out.println("Element inserted");

		buffer.add(element);
		numberOfPuts++;
	}

	public Object get() throws BufferException {
		if (buffer.isEmpty())
			throw new BufferException();

		Object value = buffer.remove();
		System.out.println("Element extracted");

		numberOfGets++;
		return value;
	}

	public int getNumberOfElements() {
		return buffer.size();
	}

	public int getNumberOfHoles() {
		return capacity - buffer.size();
	}

	public int getCapacity() {
		return capacity;
	}

	public double getNumberOfOperations() {
		return (double) numberOfPuts + numberOfGets;
	}
}
