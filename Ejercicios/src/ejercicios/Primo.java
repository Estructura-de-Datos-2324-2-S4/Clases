package ejercicios;

public class Primo {
    
    private int number;

    public Primo(int number) {
        this.number = number;
    }
    
    public boolean isPrimo() {
        int aux = number -1;
        if (number < 2) {
           return false;  
        }
            
        while (aux > 1) {
            if(number % aux == 0 ){
                return false;
            }   
            aux--;
        }
        return true;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    
    
    
}
