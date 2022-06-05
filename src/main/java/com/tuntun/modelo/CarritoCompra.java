package com.tuntun.modelo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "carritocompras")
public class CarritoCompra {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idCarrito;
	@Column(name = "subtotal")
	private int subtotal;
	@Column(name = "cantidadProductoCarrito")
	private int cantidadProductoCarrito;
	@Column(name = "detalleProductoCarrito")
	private String detalleProductoCarrito;
	@ManyToOne
	@JoinColumn(name = "idMetodoPagoFk")
	private MetodoPago metodoPago;
	@ManyToOne
	@JoinColumn(name = "idProductoFk")
	private Producto producto;
	@OneToMany(targetEntity = Usuario.class, mappedBy = "carritoCompra")
	private List<Usuario> idUsuarioFk;
	@OneToMany(targetEntity = Factura.class, mappedBy = "carritoCompra")
	private List<Factura> idFacturaFk;
	@OneToMany(targetEntity = CarritoCompra.class, mappedBy = "carritoCompra")
	private List<CarritoCompra> idCarritoCompraFk;

	public int getIdCarrito() {
		return idCarrito;
	}

	public void setIdCarrito(int idCarrito) {
		this.idCarrito = idCarrito;
	}

	public int getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(int subtotal) {
		this.subtotal = subtotal;
	}

	public int getCantidadProductoCarrito() {
		return cantidadProductoCarrito;
	}

	public void setCantidadProductoCarrito(int cantidadProductoCarrito) {
		this.cantidadProductoCarrito = cantidadProductoCarrito;
	}

	public String getDetalleProductoCarrito() {
		return detalleProductoCarrito;
	}

	public void setDetalleProductoCarrito(String detalleProductoCarrito) {
		this.detalleProductoCarrito = detalleProductoCarrito;
	}

	public MetodoPago getMetodoPago() {
		return metodoPago;
	}

	public void setMetodoPago(MetodoPago metodoPago) {
		this.metodoPago = metodoPago;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public List<Usuario> getIdUsuarioFk() {
		return idUsuarioFk;
	}

	public void setIdUsuarioFk(List<Usuario> idUsuarioFk) {
		this.idUsuarioFk = idUsuarioFk;
	}

	public List<Factura> getIdFacturaFk() {
		return idFacturaFk;
	}

	public void setIdFacturaFk(List<Factura> idFacturaFk) {
		this.idFacturaFk = idFacturaFk;
	}

	public List<CarritoCompra> getIdCarritoCompraFk() {
		return idCarritoCompraFk;
	}

	public void setIdCarritoCompraFk(List<CarritoCompra> idCarritoCompraFk) {
		this.idCarritoCompraFk = idCarritoCompraFk;
	}

	@Override
	public String toString() {
		return "CarritoCompra [idCarrito=" + idCarrito + ", subtotal=" + subtotal + ", cantidadProductoCarrito="
				+ cantidadProductoCarrito + ", detalleProductoCarrito=" + detalleProductoCarrito + ", metodoPago="
				+ metodoPago + ", producto=" + producto + ", idUsuarioFk=" + idUsuarioFk + ", idFacturaFk="
				+ idFacturaFk + ", idCarritoCompraFk=" + idCarritoCompraFk + "]";
	}

}
