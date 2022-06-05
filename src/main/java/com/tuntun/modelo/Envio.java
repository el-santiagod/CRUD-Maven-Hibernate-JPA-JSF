package com.tuntun.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "envios")
public class Envio {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idEnvio;
	@Column(name = "nombreLogisticaEnvio", length = 50)
	private String nombreLogisticaEnvio;
	@Column(name = "descEnvio")
	private String descEnvio;
	@ManyToOne
	@JoinColumn(name = "idUsuarioFk")
	private Usuario usuario;
	@ManyToOne
	@JoinColumn(name = "idFacturaFk")
	private Factura factura;
	@ManyToOne
	@JoinColumn(name = "idCompaniaEnvioFk")
	private CompaniaEnvio companiaEnvio;

	public int getIdEnvio() {
		return idEnvio;
	}

	public void setIdEnvio(int idEnvio) {
		this.idEnvio = idEnvio;
	}

	public String getNombreLogisticaEnvio() {
		return nombreLogisticaEnvio;
	}

	public void setNombreLogisticaEnvio(String nombreLogisticaEnvio) {
		this.nombreLogisticaEnvio = nombreLogisticaEnvio;
	}

	public String getDescEnvio() {
		return descEnvio;
	}

	public void setDescEnvio(String descEnvio) {
		this.descEnvio = descEnvio;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Factura getFactura() {
		return factura;
	}

	public void setFactura(Factura factura) {
		this.factura = factura;
	}

	public CompaniaEnvio getCompaniaEnvio() {
		return companiaEnvio;
	}

	public void setCompaniaEnvio(CompaniaEnvio companiaEnvio) {
		this.companiaEnvio = companiaEnvio;
	}

	@Override
	public String toString() {
		return "Envio [idEnvio=" + idEnvio + ", nombreLogisticaEnvio=" + nombreLogisticaEnvio + ", descEnvio="
				+ descEnvio + ", usuario=" + usuario + ", factura=" + factura + ", companiaEnvio=" + companiaEnvio
				+ "]";
	}

}
