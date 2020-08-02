package com.techlab.observer;

import java.util.ArrayList;
import java.util.List;

import com.techlab.subject.ChannelSubject;

public class SubscriberObserver {

	private String name;
	private List<ChannelSubject> channels = new ArrayList<ChannelSubject>();

	public void update(String title) {
		// TODO Auto-generated method stub
		System.out.println("Hey " + this + " ," + title + " has been uploaded");
	}

	public void subscribeChannel(ChannelSubject channel) {
		
	}

	public void unsubscribe(ChannelSubject channel) {
		channels.remove(channel);
	}

	public SubscriberObserver(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name ;
	}
	
}
