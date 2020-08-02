package com.techlabs.adapter;

public interface IQueue<T> extends Iterable<T> {
	void enqueue(T item);

	void dequeue();

	int count();

	void removeLast();

}
