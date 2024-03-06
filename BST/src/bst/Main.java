/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bst;

/**
 *
 * @author Estudiante
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BST bst = new BST();
        bst.insert(100, bst.getRoot());
        bst.insert(80, bst.getRoot());
        bst.insert(200, bst.getRoot());
        bst.insert(50, bst.getRoot());
        bst.insert(90, bst.getRoot());
        bst.insert(150, bst.getRoot());
        bst.insert(250, bst.getRoot());
        bst.insert(40, bst.getRoot());
        bst.insert(70, bst.getRoot());
        bst.insert(85, bst.getRoot());
        bst.insert(95, bst.getRoot());
        bst.insert(120, bst.getRoot());
        bst.insert(180, bst.getRoot());
        bst.insert(210, bst.getRoot());
        bst.insert(280, bst.getRoot());
        System.out.println("ANTES");
        bst.preOrden(bst.getRoot());
        System.out.println("DESPUES");
        bst.deleteNodo(80, bst.getRoot(), null);
        bst.preOrden(bst.getRoot());
    }
    
    
}
