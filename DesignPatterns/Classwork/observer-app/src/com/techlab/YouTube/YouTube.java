package com.techlab.YouTube;

import com.techlab.observer.SubscriberObserver;
import com.techlab.subject.ChannelSubject;

public class YouTube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChannelSubject kaushik = new ChannelSubject();
		
		SubscriberObserver s1=new SubscriberObserver("Kaushik");
		SubscriberObserver s2=new SubscriberObserver("Paras");
		SubscriberObserver s3=new SubscriberObserver("Shailesh");
		SubscriberObserver s4=new SubscriberObserver("Jayant");
		
		kaushik.subscribe(s1);
		kaushik.subscribe(s2);
		kaushik.subscribe(s3);
		kaushik.subscribe(s4);
		
		kaushik.upload("New Video");
	}

}
