/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompanycom.mycompany.computerprogram2;

import Controller.Controller;
import view.MenuView;

/**
 *
 * @author tung
 */
public class ComputerProgram {

  
    public static void main(String[] args) {
         Controller controller = new Controller();
        MenuView menuView = new MenuView(controller);
        menuView.run();
    }
    
}
