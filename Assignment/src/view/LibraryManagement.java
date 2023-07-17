/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.Library;

/**
 *
 * @author MoonWolf
 */
public class LibraryManagement {
    public static void main(String[] args) {
        String optionsMenu[] = {"List all books","Search Book","Add new book","Exit"};
        Library lib = new Library();
        Menu mainMenu = new MainMenu("Library Management", optionsMenu,lib);
        mainMenu.execute();
    }
}
