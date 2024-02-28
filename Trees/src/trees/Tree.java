package trees;

public class Tree {
    private Nodo root;
    private int keyCounter;
    
    public Tree() {
        this.root = null;
        this.keyCounter = 0;
    }

    public Nodo getRoot() {
        return root;
    }

    public void setRoot(Nodo root) {
        this.root = root;
    }

    public int getKeyCounter() {
        return keyCounter;
    }

    public void setKeyCounter(int keyCounter) {
        this.keyCounter = keyCounter;
    }
    
    public void insert(Object element, int fatherKey, Nodo pointer){
        Nodo nodo = new Nodo(keyCounter, element);
        if (isEmpty()) {
            setRoot(nodo);
        } else {
            if (pointer.getKey() == fatherKey) {
                increaseSons(pointer, nodo);
            } else {
                for (int i = 0; i < pointer.getSons().length; i++) {
                    insert(element, fatherKey, pointer.getSons()[i]);
                }
            }
        }
        keyCounter++;
    }
    
    public int getKey(Object element,Nodo pointer) {
        if (pointer.getElement().equals(element) ) {
                return pointer.getKey();
            } else {
                for (int i = 0; i < pointer.getSons().length; i++) {
                    return getKey(element, pointer.getSons()[i]);
                }
            }
        return -1;
    }
    
    public void increaseSons(Nodo father, Nodo nodo) {
        Nodo[] newSons = new Nodo[father.getSons().length + 1];
        for (int i = 0; i < father.getSons().length; i++) {
            newSons[i] = father.getSons()[i];
        }
        newSons[newSons.length -1] = nodo;
        father.setSons(newSons);
    }
    
    public void preOrden(Nodo root) {
        if (isEmpty()) {
            System.out.println("El arbol esta vacio");
        } else {
            System.out.println("["+root.getElement()+"]");
            for (int i = 0; i < root.getSons().length; i++) {
                preOrden(root.getSons()[i]);
            }
        }
    }
    
    
    
    public boolean isEmpty() {
        return root == null;
    }
    
}
