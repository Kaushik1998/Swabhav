package com.techlab.html.test;

import java.io.IOException;

import com.techlab.html.Control;
import com.techlab.html.ControlGroup;
import com.techlab.html.HtmlWriter;

public class HtmlTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ControlGroup html = new ControlGroup("html");
		ControlGroup body = new ControlGroup("body");
		ControlGroup div = new ControlGroup("div");
		ControlGroup p1 = new ControlGroup("p");
		ControlGroup span = new ControlGroup("span");
		Control input1 = new Control("input", "text", "first name");
		p1.addControl(span);
		p1.addControl(input1);
		ControlGroup p2 = new ControlGroup("p");
		Control input2 = new Control("input", "text", "password");
		p2.addControl(input2);
		ControlGroup p3 = new ControlGroup("p");
		Control input3 = new Control("input", "submit", "login");
		p3.addControl(input3);
		div.addControl(p1);
		div.addControl(p2);
		div.addControl(p3);
		body.addControl(div);
		html.addControl(body);
		
		HtmlWriter hw = new HtmlWriter("test");
		hw.writeFile(html.parseHtml());
	}

}
