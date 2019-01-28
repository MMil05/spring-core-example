package pl.isa.book;

import java.util.Optional;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

	private final BookRepository bookRepository;
	private final ObjectMapper mapper;

	@Autowired
	public BookService(BookRepository bookRepository, ObjectMapper mapper) {
		this.bookRepository = bookRepository;
		this.mapper = mapper;
	}

	public Optional<Book> findOne() {
		return Optional.ofNullable(bookRepository.findOne());
	}

	public String findOneJson() throws JsonProcessingException {
		Optional<Book> bookOptional = findOne();

		//TODO: inject mapper, map book to json
		return mapper.writeValueAsString(bookOptional.get().toString());
	}

}
