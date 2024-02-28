package trees;

public class Nodo {
    private int key;
    private Object element;
    private Nodo[] sons;

    public Nodo(int key, Object element) {
        this.key = key;
        this.element = element;
        this.sons = new Nodo[0];
    }
    
    public boolean isLeaf() {
        return this.sons.length == 0;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public Object getElement() {
        return element;
    }

    public void setElement(Object element) {
        this.element = element;
    }

    public Nodo[] getSons() {
        return sons;
    }

    public void setSons(Nodo[] sons) {
        this.sons = sons;
    }
    
    
}
