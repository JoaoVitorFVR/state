package org.example;

public class EstadoPedidoCancelado extends EstadoPedido {

    private EstadoPedidoCancelado() {}
    private static EstadoPedidoCancelado instance = new EstadoPedidoCancelado();
    public static EstadoPedidoCancelado getInstance() {
        return instance;
    }

    public String getNome() {
        return "Cancelado";
    }
}