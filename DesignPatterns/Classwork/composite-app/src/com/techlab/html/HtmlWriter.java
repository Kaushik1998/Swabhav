package com.techlab.html;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class HtmlWriter {
	private String name;
	private String path = "D:\\Swabhav\\DesignPatterns\\Classwork\\composite-app\\src\\com\\techlab\\resource\\";

	public HtmlWriter(String name) {
		super();
		this.name = name;
	}

	public String writeFile(StringBuilder sb) throws IOException {
		File file = new File(path.concat(name.concat(".html")));
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
			writer.write(sb.toString());
			return "Hua";
		} catch (IOException e) {
			return "Mistake";
		}
	}
}