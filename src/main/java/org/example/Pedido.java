package org.example;

public class Pedido {

    private String codigo;
    private EstadoPedido estado;

    public Pedido() {
        this.estado = EstadoPedidoPendente.getInstance();
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public EstadoPedido getEstado() {
        return estado;
    }

    public void setEstado(EstadoPedido estado) {
        this.estado = estado;
    }

    public boolean pagar() {
        return this.estado.pagar(this);
    }

    public boolean enviar() {
        return this.estado.enviar(this);
    }

    public boolean cancelar() {
        return this.estado.cancelar(this);
    }
}