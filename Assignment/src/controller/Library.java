/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import model.Book;

/**
 *
 * @author MoonWolf
 */
public class Library {

    private List<Book> listBook;
    private Validator vl;

    public Library() {
        listBook = new ArrayList<>();
        vl = new Validator();
    }

    public List<Book> getListBook() {
        return listBook;
    }

    public void setListBook(List<Book> listBook) {
        this.listBook = listBook;
    }

    public Validator getVl() {
        return vl;
    }

    public void setVl(Validator vl) {
        this.vl = vl;
    }

    public void readData() throws IOException {
        String filePath = "lib.txt";

        File file = new File(filePath);

        FileReader f = new FileReader(file);
        try (BufferedReader reader = new BufferedReader(f)) {
            String line = reader.readLine();
            String tokens[] = line.split(" ");
            String id = tokens[0];
            String title = tokens[1];
            String author = tokens[2];
            String year = tokens[3];

            Book newBook = new Book(id, title, author, year);
            listBook.add(newBook);

        } catch (Exception e) {
            e.getMessage();
        }
    }

    public Book addBook() {
        String id = vl.inputId(listBook);
        String title = vl.inputString("Enter title book: ");
        String author = vl.inputString("Enter author book: ");
        String year = vl.inputString("Enter year book:");

        Book newBook = new Book(id, title, author, year);
        listBook.add(newBook);
        return null;
    }

    public List<Book> searchBookById() {
        List<Book> list = new ArrayList<>();
        String id = vl.inputString("Enter id book to search: ");
        for (Book b : listBook) {
            if (b.getId().equals(id)) {
                list.add(b);
            }
        }
        return list;
    }

    public List<Book> searchBookByAuthor() {
        List<Book> list = new ArrayList<>();
        String author = vl.inputString("Enter author book to search: ");
        for (Book b : listBook) {
            if (b.getAuthor().equals(author)) {
                list.add(b);
            }
        }
        return list;
    }
    
    public List<Book> searchBookByTitle() {
        List<Book> list = new ArrayList<>();
        String title = vl.inputString("Enter author book to search: ");
        for (Book b : listBook) {
            if (b.getTitle().equals(title)) {
                list.add(b);
            }
        }
        return list;
    }
    
    public List<Book> searchBookByYear() {
        List<Book> list = new ArrayList<>();
        String year = vl.inputString("Enter author book to search: ");
        for (Book b : listBook) {
            if (b.getYear().equals(year)) {
                list.add(b);
            }
        }
        return list;
    }

    public void printListBook(List<Book> listBook) {
        int count = 0;
        System.out.println("List of books");
        System.out.println("-------------------------------");
        for (Book b : listBook) {
            System.out.println(b);
            count++;
        }
        System.out.println("-------------------------------");
        System.out.println("Total: " + count + " books.");
    }

}
