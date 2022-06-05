package com.tuntun.modelo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "materiasprimas")
public class MateriaPrima {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idMateriaPrima;
	@Column(name = "nombreMateriaPrima", length = 30)
	private String nombreMateriaPrima;
	@Column(name = "cantidadMateriaPrima")
	private int cantidadMateriaPrima;
	@Column(name = "valorMateriaPrima")
	private int valorMateriaPrima;
	@Column(name = "descripcionMateriaPrima")
	private String descripcionMateriaPrima;
	@OneToMany(targetEntity = InventarioMateriaPrima.class, mappedBy = "materiaPrima")
	private List<InventarioMateriaPrima> idInventarioFk;
	@OneToMany(targetEntity = ProveedorMateriaPrima.class, mappedBy = "materiaPrima")
	private List<ProveedorMateriaPrima> idProveedorMPFk;
	@OneToMany(targetEntity = DetalleOrdenProduccion.class, mappedBy = "materiaPrima")
	private List<DetalleOrdenProduccion> idDetalllePFk;
	@OneToMany(targetEntity = ProductoCategoria.class, mappedBy = "materiaPrima")
	private List<ProductoCategoria> idProductoCategoriaFk;

	public int getIdMateriaPrima() {
		return idMateriaPrima;
	}

	public void setIdMateriaPrima(int idMateriaPrima) {
		this.idMateriaPrima = idMateriaPrima;
	}

	public String getNombreMateriaPrima() {
		return nombreMateriaPrima;
	}

	public void setNombreMateriaPrima(String nombreMateriaPrima) {
		this.nombreMateriaPrima = nombreMateriaPrima;
	}

	public int getCantidadMateriaPrima() {
		return cantidadMateriaPrima;
	}

	public void setCantidadMateriaPrima(int cantidadMateriaPrima) {
		this.cantidadMateriaPrima = cantidadMateriaPrima;
	}

	public int getValorMateriaPrima() {
		return valorMateriaPrima;
	}

	public void setValorMateriaPrima(int valorMateriaPrima) {
		this.valorMateriaPrima = valorMateriaPrima;
	}

	public String getDescripcionMateriaPrima() {
		return descripcionMateriaPrima;
	}

	public void setDescripcionMateriaPrima(String descripcionMateriaPrima) {
		this.descripcionMateriaPrima = descripcionMateriaPrima;
	}

	public List<InventarioMateriaPrima> getIdInventarioFk() {
		return idInventarioFk;
	}

	public void setIdInventarioFk(List<InventarioMateriaPrima> idInventarioFk) {
		this.idInventarioFk = idInventarioFk;
	}

	public List<ProveedorMateriaPrima> getIdProveedorMPFk() {
		return idProveedorMPFk;
	}

	public void setIdProveedorMPFk(List<ProveedorMateriaPrima> idProveedorMPFk) {
		this.idProveedorMPFk = idProveedorMPFk;
	}

	public List<DetalleOrdenProduccion> getIdDetalllePFk() {
		return idDetalllePFk;
	}

	public void setIdDetalllePFk(List<DetalleOrdenProduccion> idDetalllePFk) {
		this.idDetalllePFk = idDetalllePFk;
	}

	public List<ProductoCategoria> getIdProductoCategoriaFk() {
		return idProductoCategoriaFk;
	}

	public void setIdProductoCategoriaFk(List<ProductoCategoria> idProductoCategoriaFk) {
		this.idProductoCategoriaFk = idProductoCategoriaFk;
	}

	@Override
	public String toString() {
		return "MateriaPrima [idMateriaPrima=" + idMateriaPrima + ", nombreMateriaPrima=" + nombreMateriaPrima
				+ ", cantidadMateriaPrima=" + cantidadMateriaPrima + ", valorMateriaPrima=" + valorMateriaPrima
				+ ", descripcionMateriaPrima=" + descripcionMateriaPrima + ", idInventarioFk=" + idInventarioFk
				+ ", idProveedorMPFk=" + idProveedorMPFk + ", idDetalllePFk=" + idDetalllePFk
				+ ", idProductoCategoriaFk=" + idProductoCategoriaFk + "]";
	}

}
