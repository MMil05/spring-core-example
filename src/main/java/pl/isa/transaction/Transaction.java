package pl.isa.transaction;

import java.time.LocalDateTime;

import pl.isa.book.Book;
import pl.isa.client.Client;

public class Transaction {

	private Client client;
	private Book book;
	private LocalDateTime purchaseTime;

	public Transaction(Client client,
					   Book book,
					   LocalDateTime purchaseTime) {
		this.client = client;
		this.book = book;
		this.purchaseTime = purchaseTime;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public LocalDateTime getPurchaseTime() {
		return purchaseTime;
	}

	public void setPurchaseTime(LocalDateTime purchaseTime) {
		this.purchaseTime = purchaseTime;
	}
}
