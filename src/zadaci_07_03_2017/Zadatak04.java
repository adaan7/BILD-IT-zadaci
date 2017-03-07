package zadaci_07_03_2017;

import java.util.ArrayList;
import java.util.Date;

public class Zadatak04 {

	public static void main(String[] args) {

		/*
		 * (Use ArrayList) Write a program that creates an ArrayList and adds a
		 * Loan object, a Date object, a string, and a Circle object to the
		 * list, and use a loop to display all the elements in the list by
		 * invoking the object’s toString() method.
		 */

		// creating an ArrayList of objects
		ArrayList<Object> list = new ArrayList<>();

		// creating date, string, circle and loan objects
		Object date = new Date();
		Object string = new String("nesto");
		Object circle = new Circle();
		Object loan = new Loan();

		// add objects to list
		list.add(date);
		list.add(string);
		list.add(circle);
		list.add(loan);

		// display objects toString() method
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).toString());
		}

	}

}
