package com.tuntun.modelo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "devoluciones")
public class Devolucion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idDevolucion;
	@Column(name = "descripcionDevolucion")
	private String descripcionDevolucion;
	@Column(name = "fechaDevolucion")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaDevolucion;
	@ManyToOne
	@JoinColumn(name = "idFacturaFk")
	private Factura factura;

	public int getIdDevolucion() {
		return idDevolucion;
	}

	public void setIdDevolucion(int idDevolucion) {
		this.idDevolucion = idDevolucion;
	}

	public String getDescripcionDevolucion() {
		return descripcionDevolucion;
	}

	public void setDescripcionDevolucion(String descripcionDevolucion) {
		this.descripcionDevolucion = descripcionDevolucion;
	}

	public Date getFechaDevolucion() {
		return fechaDevolucion;
	}

	public void setFechaDevolucion(Date fechaDevolucion) {
		this.fechaDevolucion = fechaDevolucion;
	}

	public Factura getFactura() {
		return factura;
	}

	public void setFactura(Factura factura) {
		this.factura = factura;
	}

	@Override
	public String toString() {
		return "Devolucion [idDevolucion=" + idDevolucion + ", descripcionDevolucion=" + descripcionDevolucion
				+ ", fechaDevolucion=" + fechaDevolucion + ", factura=" + factura + "]";
	}

}
