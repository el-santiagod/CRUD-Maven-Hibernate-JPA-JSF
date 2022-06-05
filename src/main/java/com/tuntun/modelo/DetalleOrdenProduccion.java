package com.tuntun.modelo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "detallesordenproduccion")
public class DetalleOrdenProduccion {
	@Column(name = "descMaterial")
	private String descMaterial;
	@Column(name = "ubicacion", length = 100)
	private String ubicacion;
	@Column(name = "fechaDetalle")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaDetalle;
	@ManyToOne
	@JoinColumn(name = "idOrdenProduccionFk")
	private OrdenProduccion ordenProduccion;
	@ManyToOne
	@JoinColumn(name = "idMateriaPrimaFk")
	private MateriaPrima materiaPrima;

	public String getDescMaterial() {
		return descMaterial;
	}

	public void setDescMaterial(String descMaterial) {
		this.descMaterial = descMaterial;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public Date getFechaDetalle() {
		return fechaDetalle;
	}

	public void setFechaDetalle(Date fechaDetalle) {
		this.fechaDetalle = fechaDetalle;
	}

	public OrdenProduccion getOrdenProduccion() {
		return ordenProduccion;
	}

	public void setOrdenProduccion(OrdenProduccion ordenProduccion) {
		this.ordenProduccion = ordenProduccion;
	}

	public MateriaPrima getMateriaPrima() {
		return materiaPrima;
	}

	public void setMateriaPrima(MateriaPrima materiaPrima) {
		this.materiaPrima = materiaPrima;
	}

	@Override
	public String toString() {
		return "DetalleOrdenProduccion [descMaterial=" + descMaterial + ", ubicacion=" + ubicacion + ", fechaDetalle="
				+ fechaDetalle + ", ordenProduccion=" + ordenProduccion + ", materiaPrima=" + materiaPrima + "]";
	}

}
