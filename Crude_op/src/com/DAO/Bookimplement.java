package com.DAO;

import com.bean.Bookinfo;
import java.util.Scanner;

public class Bookimplement implements Bookdetails {
	Bookinfo book[] = new Bookinfo[4];
	int count;

	public Bookimplement() {
		count = 0;
		// book=new Bookinfo[4];

	}

	Scanner sc = new Scanner(System.in);

	@Override
	public void insert() {
		System.out.println("enter no of books");
		int num = sc.nextInt();
		for (int i = 0; i < num; i++) {

			System.out.println("enter book id");
			int id = sc.nextInt();
			System.out.println("enter book name");
			String name = sc.next();
			System.out.println("enter book price");
			int pr = sc.nextInt();
			book[count] = new Bookinfo();
			book[count].setId(id);
			book[count].setName(name);
			book[count].setPrice(pr);
			count++;

		}
	}

	@Override
	public void display() {
		System.out.println("BOOK  DETAILS :");
		for (int i = 0; i < count; i++) {
		System.out.println(book[i]);
		}

	}

	@Override
	public void update(int id) {

		System.out.println("enter the price ");
		int price = sc.nextInt();

		for (int i = 0; i < count; i++) {
			if (book[i].getId() == id && book[i] != null) {
				book[i].setPrice(price);
				System.out.println("your Updated book Price");
				System.out.println(book[i]);

			}
		}
	}

	@Override
	public void search(int id) {
		System.out.println("enter the id of book which u want to search");
		int bid = sc.nextInt();
		for (int i = 0; i < count; i++) {
			if (book[i].getId() == bid) {
				System.out.println("your search result");
				System.out.println(book[i]);
				break;
			}
		}

	}

	@Override
	public void delete(int id) {
		for (int i = 0; i < count; i++) {
			if (book[i] != null) {
				if (book[i].getId() == id) {
					book[i] = null;
				}
			}
		}
	}

}
