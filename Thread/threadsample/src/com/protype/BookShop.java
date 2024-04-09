package com.protype;

import java.util.List;
import java.util.ArrayList;


//cloneable is a markerInterface it is nothing inside the {}
public class BookShop implements Cloneable 
{ 
	private String ShopName;
	
	List<Book> books = new  ArrayList<>();

	public String getShopName() {
		return ShopName;
	}

	public void setShopName(String shopName) {
		ShopName = shopName;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}
	
	public void loadData() {
		for(int i=1;i<=10;i++) {//set of 10 book iterate
			Book b = new Book();
			b.setId(i);//book id
			b.setBookname("book" +i);//book name
			getBooks().add(b);//add to book object b
		}
	}

	/*shallow copy of Override
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}*/

	
	//deepcopy
	@Override
	protected BookShop clone() throws CloneNotSupportedException {
		BookShop shop = new BookShop();
		for(Book b : this.getBooks()) {
			shop.getBooks().add(b);
		}
			return shop;
		}
		
	
	@Override
	public String toString() {
		return "BookShop [ShopName=" + ShopName + ", books=" + books + "]";
	}

	
}
