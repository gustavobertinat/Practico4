public abstract class Articulo {
    protected int codigo;
    protected String nombre;
    protected double precioCosto;

    public Articulo(int codigo, String nombre, double precioCosto) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precioCosto = precioCosto;
    }

    public abstract double calcularPrecioVenta();

    public void mostrarDatos() {
        System.out.println("Código: " + codigo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio costo: $" + precioCosto);
        System.out.println("Precio venta: $" + calcularPrecioVenta());
    }

    protected double getPrecioVentaInicial() {
        return precioCosto * 1.2; // Se suma un 20%
    }
}



