package doce;

import java.util.Hashtable;
import java.util.Enumeration;
import javax.swing.JOptionPane;
public class SegundoEjercicio {
	 public static void main(String[] args) {
	        
	        Hashtable<String, String> books = new Hashtable<String, String>();
	      
	        for (int i = 0; i < 3; i++) {
	            String title = JOptionPane.showInputDialog("Ingrese el título del libro:");
	            String author = JOptionPane.showInputDialog("Ingrese el autor del libro:");
	            books.put(title, author);
	        }
	   
	        displayBooks(books);
	    }

	    private static void displayBooks(Hashtable<String, String> books) {
	        Enumeration<String> keys = books.keys();
	        while (keys.hasMoreElements()) {
	            String title = keys.nextElement();
	            String author = books.get(title);
	            System.out.println("Título: " + title + ", Autor: " + author);
	        }
	    }
	}

