import java.util.Scanner;

public class SistemaGestion {
    private static Inventario inventario = new Inventario();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean salir = false;

        while (!salir) {
            mostrarMenu();
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    registrarProducto();
                    break;
                case 2:
                    registrarVenta();
                    break;
                case 3:
                    inventario.mostrarProductos();
                    break;
                case 4:
                    System.out.println("Predicción de precios aún no implementada.");
                    // Aquí va la llamada a la integración C++
                    break;
                case 5:
                    salir = true;
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }

    private static void mostrarMenu() {
        System.out.println("Sistema de Gestión de Productos");
        System.out.println("1. Registrar producto");
        System.out.println("2. Registrar venta");
        System.out.println("3. Mostrar productos");
        System.out.println("4. Predecir precios");
        System.out.println("5. Salir");
        System.out.print("Elige una opción: ");
    }

    private static void registrarProducto() {
        System.out.print("Nombre del producto: ");
        String nombre = scanner.nextLine();
        System.out.print("Precio base: ");
        double precioBase = scanner.nextDouble();
        System.out.print("Cantidad disponible: ");
        int cantidad = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer

        Producto producto = new Producto(nombre, precioBase, cantidad);
        inventario.registrarProducto(producto);
        System.out.println("Producto registrado.");
    }

    private static void registrarVenta() {
        System.out.print("Nombre del producto: ");
        String nombre = scanner.nextLine();
        System.out.print("Cantidad vendida: ");
        int cantidad = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer

        inventario.registrarVenta(nombre, cantidad);
    }
}
