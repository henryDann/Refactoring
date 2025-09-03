import java.util.List;

public class DetallesPedido {
    private List<Integer> idsProductos;
    private List<Integer> cantidades;
    private boolean descuento;
    private double porcentajeDescuento;
    private boolean envioExpress;

    public DetallesPedido(List<Integer> idsProductos, List<Integer> cantidades,
                          boolean descuento, double porcentajeDescuento, boolean envioExpress) {
        this.idsProductos = idsProductos;
        this.cantidades = cantidades;
        this.descuento = descuento;
        this.porcentajeDescuento = porcentajeDescuento;
        this.envioExpress = envioExpress;
    }

    public List<Integer> getIdsProductos() {
        return idsProductos;
    }

    public List<Integer> getCantidades() {
        return cantidades;
    }

    public boolean tieneDescuento() {
        return descuento;
    }

    public double getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public boolean esEnvioExpress() {
        return envioExpress;
    }
}
