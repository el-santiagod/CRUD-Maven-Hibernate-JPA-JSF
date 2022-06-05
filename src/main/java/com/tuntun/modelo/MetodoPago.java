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
@Table(name = "metodospago")
public class MetodoPago {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idMetodoPago;
	@Column(name = "nombreMetodoPago", length = 50)
	private String nombreMetodoPago;
	@Column(name = "tipoMetodoPago", length = 50)
	private String tipoMetodoPago;
	@OneToMany(targetEntity = CarritoCompra.class, mappedBy = "metodoPago")
	private List<CarritoCompra> idCarritoFk;
	@OneToMany(targetEntity = Factura.class, mappedBy = "metodoPago")
	private List<Factura> idFacturaFk;

	public int getIdMetodoPago() {
		return idMetodoPago;
	}

	public void setIdMetodoPago(int idMetodoPago) {
		this.idMetodoPago = idMetodoPago;
	}

	public String getNombreMetodoPago() {
		return nombreMetodoPago;
	}

	public void setNombreMetodoPago(String nombreMetodoPago) {
		this.nombreMetodoPago = nombreMetodoPago;
	}

	public String getTipoMetodoPago() {
		return tipoMetodoPago;
	}

	public void setTipoMetodoPago(String tipoMetodoPago) {
		this.tipoMetodoPago = tipoMetodoPago;
	}

	public List<CarritoCompra> getIdCarritoFk() {
		return idCarritoFk;
	}

	public void setIdCarritoFk(List<CarritoCompra> idCarritoFk) {
		this.idCarritoFk = idCarritoFk;
	}

	public List<Factura> getIdFacturaFk() {
		return idFacturaFk;
	}

	public void setIdFacturaFk(List<Factura> idFacturaFk) {
		this.idFacturaFk = idFacturaFk;
	}

	@Override
	public String toString() {
		return "MetodoPago [idMetodoPago=" + idMetodoPago + ", nombreMetodoPago=" + nombreMetodoPago
				+ ", tipoMetodoPago=" + tipoMetodoPago + ", idCarritoFk=" + idCarritoFk + ", idFacturaFk=" + idFacturaFk
				+ "]";
	}

}
