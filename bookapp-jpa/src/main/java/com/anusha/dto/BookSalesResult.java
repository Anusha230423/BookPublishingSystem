package com.anusha.dto;


import com.anusha.model.Book;

public class BookSalesResult {

	public BookSalesResult() {
		super();
	}

	public BookSalesResult(Long id, String name, Integer price, Long totalQuantity, Long totalSales) {
		System.out.println(id+"-"+ name +"-" + price +"-" + totalQuantity + "-" + totalSales);
		this.book = new Book();
		this.book.setId(id);
		this.book.setName(name);
		this.book.setPrice(price);
		//this.book.setReleasedDate(releasedDate);
		this.totalQuantity = totalQuantity;
		this.totalSales = totalSales;
	}

	private Book book;
	
	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public Long getTotalQuantity() {
		return totalQuantity;
	}

	public void setTotalQuantity(Long totalQuantity) {
		this.totalQuantity = totalQuantity;
	}

	public Long getTotalSales() {
		return totalSales;
	}

	public void setTotalSales(Long totalSales) {
		this.totalSales = totalSales;
	}

	private Long totalQuantity;

	private Long totalSales;
	
}
