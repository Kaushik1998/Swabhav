package com.techlab.html;

public class Control implements IHtml {

	private String tag;
	private String type;
	private String value;


	public Control(String tag, String type, String value) {
		super();
		this.tag = tag;
		this.type = type;
		this.value = value;
	}

	@Override
	public StringBuilder parseHtml() {
		// TODO Auto-generated method stub
		String space = " ";
		String line="\n";
		StringBuilder sb = new StringBuilder();
		sb.append("<");
		sb.append(tag);
		sb.append(space);
		sb.append("type = ");
		sb.append(type);
		sb.append(space);
		sb.append("value = ");
		sb.append(value);
		sb.append(">");
		sb.append(line);
		sb.append("</");
		sb.append(tag);
		sb.append(">");
		sb.append(line);
		return sb;
	}

}
