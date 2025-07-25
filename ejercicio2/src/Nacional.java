public class Nacional extends Articulo {
    private boolean subsidiado;
    private String ubicacion; // "Interior" o "Montevideo"

    public Nacional(String nombre, double precioCosto, boolean subsidiado, String ubicacion) {
        super(nombre, precioCosto);
        this.subsidiado = subsidiado;
        this.ubicacion = ubicacion;
    }

    @Override
    public double calcularPrecioVenta() {
        double base = getPrecioVentaInicial();
        if (!subsidiado) {
            base *= 1.1;
        }
        if (ubicacion.equalsIgnoreCase("Interior")) {
            base *= 0.95;
        }
        return base;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("=== Artículo Nacional ===");
        super.mostrarDatos();
        System.out.println("Subsidiado: " + (subsidiado ? "Sí" : "No"));
        System.out.println("Ubicación: " + ubicacion);
        System.out.println("=========================");
    }
}

