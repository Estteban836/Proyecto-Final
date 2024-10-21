import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private List<Producto> productos;

    public Inventario() {
        productos = new ArrayList<>();
    }

    // Agregar producto
    public void registrarProducto(Producto producto) {
        productos.add(producto);
    }

    // Registrar venta
    public void registrarVenta(String nombreProducto, int cantidad) {
        for (Producto producto : productos) {
            if (producto.getNombre().equalsIgnoreCase(nombreProducto)) {
                if (producto.getCantidadDisponible() >= cantidad) {
                    producto.setCantidadDisponible(producto.getCantidadDisponible() - cantidad);
                    System.out.println("Venta registrada.");
                } else {
                    System.out.println("No hay suficiente cantidad disponible.");
                }
                return;
            }
        }
        System.out.println("Producto no encontrado.");
    }

    // Mostrar lista de productos
    public void mostrarProductos() {
        if (productos.isEmpty()) {
            System.out.println("No hay productos registrados.");
        } else {
            for (Producto producto : productos) {
                System.out.println(producto);
            }
        }
    }
}
