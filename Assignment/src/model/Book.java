/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author MoonWolf
 */

public class Book implements Comparable<Book>{
    private String id, title, author, year;
    
    public Book(){
        
    }

    public Book(String id, String title, String author, String year) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book{" + "id=" + id + ", title=" + title + ", author=" + author + ", year=" + year + '}';
    }

    @Override
    public int compareTo(Book o) {
        int d = this.title.compareTo(o.getTitle());
        if(d > 0) return 1; //ascending
        else if(d < 0) return -1;
        return 0;
    }
    
    
}