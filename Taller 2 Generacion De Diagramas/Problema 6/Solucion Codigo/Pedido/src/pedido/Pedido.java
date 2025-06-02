package pedido;

import java.util.HashMap;
import java.util.Map;

public class Pedido {
    private Map<String, ItemPedido> productosSolicitados;
    private double totalPedido;
    private String direccionEnvio;

    public Pedido(String direccionEnvio) {
        this.productosSolicitados = new HashMap<>();
        this.totalPedido = 0.0;
        this.direccionEnvio = direccionEnvio;
    }

    private static class ItemPedido {
        public String nombreProducto;
        public int cantidad;
        public double precioUnitario;

        public ItemPedido(String nombreProducto, int cantidad, double precioUnitario) {
            this.nombreProducto = nombreProducto;
            this.cantidad = cantidad;
            this.precioUnitario = precioUnitario;
        }
    }

    public void agregarProducto(String nombreProducto, int cantidad, double precioUnitario) {
        if (cantidad <= 0) return;

        if (productosSolicitados.containsKey(nombreProducto)) {
            ItemPedido item = productosSolicitados.get(nombreProducto);
            item.cantidad += cantidad;
        } else {
            productosSolicitados.put(nombreProducto, new ItemPedido(nombreProducto, cantidad, precioUnitario));
        }

        calcularTotalPedido();
    }

    public void actualizarCantidadProducto(String nombreProducto, int nuevaCantidad) {
        if (!productosSolicitados.containsKey(nombreProducto)) return;

        if (nuevaCantidad <= 0) {
            eliminarProducto(nombreProducto);
            return;
        }

        ItemPedido item = productosSolicitados.get(nombreProducto);
        item.cantidad = nuevaCantidad;
        calcularTotalPedido();
    }

    public void eliminarProducto(String nombreProducto) {
        if (productosSolicitados.containsKey(nombreProducto)) {
            productosSolicitados.remove(nombreProducto);
            calcularTotalPedido();
        }
    }

    private void calcularTotalPedido() {
        this.totalPedido = 0.0;
        for (ItemPedido item : productosSolicitados.values()) {
            this.totalPedido += item.cantidad * item.precioUnitario;
        }
    }

    public void mostrarInformacionPedido() {
        System.out.println("\n--- Detalle del Pedido ---");
        if (productosSolicitados.isEmpty()) {
            System.out.println("Pedido vacío.");
        } else {
            System.out.println("Productos Solicitados:");
            for (ItemPedido item : productosSolicitados.values()) {
                System.out.printf("  - %s (x%d) @ $%.2f cada uno = $%.2f\n",
                                  item.nombreProducto, item.cantidad, item.precioUnitario,
                                  item.cantidad * item.precioUnitario);
            }
        }
        System.out.printf("Total del Pedido: $%.2f\n", totalPedido);
        System.out.println("Dirección de Envío: " + direccionEnvio);
        System.out.println("--------------------------");
    }

    public static void main(String[] args) {
        Pedido pedido1 = new Pedido("Calle Falsa 123, Loja");

        System.out.println("--- Realizando Pedido 1 ---");
        pedido1.agregarProducto("Laptop Gaming", 1, 1200.00);
        pedido1.agregarProducto("Teclado Mecánico", 1, 80.00);
        pedido1.agregarProducto("Ratón Gaming", 2, 35.00);

        pedido1.mostrarInformacionPedido();

        System.out.println("\n--- Modificando Pedido 1 ---");
        pedido1.actualizarCantidadProducto("Laptop Gaming", 0);
        pedido1.actualizarCantidadProducto("Teclado Mecánico", 2);

        pedido1.mostrarInformacionPedido();

        System.out.println("\n--- Eliminando Producto de Pedido 1 ---");
        pedido1.eliminarProducto("Ratón Gaming");

        pedido1.mostrarInformacionPedido();

        System.out.println("\n--- Creando Pedido 2 ---");
        Pedido pedido2 = new Pedido("Av. Cívica s/n, Loja");
        pedido2.agregarProducto("Café (paquete)", 3, 5.50);
        pedido2.agregarProducto("Leche (litro)", 6, 1.20);
        pedido2.mostrarInformacionPedido();
    }
}
