/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trees;

/**
 *
 * @author Estudiante
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert(2, -1, null);
        tree.insert(3, tree.getRoot().getKey(), tree.getRoot());
        tree.insert(4, tree.getRoot().getKey(), tree.getRoot());
        tree.insert(5, tree.getRoot().getKey(), tree.getRoot());
        tree.insert(8, tree.getKey(3, tree.getRoot()), tree.getRoot());
        tree.insert(7, tree.getKey(3, tree.getRoot()), tree.getRoot());
        
        tree.preOrden(tree.getRoot());
        
    }
    
}
