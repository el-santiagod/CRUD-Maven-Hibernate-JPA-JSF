package com.tuntun.modelo;

import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "facturas")
public class Factura {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idFactura;
	@Column(name = "nombreFactura", length = 50)
	private String nombreFactura;
	@Column(name = "fechaFactura")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaFactura;
	@Column(name = "descripcionFactura")
	private String descripcionFactura;
	@Column(name = "valorFactura")
	private int valorFactura;
	@Column(name = "ivaFactura")
	private double ivaFactura;
	@ManyToOne
	@JoinColumn(name = "idCarritoFk")
	private CarritoCompra carritoCompra;
	@ManyToOne
	@JoinColumn(name = "idMetodoPagoFk")
	private MetodoPago metodoPago;
	@ManyToOne
	@JoinColumn(name = "idCarritoFk")
	private Pedido pedido;
	@OneToMany(targetEntity = Devolucion.class, mappedBy = "factura")
	private List<Devolucion> idDevolucionFk;
	@OneToMany(targetEntity = Envio.class, mappedBy = "factura")
	private List<Envio> idEnvioFk;

	public int getIdFactura() {
		return idFactura;
	}

	public void setIdFactura(int idFactura) {
		this.idFactura = idFactura;
	}

	public String getNombreFactura() {
		return nombreFactura;
	}

	public void setNombreFactura(String nombreFactura) {
		this.nombreFactura = nombreFactura;
	}

	public Date getFechaFactura() {
		return fechaFactura;
	}

	public void setFechaFactura(Date fechaFactura) {
		this.fechaFactura = fechaFactura;
	}

	public String getDescripcionFactura() {
		return descripcionFactura;
	}

	public void setDescripcionFactura(String descripcionFactura) {
		this.descripcionFactura = descripcionFactura;
	}

	public int getValorFactura() {
		return valorFactura;
	}

	public void setValorFactura(int valorFactura) {
		this.valorFactura = valorFactura;
	}

	public double getIvaFactura() {
		return ivaFactura;
	}

	public void setIvaFactura(double ivaFactura) {
		this.ivaFactura = ivaFactura;
	}

	public CarritoCompra getCarritoCompra() {
		return carritoCompra;
	}

	public void setCarritoCompra(CarritoCompra carritoCompra) {
		this.carritoCompra = carritoCompra;
	}

	public MetodoPago getMetodoPago() {
		return metodoPago;
	}

	public void setMetodoPago(MetodoPago metodoPago) {
		this.metodoPago = metodoPago;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public List<Devolucion> getIdDevolucionFk() {
		return idDevolucionFk;
	}

	public void setIdDevolucionFk(List<Devolucion> idDevolucionFk) {
		this.idDevolucionFk = idDevolucionFk;
	}

	public List<Envio> getIdEnvioFk() {
		return idEnvioFk;
	}

	public void setIdEnvioFk(List<Envio> idEnvioFk) {
		this.idEnvioFk = idEnvioFk;
	}

	@Override
	public String toString() {
		return "Factura [idFactura=" + idFactura + ", nombreFactura=" + nombreFactura + ", fechaFactura=" + fechaFactura
				+ ", descripcionFactura=" + descripcionFactura + ", valorFactura=" + valorFactura + ", ivaFactura="
				+ ivaFactura + ", carritoCompra=" + carritoCompra + ", metodoPago=" + metodoPago + ", pedido=" + pedido
				+ ", idDevolucionFk=" + idDevolucionFk + ", idEnvioFk=" + idEnvioFk + "]";
	}

}
