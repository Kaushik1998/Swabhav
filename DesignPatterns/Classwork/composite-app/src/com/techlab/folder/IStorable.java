package com.techlab.folder;

public interface IStorable {
	String display();

	String getName();

	String displayWithIdent(int ident);

	void print(int ident);

	void setName(String name);

	void display(StringBuilder dashes);
}
