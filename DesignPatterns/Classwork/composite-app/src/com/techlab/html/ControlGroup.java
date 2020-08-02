package com.techlab.html;

import java.util.ArrayList;
import java.util.List;

public class ControlGroup implements IHtml {

	private String tag;
	private List<IHtml> controls = new ArrayList<IHtml>();

	public ControlGroup(String tag) {
		super();
		this.tag = tag;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public void addControl(IHtml element) {
		controls.add(element);
	}

	@Override
	public StringBuilder parseHtml() {
		// TODO Auto-generated method stub
		String space = " ";
		String line = "\n";
		StringBuilder sb = new StringBuilder();
		sb.append("<");
		sb.append(tag);
		sb.append(">");
		sb.append(line);
		for (IHtml i : controls) {
			sb.append(i.parseHtml());
		}
		sb.append("</");
		sb.append(tag);
		sb.append(">");
		sb.append(line);
		return sb;
	}

}
