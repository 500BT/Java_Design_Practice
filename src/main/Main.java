package main;

import objects.Phonebook;

public class Main {
	public static void main(String[] args) {
		
		Phonebook book = new Phonebook();
		
		book.insertData("Kim", "Kihyeon", "01011111111");
		book.insertData("Kang", "Bohun", "01022222222");
		book.insertData("Park", "Jaebin", "01033333333");
		
		System.out.println(book.searchPerson("Kang", "Bohun", "01022222222"));
		
		book.printBook();
		
		book.removeData(book.searchPerson("Kang", "Bohun", "01022222222"));
		
		book.printBook();
	}
}
