public class Producto {
    private String nombre;
    private double precioBase;
    private int cantidadDisponible;

    public Producto(String nombre, double precioBase, int cantidadDisponible) {
        this.nombre = nombre;
        this.precioBase = precioBase;
        this.cantidadDisponible = cantidadDisponible;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    // Setters
    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }

    @Override
    public String toString() {
        return nombre + " - Precio: " + precioBase + " - Cantidad: " + cantidadDisponible;
    }
}
