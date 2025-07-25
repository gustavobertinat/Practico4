import java.util.Random;

public class Ejercicio1C {
    public static void main(String[] args) {
        Random rand = new Random();
        int sumaImpares = 0;
        int numero;

        System.out.println("=== EJERCICIO 1C - SECUENCIA ALEATORIA ===");
        System.out.println("Generando secuencia de números aleatorios (0-10):");
        System.out.println("Paramos cuando la suma de impares supere 25\n");

        do {
            numero = rand.nextInt(11); // números del 0 al 10

            if (numero % 2 == 0) {
                System.out.println(numero + " - es par");
            } else {
                System.out.println(numero + " - es impar");
                sumaImpares += numero;
            }

            System.out.println("Suma actual de impares: " + sumaImpares);
            System.out.println("---");

        } while (sumaImpares <= 25);

        System.out.println("¡Procesamiento terminado!");
        System.out.println("La suma final de números impares es: " + sumaImpares);
        System.out.println("(Se detuvo porque superó el valor 25)");
    }
}