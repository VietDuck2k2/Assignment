/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.Library;
import java.util.List;
import model.Book;

/**
 *
 * @author MoonWolf
 */
public class SearchMenu extends Menu {
    public SearchMenu(String menuName, String[] options, Library lib) {
        super(menuName, options, lib);
    }

    @Override
    public void execute() {
        Library lib = super.getLib();
        while (true) {
            int choice = displayMenu();
            switch (choice) {
                case 1:
                    List<Book> listId = lib.searchBookById();
                    lib.printListBook(listId);
                    break;
                case 2:
                    List<Book> listTitle = lib.searchBookById();
                    lib.printListBook(listTitle);
                    break;
                case 3:
                    List<Book> listAuthor = lib.searchBookById();
                    lib.printListBook(listAuthor);
                    break;

                case 4:
                    List<Book> listYear = lib.searchBookById();
                    lib.printListBook(listYear);
                case 5:
                    return;            }
        }
    }
}
