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
@Table(name = "almacenes")
public class Almacen {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idStock;
	@Column(name = "cantidadStock")
	private int cantidadStock;
	@ManyToOne
	@JoinColumn(name = "idProductoFk")
	private Producto producto;
	@ManyToOne
	@JoinColumn(name = "idProveedorEmpresaFk")
	private ProveedorEmpresa proveedorEmpresa;

	public int getIdStock() {
		return idStock;
	}

	public void setIdStock(int idStock) {
		this.idStock = idStock;
	}

	public int getCantidadStock() {
		return cantidadStock;
	}

	public void setCantidadStock(int cantidadStock) {
		this.cantidadStock = cantidadStock;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public ProveedorEmpresa getProveedorEmpresa() {
		return proveedorEmpresa;
	}

	public void setProveedorEmpresa(ProveedorEmpresa proveedorEmpresa) {
		this.proveedorEmpresa = proveedorEmpresa;
	}

	@Override
	public String toString() {
		return "Almacen [idStock=" + idStock + ", cantidadStock=" + cantidadStock + ", producto=" + producto
				+ ", proveedorEmpresa=" + proveedorEmpresa + "]";
	}

}
