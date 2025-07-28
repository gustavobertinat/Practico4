public class Prueba {
    public static void main(String[] args) {
        Articulo art1 = new Nacional(1, "Yerba", 100, true, "Interior");
        Articulo art2 = new Nacional(2, "Dulce", 100, false, "Montevideo");
        Articulo art3 = new Importado(3, "Chocolate", 150, 50, 2007);
        Articulo art4 = new Importado(4, "Vino", 200, 60, 2010);

        art1.mostrarDatos();
        art2.mostrarDatos();
        art3.mostrarDatos();
        art4.mostrarDatos();
    }
}
