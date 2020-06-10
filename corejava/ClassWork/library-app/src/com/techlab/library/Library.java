package com.techlab.library;

import java.util.ArrayList;

public class Library {
	private String libraryName;
	private String libraryLocation;
	private int libraryID;
	public Library(String libraryName, String libraryLocation, int libraryID) {
		super();
		this.libraryName = libraryName;
		this.libraryLocation = libraryLocation;
		this.libraryID = libraryID;
	}
	ArrayList<Book> books = new ArrayList<Book>();

	public void addBooks(Book b) {
		books.add(b);
	}

	@Override
	public String toString() {
		return "Library [libraryName=" + libraryName + ", libraryLocation=" + libraryLocation + ", libraryID="
				+ libraryID ;
	}

	public String getLibraryName() {
		return libraryName;
	}

	public void setLibraryName(String libraryName) {
		this.libraryName = libraryName;
	}

	public String getLibraryLocation() {
		return libraryLocation;
	}

	public void setLibraryLocation(String libraryLocation) {
		this.libraryLocation = libraryLocation;
	}

	public int getLibraryID() {
		return libraryID;
	}

	public void setLibraryID(int libraryID) {
		this.libraryID = libraryID;
	}

	public ArrayList<Book> getBooks() {
		return books;
	}

	public void setBooks(ArrayList<Book> books) {
		this.books = books;
	}
	
	public void display() {
		for(Book b: books) {
			b.display();
		}
	}
	
	
}
