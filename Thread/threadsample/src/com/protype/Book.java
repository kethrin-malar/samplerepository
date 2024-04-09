package com.protype;

public class Book {
	private int id;
	private String bookname;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", bookname=" + bookname + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
