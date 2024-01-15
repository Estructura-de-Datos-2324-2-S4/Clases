package lista;

public class ListaArray implements ILista{
    
    private Integer head;
    private int size, maxSize;
    private NodoArray[] array;

    public ListaArray(int maxSize) {
        this.head = null;
        this.size = 0;
        this.maxSize = maxSize;
        this.array = new NodoArray[0];
    }

    public Integer getHead() {
        return head;
    }

    public void setHead(Integer head) {
        this.head = head;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public NodoArray[] getArray() {
        return array;
    }

    public void setArray(NodoArray[] array) {
        this.array = array;
    }

    @Override
    public void insertBegin(Object element) {
        NodoArray nodo = new NodoArray(element);
        if (getSize() >= getMaxSize()) {
            System.out.println("El maximo ya fue alcanzado");
        } else {
            int position = searchSpace();
            if (position == -1) {
                nodo.setNext(getHead());
                NodoArray[] newArray = copyArray();
                newArray[newArray.length-1] = nodo;
                setHead(newArray.length-1);
                setArray(newArray);
            } else {
                getArray()[position] = nodo;
                setHead(position);
            }
            size++;
        }
    }
    
    public NodoArray[] copyArray() {
        NodoArray[] newArray = new NodoArray[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = getArray()[i];
        }
        return newArray;
    }
    
    public int searchSpace(){
        for (int i = 0; i < getArray().length; i++) {
            if (array[i] == null) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void insertFinal(Object element) {
        NodoArray nodo = new NodoArray(element);
        if (getSize() >= getMaxSize()) {
            System.out.println("El maximo ya fue alcanzado");
        } else {
            if(isEmpty()) {
                int position = searchSpace();
                if (position == -1) {
                    nodo.setNext(getHead());
                    NodoArray[] newArray = copyArray();
                    newArray[newArray.length-1] = nodo;
                    setHead(newArray.length-1);
                    setArray(newArray);
                } else {
                    getArray()[position] = nodo;
                    setHead(position);
                }
            } else {
                int position = searchSpace();
                if (position == -1) {
                    NodoArray[] newArray = copyArray();
                    NodoArray pointer = newArray[getHead()];
                    while (newArray[pointer.getNext()] != null) {
                        pointer = getArray()[pointer.getNext()];
                    }
                    pointer.setNext(newArray.length-1);
                    newArray[newArray.length-1] = nodo;
                    setArray(newArray);
                } else {
                    getArray()[position] = nodo;
                }
            }
            size++;
        }
    }

    @Override
    public void insertInIndex(Object element, int index) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object deleteBegin() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object deleteFinal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object deleteInIndex(int index) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isEmpty() {
        return getHead() == null;
    }
    
    public void print() {
        NodoArray pointer = getArray()[getHead()];
        while (pointer != null) {
            System.out.println("[ "+ pointer.getElement()+ " ]");
            pointer = getArray()[pointer.getNext()];
        }
    }
    
}
