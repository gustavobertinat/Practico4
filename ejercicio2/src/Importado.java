public class Importado extends Articulo {
    private double impuesto;
    private int anioImportacion;

    public Importado(String nombre, double precioCosto, double impuesto, int anioImportacion) {
        super(nombre, precioCosto);
        this.impuesto = impuesto;
        this.anioImportacion = anioImportacion;
    }

    @Override
    public double calcularPrecioVenta() {
        return getPrecioVentaInicial() + impuesto;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("=== Artículo Importado ===");
        super.mostrarDatos();
        System.out.println("Impuesto: $" + impuesto);
        System.out.println("Año de importación: " + anioImportacion);
        System.out.println("==========================");
    }
}



