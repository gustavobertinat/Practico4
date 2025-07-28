public class Importado extends Articulo {
    private double impuesto;
    private int anioImportacion;

    public Importado(int codigo, String nombre, double precioCosto, double impuesto, int anioImportacion) {
        super(codigo, nombre, precioCosto);
        this.impuesto = impuesto;
        this.anioImportacion = anioImportacion;
    }

    @Override
    public double calcularPrecioVenta() {
        double base = getPrecioVentaInicial();
        if (anioImportacion < 2008) {
            base += impuesto * 0.8; // Suma el 80% del impuesto
        } else {
            base += impuesto; // Suma completo
        }
        return base;
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


