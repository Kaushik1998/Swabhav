package com.techlab.library.test;

import com.techlab.library.Book;
import com.techlab.library.Book.BookSet;
import com.techlab.library.Book.LanguageSet;
import com.techlab.library.Library;

public class LibraryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library lb=new Library("Dadar Library", "Dadar", 400094);
		lb.addBooks(new Book(BookSet.Java,LanguageSet.English,"HeadFirstJava"));
		System.out.println(lb);
		System.out.println("\tLibrary Class");
		lb.display();
		System.out.println("\tBook Class");
		Book b=new Book(BookSet.Python,LanguageSet.Hindi,"HeadFirstPython");
		b.display();
	}
}
