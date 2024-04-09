package com.protype;

public class Demo {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		
		BookShop bs = new BookShop();
		bs.setShopName("ABC");
		bs.loadData();
		
		
		
		/*BookShop bs1 = new BookShop();
		bs1.setShopName("A1");
		System.out.println(bs1);//no data in this book shop. add clone()*/
		
		
		BookShop bs1 = (BookShop)bs.clone();
		bs1.setShopName("A1");
		bs.getBooks().remove(1);
		//bs.loadData(); even not loading the date you get the copy of the bookshop ABC
		System.out.println(bs);
		System.out.println(bs1);
		
	}
	

}
