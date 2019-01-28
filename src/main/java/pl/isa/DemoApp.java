package pl.isa;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.isa.book.BookController;

public class DemoApp {

	public static void main(String[] args) throws JsonProcessingException {
		final ApplicationContext context = new AnnotationConfigApplicationContext("pl.isa");
		BookController bookService = context.getBean(BookController.class);

		System.out.println(bookService.findOneJson());
	}

}
