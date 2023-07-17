/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.List;
import java.util.Scanner;
import model.Book;

/**
 *
 * @author MoonWolf
 */
public class Validator {

    private final static Scanner sc = new Scanner(System.in);

    public String inputString(String msg) {
        System.out.println(msg);
        while (true) {
            String rs = sc.next();
            if (rs.length() == 0 || rs == null) {
                System.out.println("Not allow empty! Please try again.");
                continue;
            }
            return rs;
        }
    }

    public int inputInt(String msg, int min, int max) {
        System.out.println(msg);
        while (true) {
            String rs = sc.next();
            try {
                int num = Integer.parseInt(rs);
                if (num < min || num > max) {
                    System.out.println("Must be from " + min + " to" + max + " ! Please try again.");
                }
                return num;
            } catch (NumberFormatException e) {
                System.out.println("Must be a number! Please try again.");
            }
            
        }
    }

    public String inputId(List<Book> list) {
        String id = inputString("Enter id: ");
        while (true) {
            Book b = searchBook(id, list);
            if (b == null) {
                return id;
            }
            System.out.println("Id existed! Please try again.");
            continue;
        }
    }

    public Book searchBook(String id, List<Book> list) {
        for (Book b : list) {
            if (b.getId().equals(id)) {
                return b;
            }
        }
        return null;
    }
}
