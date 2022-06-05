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
@Table(name = "proveedoresempresa")
public class ProveedorEmpresa {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idProveedorEmpresa;
	@Column(name = "nombre", length = 45)
	private String nombre;
	@Column(name = "direccion", length = 45)
	private String direccion;
	@Column(name = "telefonoProveedor")
	private int telefonoProveedor;
	@Column(name = "fechaEnvio")
	private String observaciones;
	@OneToMany(targetEntity = Producto.class, mappedBy = "proveedorEmpresa")
	private List<Producto> idProductoFk;
	@OneToMany(targetEntity = Almacen.class, mappedBy = "proveedorEmpresa")
	private List<Almacen> idAlmacenFk;

	public int getIdProveedorEmpresa() {
		return idProveedorEmpresa;
	}

	public void setIdProveedorEmpresa(int idProveedorEmpresa) {
		this.idProveedorEmpresa = idProveedorEmpresa;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getTelefonoProveedor() {
		return telefonoProveedor;
	}

	public void setTelefonoProveedor(int telefonoProveedor) {
		this.telefonoProveedor = telefonoProveedor;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public List<Producto> getIdProductoFk() {
		return idProductoFk;
	}

	public void setIdProductoFk(List<Producto> idProductoFk) {
		this.idProductoFk = idProductoFk;
	}

	public List<Almacen> getIdAlmacenFk() {
		return idAlmacenFk;
	}

	public void setIdAlmacenFk(List<Almacen> idAlmacenFk) {
		this.idAlmacenFk = idAlmacenFk;
	}

	@Override
	public String toString() {
		return "ProveedorEmpresa [idProveedorEmpresa=" + idProveedorEmpresa + ", nombre=" + nombre + ", direccion="
				+ direccion + ", telefonoProveedor=" + telefonoProveedor + ", observaciones=" + observaciones
				+ ", idProductoFk=" + idProductoFk + ", idAlmacenFk=" + idAlmacenFk + "]";
	}

}
