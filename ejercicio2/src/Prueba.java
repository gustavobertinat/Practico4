public class Prueba {
    public static void main(String[] args) {
        Articulo art1 = new Nacional("Yerba", 100, true, "Interior");
        Articulo art2 = new Nacional("Dulce", 100, false, "Montevideo");
        Articulo art3 = new Importado("Chocolate", 150, 50, 2007);
        Articulo art4 = new Importado("Teclado", 200, 60, 2012);

        art1.mostrarDatos();
        art2.mostrarDatos();
        art3.mostrarDatos();
        art4.mostrarDatos();
    }
}

