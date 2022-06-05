package com.tuntun.modelo;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "pedidos")
public class Pedido {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idPedido;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fechaPedido")
	private Date fechaPedido;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fechaEntrega")
	private Date fechaEntrega;
	@Column(name = "fechaEnvio")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaEnvio;
	@Column(name = "formaEnvio", length = 50)
	private String formaEnvio;
	@Column(name = "destinatarioPedido", length = 45)
	private String destinatarioPedido;
	@Column(name = "direccionDestinatario", length = 20)
	private String direccionDestinatario;
	@OneToMany(targetEntity = DetallePedidoProducto.class, mappedBy = "pedido")
	private List<DetallePedidoProducto> idDetalleFk;
	@OneToMany(targetEntity = Factura.class, mappedBy = "pedido")
	private List<Factura> idFacturaFk;

	public int getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}

	public Date getFechaPedido() {
		return fechaPedido;
	}

	public void setFechaPedido(Date fechaPedido) {
		this.fechaPedido = fechaPedido;
	}

	public Date getFechaEntrega() {
		return fechaEntrega;
	}

	public void setFechaEntrega(Date fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}

	public Date getFechaEnvio() {
		return fechaEnvio;
	}

	public void setFechaEnvio(Date fechaEnvio) {
		this.fechaEnvio = fechaEnvio;
	}

	public String getFormaEnvio() {
		return formaEnvio;
	}

	public void setFormaEnvio(String formaEnvio) {
		this.formaEnvio = formaEnvio;
	}

	public String getDestinatarioPedido() {
		return destinatarioPedido;
	}

	public void setDestinatarioPedido(String destinatarioPedido) {
		this.destinatarioPedido = destinatarioPedido;
	}

	public String getDireccionDestinatario() {
		return direccionDestinatario;
	}

	public void setDireccionDestinatario(String direccionDestinatario) {
		this.direccionDestinatario = direccionDestinatario;
	}

	public List<DetallePedidoProducto> getIdDetalleFk() {
		return idDetalleFk;
	}

	public void setIdDetalleFk(List<DetallePedidoProducto> idDetalleFk) {
		this.idDetalleFk = idDetalleFk;
	}

	public List<Factura> getIdFacturaFk() {
		return idFacturaFk;
	}

	public void setIdFacturaFk(List<Factura> idFacturaFk) {
		this.idFacturaFk = idFacturaFk;
	}

	@Override
	public String toString() {
		return "Pedido [idPedido=" + idPedido + ", fechaPedido=" + fechaPedido + ", fechaEntrega=" + fechaEntrega
				+ ", fechaEnvio=" + fechaEnvio + ", formaEnvio=" + formaEnvio + ", destinatarioPedido="
				+ destinatarioPedido + ", direccionDestinatario=" + direccionDestinatario + ", idDetalleFk="
				+ idDetalleFk + ", idFacturaFk=" + idFacturaFk + "]";
	}

}
