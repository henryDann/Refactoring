import java.util.List;

public class ProcesadorPedidos {
    private static final double ENVIO_EXPRESS_COSTO = 10.0;

    public void procesarPedido(Pedido pedido) {
        double total = calcularTotalPedido(pedido.getDetallesPedido());

        if (pedido.getDetallesPedido().esEnvioExpress()) {
            total += ENVIO_EXPRESS_COSTO;
        }

        procesarMetodoPago(pedido);
        enviarConfirmacionEmail(pedido);
        actualizarInventario(pedido.getDetallesPedido());
    }

    private double calcularTotalPedido(DetallesPedido detalles) {
        double total = 0;
        for (int i = 0; i < detalles.getIdsProductos().size(); i++) {
            total += calcularPrecioProducto(detalles.getIdsProductos().get(i), detalles.getCantidades().get(i));
        }

        if (detalles.tieneDescuento()) {
            total -= total * detalles.getPorcentajeDescuento();
        }

        return total;
    }

    private double calcularPrecioProducto(int idProducto, int cantidad) {
        double precioUnitario = obtenerPrecioProducto(idProducto);
        return precioUnitario * cantidad;
    }

    private double obtenerPrecioProducto(int idProducto) {
        // Simulamos obtener el precio desde una base de datos o API
        return idProducto * 10.0;
    }

    private void procesarMetodoPago(Pedido pedido) {
        switch (pedido.getMetodoPago()) {
            case "tarjeta":
                System.out.println("Procesando pago con tarjeta...");
                break;
            case "paypal":
                System.out.println("Procesando pago con PayPal...");
                break;
            default:
                throw new IllegalArgumentException("Método de pago no soportado: " + pedido.getMetodoPago());
        }
    }

    private void enviarConfirmacionEmail(Pedido pedido) {
        System.out.println("Enviando confirmación por email a: " + pedido.getNombreCliente());
        System.out.println("Dirección de envío: " + pedido.getDireccionCliente());
    }

    private void actualizarInventario(DetallesPedido detalles) {
        for (int i = 0; i < detalles.getIdsProductos().size(); i++) {
            System.out.println("Actualizando inventario: Producto " + detalles.getIdsProductos().get(i) +
                              ", reducido en " + detalles.getCantidades().get(i) + " unidades");
        }
    }
}
