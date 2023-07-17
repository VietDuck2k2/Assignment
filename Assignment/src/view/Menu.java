/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.Library;
import controller.Validator;

/**
 *
 * @author MoonWolf
 */
public abstract class Menu {
    private String menuName;
    private String[] options;
    private Validator vl;
    private Library lib;

    public Library getLib() {
        return lib;
    }

    public Menu(String menuName, String[] options, Library lib) {
        this.menuName = menuName;
        this.options = options;
        vl = new Validator();
        this.lib = lib;
    }

    public int displayMenu() {
        System.out.println(menuName);
        System.out.println("------------------------------");
        for (int i = 0; i < options.length; i++) {
            System.out.println((i+1) + "." + options[i]);
        }
        System.out.println("------------------------------"); 
        return vl.inputInt("Enter selection...", 1, 4);
    }

    public abstract void execute();
}
