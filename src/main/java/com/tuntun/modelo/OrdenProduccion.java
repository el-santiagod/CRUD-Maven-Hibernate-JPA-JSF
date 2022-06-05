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
@Table(name = "ordenproducciones")
public class OrdenProduccion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idOrdenProduccion;
	@Column(name = "fechaOrdenProduccion")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaOrdenProduccion;
	@Column(name = "cantidadOrdenProduccion")
	private int cantidadOrdenProduccion;
	@Column(name = "observacionOrdenProduccion")
	private String observacionOrdenProduccion;
	@ManyToOne
	@JoinColumn(name = "idInventarioMateriaPrimaFk")
	private InventarioMateriaPrima invMateriaPrima;
	@OneToMany(targetEntity = DetalleOrdenProduccion.class, mappedBy = "ordenProduccion")
	private List<DetalleOrdenProduccion> idDetalllePFk;

	public int getIdOrdenProduccion() {
		return idOrdenProduccion;
	}

	public void setIdOrdenProduccion(int idOrdenProduccion) {
		this.idOrdenProduccion = idOrdenProduccion;
	}

	public Date getFechaOrdenProduccion() {
		return fechaOrdenProduccion;
	}

	public void setFechaOrdenProduccion(Date fechaOrdenProduccion) {
		this.fechaOrdenProduccion = fechaOrdenProduccion;
	}

	public int getCantidadOrdenProduccion() {
		return cantidadOrdenProduccion;
	}

	public void setCantidadOrdenProduccion(int cantidadOrdenProduccion) {
		this.cantidadOrdenProduccion = cantidadOrdenProduccion;
	}

	public String getObservacionOrdenProduccion() {
		return observacionOrdenProduccion;
	}

	public void setObservacionOrdenProduccion(String observacionOrdenProduccion) {
		this.observacionOrdenProduccion = observacionOrdenProduccion;
	}

	public InventarioMateriaPrima getInvMateriaPrima() {
		return invMateriaPrima;
	}

	public void setInvMateriaPrima(InventarioMateriaPrima invMateriaPrima) {
		this.invMateriaPrima = invMateriaPrima;
	}

	public List<DetalleOrdenProduccion> getIdDetalllePFk() {
		return idDetalllePFk;
	}

	public void setIdDetalllePFk(List<DetalleOrdenProduccion> idDetalllePFk) {
		this.idDetalllePFk = idDetalllePFk;
	}

	@Override
	public String toString() {
		return "OrdenProduccion [idOrdenProduccion=" + idOrdenProduccion + ", fechaOrdenProduccion="
				+ fechaOrdenProduccion + ", cantidadOrdenProduccion=" + cantidadOrdenProduccion
				+ ", observacionOrdenProduccion=" + observacionOrdenProduccion + ", invMateriaPrima=" + invMateriaPrima
				+ ", idDetalllePFk=" + idDetalllePFk + "]";
	}

}
