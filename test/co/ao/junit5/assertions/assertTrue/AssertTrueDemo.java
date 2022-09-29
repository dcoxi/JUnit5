package co.ao.junit5.assertions.assertTrue;


import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;

import co.ao.junit5.model.Book;
import co.ao.junit5.service.BookService;

public class AssertTrueDemo {

	
	private  BookService service = new BookService();
	
	@Test
	public void assertTrueWtithNoMessage() { 	
	
		
		Book book = new Book("1","Sem Volta","2000");
				service.addBook(book);
		
		List<Book> books = service.Allbooks();
		assertTrue(books.isEmpty());
	//Com lambda	assertTrue(() -> books.isEmpty());

		
	}
	
	@Test
	public void assertTrueWtithMessage() { 	
	
		
		Book book = new Book("1","Sem Volta","2000");
				service.addBook(book);
		
		List<Book> books = service.Allbooks();
		assertTrue(books.isEmpty(), () -> "Lista não esta vázia.");  //Com o lambda
//Sem lambda		assertTrue(books.isEmpty(), "Lista não esta vázia.");  

		
	}
	
}
