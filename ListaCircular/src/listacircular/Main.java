/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listacircular;

/**
 *
 * @author Estudiante
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaCircular lista = new ListaCircular();
        for (int i = 0; i < 10; i++) {
            lista.insertFinal(i);
        }
        
        System.out.println("ANTES");
        lista.print();
        
      
        System.out.println("DELETE");
        lista.deleteFinal();
        lista.print();
        /*
        System.out.println("Insert");
        lista.insertFinal(55);
        lista.print();*/
    }
    
}
