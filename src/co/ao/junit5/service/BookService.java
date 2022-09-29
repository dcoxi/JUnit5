package co.ao.junit5.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import co.ao.junit5.model.Book;

public class BookService {
	
	private List<Book> listBooks = new ArrayList<Book>();
	
	
	
	public void addBook(Book book) {
		listBooks.add(book);
	}
	
	public List<Book> Allbooks(){
		return Collections.unmodifiableList(listBooks);
	}

}
