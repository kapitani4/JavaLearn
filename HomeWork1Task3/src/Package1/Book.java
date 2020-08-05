package Package1;

import java.util.ArrayList;
import java.util.Scanner;

public class Book {

	Title title;
	Author author;
	Content content;
	
	public Book(String titleString,String authorString,String contentString) {
		// TODO Auto-generated constructor stub
		title = new Title(titleString);
		author = new Author(authorString);
		content = new Content(contentString);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanerScanner = new Scanner(System.in);
		System.out.println("Введите: название, автора, содержание \n");
		String titleString = scanerScanner.nextLine();
		String authorString = scanerScanner.nextLine();
		String contentString = scanerScanner.nextLine();
		Book book = new Book(titleString, authorString, contentString);
		System.out.println("Введенная книга:\n");
		book.title.show();
		book.author.show();
		book.content.show();
	}

}
