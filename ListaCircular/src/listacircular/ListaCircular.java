package listacircular;

public class ListaCircular implements ILista{
    private Nodo head;
    private int size;

    public ListaCircular() {
        this.head = null;
        this.size = 0;
    }

    public Nodo getHead() {
        return head;
    }

    public void setHead(Nodo head) {
        this.head = head;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    public void insertBegin(Object element) {
        Nodo nodo = new Nodo(element);
        if (isEmpty()) {
            nodo.setNext(nodo);
            setHead(nodo);
        } else {
            Nodo pointer = getHead();
            while (pointer.getNext() != getHead()){
                pointer = pointer.getNext();
           }           
            nodo.setNext(getHead());
            setHead(nodo);
            pointer.setNext(getHead());
        }
        size++;
    }
    
    public void insertFinal(Object element) {
        Nodo nodo = new Nodo(element);
        if (isEmpty()) {
            nodo.setNext(nodo);
            setHead(nodo);
        } else {
           Nodo pointer = getHead();
           while (pointer.getNext() != getHead()) {
               pointer = pointer.getNext();
           }
           pointer.setNext(nodo);
           nodo.setNext(getHead());
        }
        size++;
    }
    
    public void insertInIndex(Object element, int index) {
        Nodo nodo = new Nodo(element);
        if (isEmpty()) {
            setHead(nodo);
        } else {
            if (index < 0) {
                System.out.println("Index Error");
            } else if (index > size) {
                System.out.println("Index Error");
            } else if (index == size) {
                insertFinal(element);
            } else if (index == 0) {
                insertBegin(element);
            } else {
                Nodo pointer = getHead();
                int aux = 0; 
                while (pointer.getNext() != null && aux < index - 1) {
                    pointer = pointer.getNext();
                    aux++;
                }
                nodo.setNext(pointer.getNext());
                pointer.setNext(nodo); 
            }
        }
        size++;
    }
    
    public Object deleteBegin(){
        if (isEmpty()) {
            System.out.println("La lista esta vacia");
        } else {
            Nodo pointer = getHead();
            Nodo pointer2 = getHead();
            if (getSize() == 1) {
                getHead().setNext(null);
                setHead(null);
            } else {
                while (pointer.getNext() != getHead()){
                    pointer = pointer.getNext();
                }
                pointer.setNext(pointer2.getNext());
                setHead(pointer2.getNext());
                pointer2.setNext(null);
            }
            size--;
            return pointer.getElement();
        }
        return null;
    }
    
    public Object deleteFinal(){
        if (isEmpty()) {
            System.out.println("La lista esta vacia");
        } else {
            Nodo pointer = getHead();
            if (getSize() == 1) {
                getHead().setNext(null);
                setHead(null);
            } else {
                while (pointer.getNext().getNext() != getHead()) {
                    pointer = pointer.getNext();
                }
                pointer.getNext().setNext(null);
                pointer.setNext(getHead());
            }
            size--;
            return pointer.getElement();
        }
        return null;
    }
    
    public Object deleteInIndex(int index) {
        if (isEmpty()) {
            System.out.println("La lista esta vacia");
        } else {
            if (index < 0) {
                System.out.println("Index Error");
            } else if (index >= size) {
                System.out.println("Index Error");
            } else if (index == 0) {
                return deleteBegin();
            } else if (index == size-1) {
                return deleteFinal();
            } else {
                Nodo pointer = getHead();
                int aux = 0; 
                while (pointer.getNext() != null && aux < index - 1) {
                    pointer = pointer.getNext();
                    aux++;
                }
                Nodo pointer2 = pointer.getNext();
                pointer.setNext(pointer2.getNext());
                pointer2.setNext(null);
                size--;
                return pointer.getElement();
            }
        }
        return null;
    }
    
    public void print() {
        Nodo pointer = getHead();
        boolean isFirstTime = true;
        if (isEmpty()) {
            System.out.println("La lista esta vacia");
        } else {
            while (isFirstTime || pointer != getHead()) {
            isFirstTime = false;
            System.out.println("[ "+pointer.getElement() + " ]");
            pointer = pointer.getNext();
        }
        }
        
    }
    
    public boolean isEmpty() {
        return getHead() == null;
    }
}
