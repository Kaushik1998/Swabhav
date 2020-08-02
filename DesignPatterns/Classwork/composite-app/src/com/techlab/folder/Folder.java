package com.techlab.folder;

import java.util.ArrayList;
import java.util.List;

public class Folder implements IStorable {
	private final String prefix = "--";
	private String name;
	private List<IStorable> children = new ArrayList<IStorable>();
	private StringBuilder sb = new StringBuilder();

	public Folder(String name) {
		this.name = prefix.concat(name);
	}

	public String getName() {
		return name;
	}

	public void addChildren(IStorable iStorable) {
		// children.add(iStorable);
		StringBuilder sName = new StringBuilder();
		sName.append(name);
		sName.append(iStorable.getName());
		if (iStorable.getClass() == Folder.class) {
			iStorable.setName(sName.toString());
		}
	}

	@Override
	public String display() {
		for (IStorable i : children) {
			sb.append(i.getName());
		}
		return sb.toString();
	}

	@Override
	public String displayWithIdent(int ident) {
		// TODO Auto-generated method stub
		String line = "\n";
		// applyIdent(ident);
		sb.append(name);
		sb.append(line);
		for (IStorable i : children) {
			applyIdent(ident + 1);
			sb.append(i.displayWithIdent(ident + 1));
		}
		sb.append(line);
		return sb.toString();
	}

	void applyIdent(int ident) {
		if (ident > 0) {
			for (int i = 0; i < ident; i++) {
				sb.append("\t");
			}
		}
	}

	public void print(int ident) {
		System.out.println();
		System.out.print(name);
		printIdent(ident + 1);
		for (IStorable i : children) {
			i.print(ident + 1);
		}
	}

	public void printIdent(int ident) {
		if (ident > 0) {
			for (int i = 0; i < ident; i++) {
				System.out.print("\t");
			}
		}
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name = name;
	}

	@Override
	public void display(StringBuilder dashes) {

		System.out.println(dashes + " " + getName());

		dashes.insert(0, " ");
		for (IStorable s : children) {
			System.out.print(" ");
			s.display(dashes);
		}
		dashes.setLength(0);
		dashes.append("--");
	}
}
