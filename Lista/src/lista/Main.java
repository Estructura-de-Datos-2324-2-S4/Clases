package lista;

public class Main {

    
    public static void main(String[] args) {
        ListaArray lista = new ListaArray(10);
        for (int i = 0; i < 10; i++) {
            lista.insertFinal(i);
        }
        System.out.println("ANTES");
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
