package org.example;

public class EstadoPedidoPendente extends EstadoPedido {

    private EstadoPedidoPendente() {}
    private static EstadoPedidoPendente instance = new EstadoPedidoPendente();
    public static EstadoPedidoPendente getInstance() {
        return instance;
    }

    public String getNome() {
        return "Pendente";
    }

    public boolean pagar(Pedido pedido) {
        pedido.setEstado(EstadoPedidoPago.getInstance());
        return true;
    }

    public boolean cancelar(Pedido pedido) {
        pedido.setEstado(EstadoPedidoCancelado.getInstance());
        return true;
    }
}