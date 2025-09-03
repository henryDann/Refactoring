import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Integer> idsProductos = List.of(101, 102);
        List<Integer> cantidades = List.of(2, 3);
        DetallesPedido detalles = new DetallesPedido(idsProductos, cantidades, true, 0.15, true);
        Pedido pedido = new Pedido("Juan Pérez", "Calle Ficticia 123", detalles, "tarjeta");
        ProcesadorPedidos procesador = new ProcesadorPedidos();
        procesador.procesarPedido(pedido);
    }
}
