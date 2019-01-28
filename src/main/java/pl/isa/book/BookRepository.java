package pl.isa.book;

import org.springframework.stereotype.Repository;
import pl.isa.author.Author;

@Repository
public class BookRepository {

	public Book findOne() {
		return new Book("Book 1", new Author("Author 1"), 50.0);
	}

}
