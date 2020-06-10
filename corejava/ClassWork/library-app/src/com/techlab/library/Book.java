package com.techlab.library;

public class Book {
	public enum LanguageSet {
		English, Marathi, Hindi, Japanese
	};

	public enum BookSet {
		Java, Python, JavaScript
	};

	private BookSet book;
	private LanguageSet language;
	private String bookName;

	public Book(BookSet book, LanguageSet language, String bookName) {
		super();
		this.book = book;
		this.language = language;
		this.bookName = bookName;
	}

	public BookSet getBook() {
		return book;
	}

	public void setBook(BookSet book) {
		this.book = book;
	}

	public LanguageSet getLanguage() {
		return language;
	}

	public void setLanguage(LanguageSet language) {
		this.language = language;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	public void display() {
		System.out.println("Book Name : " + bookName);
		System.out.println("Language : " + language);
		System.out.println("BookSet : " + book);
	}
}
