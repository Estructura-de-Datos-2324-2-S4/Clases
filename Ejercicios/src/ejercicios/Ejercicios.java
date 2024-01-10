package ejercicios;

import java.util.Scanner;

public class Ejercicios {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Primo primo = new Primo(5);
        System.out.println("Por favor ingrese un numero a validar:");
        primo.setNumber(sc.nextInt());
        if (primo.isPrimo()) {
            System.out.println("El "+primo.getNumber()+" es primo");
        } else {
            System.out.println("El "+primo.getNumber()+"  no es primo");
        }
    }
    
}
