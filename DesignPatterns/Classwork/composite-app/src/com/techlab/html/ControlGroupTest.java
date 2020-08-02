package com.techlab.html;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.Test;

class ControlGroupTest {

	@Test
	void test() throws IOException {
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
		System.out.println(html.parseHtml());

		HtmlWriter hw = new HtmlWriter("test");
		System.out.println(hw.writeFile(html.parseHtml()));
	}

}
