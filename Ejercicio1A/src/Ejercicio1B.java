import java.util.Random;

public class Ejercicio1B {
    public static void main(String[] args) {
        Random rand = new Random();
        int m = rand.nextInt(20) + 1; // números del 1 al 20

        System.out.println("=== EJERCICIO 1B - SUMA DE ENTEROS ===");
        System.out.println("Valor de m generado: " + m);

        int suma = 0;
        for (int i = 1; i <= m; i++) {
            suma += i;
        }

        System.out.println("La suma de todos los enteros desde 1 hasta " + m + " es: " + suma);

        // Verificación usando la fórmula matemática: suma = m * (m + 1) / 2
        int sumaFormula = m * (m + 1) / 2;
        System.out.println("Verificación con fórmula matemática: " + sumaFormula);
    }
}
