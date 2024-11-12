import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private Cliente cliente;
    private List<ItemPedido> productos;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.productos = new ArrayList<>();
    }

    // Método para agregar productos al pedido
    public void agregarProducto(Producta producto, int cantidad) {
        productos.add(new ItemPedido(producto, cantidad));
    }

    // Método para calcular el total del pedido
    public double calcularTotal() {
        double total = 0;
        for (ItemPedido item : productos) {
            total += item.getProducto().getPrecio() * item.getCantidad();
        }
        return total;
    }

    // Método para procesar la compra y actualizar el inventario
    public void procesarCompra() throws Exception {
        for (ItemPedido item : productos) {
            item.getProducto().actualizarInventario(item.getCantidad());
        }
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<ItemPedido> getProductos() {
        return productos;
    }
}
