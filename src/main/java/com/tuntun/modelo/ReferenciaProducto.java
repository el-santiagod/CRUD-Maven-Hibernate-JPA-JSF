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
@Table(name = "referenciaproductos")
public class ReferenciaProducto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idReferenciaProducto;
	@Column(name = "tallaReferenciaProducto")
	private int tallaReferenciaProducto;
	@Column(name = "colorReferenciaProducto", length = 30)
	private String colorReferenciaProducto;
	@OneToMany(targetEntity = Producto.class, mappedBy = "referenciaProducto")
	private List<Producto> idProductoFk;

	public int getIdReferenciaProducto() {
		return idReferenciaProducto;
	}

	public void setIdReferenciaProducto(int idReferenciaProducto) {
		this.idReferenciaProducto = idReferenciaProducto;
	}

	public int getTallaReferenciaProducto() {
		return tallaReferenciaProducto;
	}

	public void setTallaReferenciaProducto(int tallaReferenciaProducto) {
		this.tallaReferenciaProducto = tallaReferenciaProducto;
	}

	public String getColorReferenciaProducto() {
		return colorReferenciaProducto;
	}

	public void setColorReferenciaProducto(String colorReferenciaProducto) {
		this.colorReferenciaProducto = colorReferenciaProducto;
	}

	public List<Producto> getIdProductoFk() {
		return idProductoFk;
	}

	public void setIdProductoFk(List<Producto> idProductoFk) {
		this.idProductoFk = idProductoFk;
	}

	@Override
	public String toString() {
		return "ReferenciaProducto [idReferenciaProducto=" + idReferenciaProducto + ", tallaReferenciaProducto="
				+ tallaReferenciaProducto + ", colorReferenciaProducto=" + colorReferenciaProducto + ", idProductoFk="
				+ idProductoFk + "]";
	}

}
