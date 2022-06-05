package com.tuntun.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "detallespedidoproducto")
public class DetallePedidoProducto {
	@Column(name = "valorTotal")
	private int valorTotal;
	@Column(name = "cantidadTotal")
	private int cantidadTotal;
	@ManyToOne
	@JoinColumn(name = "idPedidoFk")
	private Pedido pedido;
	@ManyToOne
	@JoinColumn(name = "idProductoFk")
	private Producto producto;

	public int getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(int valorTotal) {
		this.valorTotal = valorTotal;
	}

	public int getCantidadTotal() {
		return cantidadTotal;
	}

	public void setCantidadTotal(int cantidadTotal) {
		this.cantidadTotal = cantidadTotal;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	@Override
	public String toString() {
		return "DetallePedidoProducto [valorTotal=" + valorTotal + ", cantidadTotal=" + cantidadTotal + ", pedido="
				+ pedido + ", producto=" + producto + "]";
	}

}
