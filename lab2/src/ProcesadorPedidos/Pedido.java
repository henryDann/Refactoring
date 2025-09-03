import java.util.List;

public class Pedido {
    private String nombreCliente;
    private String direccionCliente;
    private DetallesPedido detallesPedido;
    private String metodoPago;

    public Pedido(String nombreCliente, String direccionCliente, DetallesPedido detallesPedido, String metodoPago) {
        this.nombreCliente = nombreCliente;
        this.direccionCliente = direccionCliente;
        this.detallesPedido = detallesPedido;
        this.metodoPago = metodoPago;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public String getDireccionCliente() {
        return direccionCliente;
    }

    public DetallesPedido getDetallesPedido() {
        return detallesPedido;
    }

    public String getMetodoPago() {
        return metodoPago;
    }
}
