package com.techlab.subject;

import java.util.ArrayList;
import java.util.List;

import com.techlab.observer.SubscriberObserver;

public class ChannelSubject {

	private List<String> title = new ArrayList<>();
	private List<SubscriberObserver> subs = new ArrayList<>();

	public void upload(String title) {
		this.title.add(title);
		notifySubscribers(title);
	}

	public void notifySubscribers(String title) {
		for (SubscriberObserver sub : subs) {
			sub.update(title);
		}
	}

	public void subscribe(SubscriberObserver sub) {
		subs.add(sub);
		sub.subscribeChannel(this);
	}

}
