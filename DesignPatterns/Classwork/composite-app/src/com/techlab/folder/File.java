package com.techlab.folder;

public class File implements IStorable {

	private final String prefix = "-";
	private String name;
	private double size;
	private String extension;
	private StringBuilder sb = new StringBuilder();

	public File(String name, double size, String extension) {
		this.name = prefix.concat(name);
		this.size = size;
		this.extension = extension;
	}

	public String getName() {
		return name;
	}

	public double getSize() {
		return size;
	}

	public String getExtension() {
		return extension;
	}

	@Override
	public String display() {
		return name;
	}

	@Override
	public String toString() {
		return name;
	}

	@Override
	public String displayWithIdent(int ident) {
		applyIdent(ident + 1);
		sb.append(name);
		return name;
	}

	void applyIdent(int ident) {
		if (ident > 0) {
			for (int i = 0; i < ident; i++) {
				sb.append(" ");
			}
		}
	}

	public void print(int i) {
		System.out.print(name);
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name = name;
	}
	
	@Override
	public void display(StringBuilder dashes) {
		dashes.delete(dashes.indexOf("-"), dashes.length());
		dashes.append("-");
		System.out.print("   " + dashes + " " + " " + name + " " + size + " " + extension);
		System.out.println();
	}

}
