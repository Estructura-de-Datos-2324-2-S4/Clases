/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

/**
 *
 * @author Estudiante
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        QueueArray queue = new QueueArray(10);
        for (int i = 0; i < 10; i++) {
            queue.insertFinal(i);
        }
        queue.print();
    }
    
}
