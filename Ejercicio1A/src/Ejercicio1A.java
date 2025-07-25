 import java.util.Random;

public class Ejercicio1A {
    public static void main(String[] args) {
        Random rand = new Random();
        int a = rand.nextInt(100) + 1; // números del 1 al 100
        int b = rand.nextInt(100);     // números del 0 al 99

        System.out.println("=== EJERCICIO 1A - DIVISIÓN ===");
        System.out.println("Valor de a: " + a);
        System.out.println("Valor de b: " + b);

        if (b != 0) {
            int cociente = a / b;
            int resto = a % b;
            System.out.println("Cociente de " + a + " / " + b + " = " + cociente);
            System.out.println("Resto de " + a + " % " + b + " = " + resto);
        } else {
            System.out.println("Error: No es posible dividir entre cero");
            System.out.println("No es posible resolver el problema.");
        }
    }
}

