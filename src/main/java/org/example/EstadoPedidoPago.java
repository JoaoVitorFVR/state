package org.example;

public class EstadoPedidoPago extends EstadoPedido {

    private EstadoPedidoPago() {}
    private static EstadoPedidoPago instance = new EstadoPedidoPago();
    public static EstadoPedidoPago getInstance() {
        return instance;
    }

    public String getNome() {
        return "Pago";
    }

    public boolean enviar(Pedido pedido) {
        pedido.setEstado(EstadoPedidoEnviado.getInstance());
        return true;
    }

    public boolean cancelar(Pedido pedido) {
        pedido.setEstado(EstadoPedidoCancelado.getInstance());
        return true;
    }
}