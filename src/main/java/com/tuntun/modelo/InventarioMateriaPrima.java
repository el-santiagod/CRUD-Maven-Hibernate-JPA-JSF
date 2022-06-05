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
@Table(name = "inventariomateriasprimas")
public class InventarioMateriaPrima {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idInventarioMateriaPrima;
	@Column(name = "saldoInventarioMateriaPrima")
	private int saldoInventarioMateriaPrima;
	@ManyToOne
	@JoinColumn(name = "idMateriaPrimaFk")
	private MateriaPrima materiaPrima;
	@OneToMany(targetEntity = OrdenProduccion.class, mappedBy = "invMateriaPrima")
	private List<OrdenProduccion> idOrdenFk;

	public int getIdInventarioMateriaPrima() {
		return idInventarioMateriaPrima;
	}

	public void setIdInventarioMateriaPrima(int idInventarioMateriaPrima) {
		this.idInventarioMateriaPrima = idInventarioMateriaPrima;
	}

	public int getSaldoInventarioMateriaPrima() {
		return saldoInventarioMateriaPrima;
	}

	public void setSaldoInventarioMateriaPrima(int saldoInventarioMateriaPrima) {
		this.saldoInventarioMateriaPrima = saldoInventarioMateriaPrima;
	}

	public MateriaPrima getMateriaPrima() {
		return materiaPrima;
	}

	public void setMateriaPrima(MateriaPrima materiaPrima) {
		this.materiaPrima = materiaPrima;
	}

	public List<OrdenProduccion> getIdOrdenFk() {
		return idOrdenFk;
	}

	public void setIdOrdenFk(List<OrdenProduccion> idOrdenFk) {
		this.idOrdenFk = idOrdenFk;
	}

	@Override
	public String toString() {
		return "InventarioMateriaPrima [idInventarioMateriaPrima=" + idInventarioMateriaPrima
				+ ", saldoInventarioMateriaPrima=" + saldoInventarioMateriaPrima + ", materiaPrima=" + materiaPrima
				+ ", idOrdenFk=" + idOrdenFk + "]";
	}

}
