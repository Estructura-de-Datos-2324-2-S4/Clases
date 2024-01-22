package lista;

public class Main {

    
    public static void main(String[] args) {
        ListaArray lista = new ListaArray(10);
        for (int i = 10; i < 20; i++) {
            lista.insertFinal(i);
        }
        System.out.println("ANTES");
        lista.print();
        System.out.println("DELETE");
        lista.deleteFinal();
        lista.print();
        
        System.out.println("Insert");
        lista.insertFinal(55);
        lista.print();
        /*
        lista.insertInIndex(48, 3);
        System.out.println("DESPUES");
        lista.print();
        
        System.out.println("DELETE");
        lista.deleteBegin();
        lista.deleteFinal();
        lista.deleteInIndex(3);
        lista.print();
        */
    }
    
}
