package com.tuntun.modelo;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "productoscategorias")
public class ProductoCategoria {
	@ManyToOne
	@JoinColumn(name = "idProductoFk")
	private MateriaPrima materiaPrima;
	@ManyToOne
	@JoinColumn(name = "idCategoriaFk")
	private Categoria categoria;

	public MateriaPrima getMateriaPrima() {
		return materiaPrima;
	}

	public void setMateriaPrima(MateriaPrima materiaPrima) {
		this.materiaPrima = materiaPrima;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "ProductoCategoria [materiaPrima=" + materiaPrima + ", categoria=" + categoria + "]";
	}

}
