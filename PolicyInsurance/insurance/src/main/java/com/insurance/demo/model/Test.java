package com.insurance.demo.model;

import java.io.File;
import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "sdjfdsa";
		Integer a = Integer.parseInt("123");
		File file = new File("sdsd");
		
		ArrayList list = new ArrayList();
		list.add(file);
		list.add(a);
		list.add(s);
		
		ArrayList<File> strlist = new ArrayList<File>();
		strlist.add(file);
	}

}
