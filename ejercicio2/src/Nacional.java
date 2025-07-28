public class Nacional extends Articulo {
    private boolean subsidiado;
    private String ubicacion; // "Interior" o "Montevideo"

    public Nacional(int codigo, String nombre, double precioCosto, boolean subsidiado, String ubicacion) {
        super(codigo, nombre, precioCosto);
        this.subsidiado = subsidiado;
        this.ubicacion = ubicacion;
    }

    @Override
    public double calcularPrecioVenta() {
        double base = getPrecioVentaInicial();
        if (!subsidiado) {
            if (ubicacion.equalsIgnoreCase("Interior")) {
                base *= 1.1; // Se le suma 10%
            } else {
                base *= 1.15; // Se le suma 15%
            }
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


