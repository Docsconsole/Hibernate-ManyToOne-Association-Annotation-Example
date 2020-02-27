package com.docsconsole.tutorials.hibernate5.client;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.docsconsole.tutorials.hibernate5.entity.Author;
import com.docsconsole.tutorials.hibernate5.entity.Book;
import com.docsconsole.tutorials.hibernate5.util.HibernateUtil;

public class MainClient {
	
	public static void main(String[] args) {

		System.out.println("Main method@@MainClient");

		// obtains the session
		Author author1 = new Author();
		author1.setAuthorName("Author1");
		

		Book book1 = new Book("Book1", 100.0, author1);
		Book book2 = new Book("Book2", 200.0, author1);
		Book book3 = new Book("Book3", 300.0, author1);

		try {

			// Get Session
			Session session = HibernateUtil.getSessionFactory().openSession();

			System.out.println("Session is created");
			// start transaction
			Transaction tx = session.beginTransaction();

			// Save the Model objects
			session.save(author1);
			session.save(book1);
			session.save(book2);
			session.save(book3);

			session.getTransaction().commit();
			session.close();
			System.out.println("Session is closed");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}