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
@Table(name = "proveedoresmateriaprima")
public class ProveedorMateriaPrima {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idProveedor;
	@Column(name = "nombreProveedor", length = 30)
	private String nombreProveedor;
	@Column(name = "telefonoProveedor")
	private int telefonoProveedor;
	@Column(name = "direccionProveedor", length = 40)
	private String direccionProveedor;
	@ManyToOne
	@JoinColumn(name = "idMateriaPrimaFk")
	private MateriaPrima materiaPrima;
	@OneToMany(targetEntity = Producto.class, mappedBy = "proveedorMateriaPrima")
	private List<Producto> idProductoFk;

	public int getIdProveedor() {
		return idProveedor;
	}

	public void setIdProveedor(int idProveedor) {
		this.idProveedor = idProveedor;
	}

	public String getNombreProveedor() {
		return nombreProveedor;
	}

	public void setNombreProveedor(String nombreProveedor) {
		this.nombreProveedor = nombreProveedor;
	}

	public int getTelefonoProveedor() {
		return telefonoProveedor;
	}

	public void setTelefonoProveedor(int telefonoProveedor) {
		this.telefonoProveedor = telefonoProveedor;
	}

	public String getDireccionProveedor() {
		return direccionProveedor;
	}

	public void setDireccionProveedor(String direccionProveedor) {
		this.direccionProveedor = direccionProveedor;
	}

	public MateriaPrima getMateriaPrima() {
		return materiaPrima;
	}

	public void setMateriaPrima(MateriaPrima materiaPrima) {
		this.materiaPrima = materiaPrima;
	}

	public List<Producto> getIdProductoFk() {
		return idProductoFk;
	}

	public void setIdProductoFk(List<Producto> idProductoFk) {
		this.idProductoFk = idProductoFk;
	}

	@Override
	public String toString() {
		return "ProveedorMateriaPrima [idProveedor=" + idProveedor + ", nombreProveedor=" + nombreProveedor
				+ ", telefonoProveedor=" + telefonoProveedor + ", direccionProveedor=" + direccionProveedor
				+ ", materiaPrima=" + materiaPrima + ", idProductoFk=" + idProductoFk + "]";
	}

}
