package pl.isa.book;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.stereotype.Controller;

@Controller
public class BookController {

	private BookService bookService;

	public BookController(BookService bookService) {
		this.bookService = bookService;
	}

	public String findOneJson() throws JsonProcessingException {
		return bookService.findOneJson();
	}

}
