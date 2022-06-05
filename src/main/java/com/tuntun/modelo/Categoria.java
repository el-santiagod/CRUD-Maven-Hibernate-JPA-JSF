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
@Table(name = "categorias")
public class Categoria {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idCategoria;
	@Column(name = "nombreCompaniaEnvios", length = 30)
	private String nombreCategoria;
	@OneToMany(targetEntity = ProductoCategoria.class, mappedBy = "categoria")
	private List<ProductoCategoria> idProductoCategoriaFk;

	public int getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}

	public String getNombreCategoria() {
		return nombreCategoria;
	}

	public void setNombreCategoria(String nombreCategoria) {
		this.nombreCategoria = nombreCategoria;
	}

	public List<ProductoCategoria> getIdProductoCategoriaFk() {
		return idProductoCategoriaFk;
	}

	public void setIdProductoCategoriaFk(List<ProductoCategoria> idProductoCategoriaFk) {
		this.idProductoCategoriaFk = idProductoCategoriaFk;
	}

	@Override
	public String toString() {
		return "Categoria [idCategoria=" + idCategoria + ", nombreCategoria=" + nombreCategoria
				+ ", idProductoCategoriaFk=" + idProductoCategoriaFk + "]";
	}

}
