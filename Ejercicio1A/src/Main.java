import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Menú de Ejercicios ===");
        System.out.println("1. Ejercicio 1a: División con validación");
        System.out.println("2. Ejercicio 1b: Suma de 1 a m");
        System.out.println("3. Ejercicio 1c: Números al azar hasta suma de impares > 25");
        System.out.print("Seleccione una opción (1-3): ");

        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                Ejercicio1A.main(null);
                break;
            case 2:
                Ejercicio1B.main(null);
                break;
            case 3:
                Ejercicio1C.main(null);
                break;
            default:
                System.out.println("Opción inválida.");
        }

        sc.close();
    }
}
