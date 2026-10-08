package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PedidoTest {


    @Test
    public void naoDevePagarPedidoPendente() {
        Pedido pedido = new Pedido();
        assertTrue(pedido.pagar());
        assertEquals(EstadoPedidoPago.getInstance(), pedido.getEstado());
    }

    @Test
    public void naoDeveEnviarPedidoPendente() {
        Pedido pedido = new Pedido();
        assertFalse(pedido.enviar());
        assertEquals(EstadoPedidoPendente.getInstance(), pedido.getEstado());
    }

    @Test
    public void deveCancelarPedidoPendente() {
        Pedido pedido = new Pedido();
        assertTrue(pedido.cancelar());
        assertEquals(EstadoPedidoCancelado.getInstance(), pedido.getEstado());
    }


    @Test
    public void naoDevePagarPedidoPago() {
        Pedido pedido = new Pedido();
        pedido.setEstado(EstadoPedidoPago.getInstance());
        assertFalse(pedido.pagar());
    }

    @Test
    public void deveEnviarPedidoPago() {
        Pedido pedido = new Pedido();
        pedido.setEstado(EstadoPedidoPago.getInstance());
        assertTrue(pedido.enviar());
        assertEquals(EstadoPedidoEnviado.getInstance(), pedido.getEstado());
    }

    @Test
    public void deveCancelarPedidoPago() {
        Pedido pedido = new Pedido();
        pedido.setEstado(EstadoPedidoPago.getInstance());
        assertTrue(pedido.cancelar());
        assertEquals(EstadoPedidoCancelado.getInstance(), pedido.getEstado());
    }


    @Test
    public void naoDevePagarPedidoEnviado() {
        Pedido pedido = new Pedido();
        pedido.setEstado(EstadoPedidoEnviado.getInstance());
        assertFalse(pedido.pagar());
    }

    @Test
    public void naoDeveEnviarPedidoEnviado() {
        Pedido pedido = new Pedido();
        pedido.setEstado(EstadoPedidoEnviado.getInstance());
        assertFalse(pedido.enviar());
    }

    @Test
    public void naoDeveCancelarPedidoEnviado() {
        Pedido pedido = new Pedido();
        pedido.setEstado(EstadoPedidoEnviado.getInstance());
        assertFalse(pedido.cancelar());
    }


    @Test
    public void naoDevePagarPedidoCancelado() {
        Pedido pedido = new Pedido();
        pedido.setEstado(EstadoPedidoCancelado.getInstance());
        assertFalse(pedido.pagar());
    }

    @Test
    public void naoDeveEnviarPedidoCancelado() {
        Pedido pedido = new Pedido();
        pedido.setEstado(EstadoPedidoCancelado.getInstance());
        assertFalse(pedido.enviar());
    }

    @Test
    public void naoDeveCancelarPedidoCancelado() {
        Pedido pedido = new Pedido();
        pedido.setEstado(EstadoPedidoCancelado.getInstance());
        assertFalse(pedido.cancelar());
    }
}