package com.anusha.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anusha.dto.BookSalesResult;
import com.anusha.model.Book;
import com.anusha.repository.BookRepository;
import com.anusha.repository.BookSalesRepository;

@Service
public class BookService {

	@Autowired
	private BookRepository bookRepository;
	
	@Autowired
	private BookSalesRepository bookSalesRepository;

	public List<Book> findAll() {
		return bookRepository.findAll();
	}

	public Book findOne(Long id) {
		return bookRepository.findOne(id);
	}

	public List<Book> findByPriceDesc() {
		return bookRepository.findByOrderByPriceDesc();
	}
	
	public List<Book> findByPriceAsc() {
		return bookRepository.findByOrderByPriceAsc();
	}

	public List<Book> findByReleasedDateDesc() {
		return bookRepository.findByOrderByReleasedDateDesc();
	}
	
	public List<BookSalesResult> findBookSales()
	{
		return bookSalesRepository.findBookSales();
	}
	
}
