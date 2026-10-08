package org.example;

public class EstadoPedidoEnviado extends EstadoPedido {

    private EstadoPedidoEnviado() {}
    private static EstadoPedidoEnviado instance = new EstadoPedidoEnviado();
    public static EstadoPedidoEnviado getInstance() {
        return instance;
    }

    public String getNome() {
        return "Enviado";
    }
}