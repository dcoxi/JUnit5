package co.ao.junit5.assertions.assertTimeoutDemo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import co.ao.junit5.model.Book;
import co.ao.junit5.service.BookService;

public class AsserttimeOutDemo {
	
	private BookService service = new BookService();
	
	@Test
	public void asserTimeoutWithNoMessage() {
		
		for(int i =1; i <= 100000; i++) {
			service.addBook(new Book(String.valueOf(i), "Head First Java", "Wrox"));
		}
		List<Book> books = new ArrayList<>();
		
		assertTimeout(Duration.ofSeconds(-1), () -> {
			books.addAll(service.Allbooks());
		});
		assertEquals(100000, books.size());
	}

}
