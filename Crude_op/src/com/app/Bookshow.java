package com.app;

import java.util.Scanner;
import com.DAO.Bookimplement;

public class Bookshow {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Bookimplement b = new Bookimplement();
		char ch;
		do {
			System.out.println("Enter the choice for Book");
			System.out.println("1.insert\n2.display\n3.update\n4.delete\n5.search");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:

				b.insert();
				break;
			case 2:
				b.display();
				break;
			case 3:
				System.out.println("enter the updated id");
				int uid = sc.nextInt();

				b.update(uid);
				break;
			case 4:

				b.delete(choice);
				break;
			case 5:

				b.search(choice);
				break;
			default:
				System.out.println("Invalid operation");
			}

			System.out.println("Do you want continue");
			ch = sc.next().charAt(0);
		} while (ch == 'y' || ch == 'Y');

	}

}
