package stack;

public class Stack {
    private Nodo peak;
    private int size;

    public Stack() {
        this.peak = null;
        this.size = 0;
    }

    public Nodo getPeak() {
        return peak;
    }

    public void setPeak(Nodo peak) {
        this.peak = peak;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    public Nodo push(Object element) {
        Nodo nodo = new Nodo(element);
        if (isEmpty()) {
            setPeak(nodo);
        } else {
           nodo.setNext(getPeak());
           setPeak(nodo);
        }
        size++;
        return nodo;
    }
    
    public Nodo pop(){
        if (isEmpty()) {
            System.out.println("La lista esta vacia");
        } else {
            Nodo pointer = getPeak();
            setPeak(pointer.getNext());
            pointer.setNext(null);
            size--;
            return pointer;
        }
        return null;
    }
    
    
    public void print() {
        Nodo pointer = getPeak();
        while (pointer != null) {
            System.out.println("[ "+pointer.getElement() + " ]");
            pointer = pointer.getNext();
        }
    }
    
    public Nodo reverse(Nodo nodo){
        pop();
        if (nodo.getNext() == null) {
            return nodo;
        }
        return reverse(push(nodo.getNext()));
    }
    
    public boolean isEmpty() {
        return getPeak()== null;
    }
}
