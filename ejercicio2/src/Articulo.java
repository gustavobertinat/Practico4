public abstract class Articulo {
    protected String nombre;
    protected double precioCosto;

    public Articulo(String nombre, double precioCosto) {
        this.nombre = nombre;
        this.precioCosto = precioCosto;
    }

    public abstract double calcularPrecioVenta();

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio costo: $" + precioCosto);
        System.out.println("Precio venta: $" + calcularPrecioVenta());
    }

    protected double getPrecioVentaInicial() {
        return precioCosto * 1.3;
    }
}


