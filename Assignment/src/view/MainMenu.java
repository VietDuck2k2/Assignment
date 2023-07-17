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
public class MainMenu extends Menu {

    public MainMenu(String menuName, String[] options, Library lib) {
        super(menuName, options, lib);
    }
    
    @Override
    public void execute() {
        String optionsSearch[] = {"Find by BookId","Find by Title","Find by Author","Find by Year","Back to Main Menu"};
        Library lib = super.getLib();
        while (true) {
            int choice = displayMenu();
            switch (choice) {
                case 1: lib.printListBook(lib.getListBook());
                        break;
                case 2: 
                        Menu searchMenu = new SearchMenu("Book Searching", optionsSearch, lib);
                        searchMenu.execute();
                        break;
                case 3:
                        lib.addBook();
                        break;
                case 4:
                        System.out.println("Thanks for using our program! See you again.");
                        System.exit(0);

            }
        }
    }

}
