package com.techlabs.adapter;

import java.util.Iterator;

public class QueueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IQueue<String> q = new QueueAdapter<String>();
		q.enqueue("S");
		q.enqueue("SS");
		q.enqueue("SDS");

		System.out.println(q.count());

		q.dequeue();
		q.dequeue();
		System.out.println(q.count());// 1

		q.enqueue("AA");
		q.enqueue("SD");
		q.enqueue("LAST ITEM");
		q.removeLast();

		for (Iterator<String> i = q.iterator(); i.hasNext();) {
			System.out.println(i.next());
		}

	}

}
