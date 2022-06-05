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
@Table(name = "tipodocumentos")
public class TipoDocumento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idTipoDocumento;
	@Column(name = "nombreTipoDocumento", length = 50)
	private String nombreTipoDocumento;
	@Column(name = "abreviaturaTipoDocumento", length = 5)
	private String abreviaturaTipoDocumento;
	@OneToMany(targetEntity = Usuario.class, mappedBy = "tipoDocumento")
	private List<Usuario> idUsuarioFk;

	public int getIdTipoDocumento() {
		return idTipoDocumento;
	}

	public void setIdTipoDocumento(int idTipoDocumento) {
		this.idTipoDocumento = idTipoDocumento;
	}

	public String getNombreTipoDocumento() {
		return nombreTipoDocumento;
	}

	public void setNombreTipoDocumento(String nombreTipoDocumento) {
		this.nombreTipoDocumento = nombreTipoDocumento;
	}

	public String getAbreviaturaTipoDocumento() {
		return abreviaturaTipoDocumento;
	}

	public void setAbreviaturaTipoDocumento(String abreviaturaTipoDocumento) {
		this.abreviaturaTipoDocumento = abreviaturaTipoDocumento;
	}

	public List<Usuario> getIdUsuarioFk() {
		return idUsuarioFk;
	}

	public void setIdUsuarioFk(List<Usuario> idUsuarioFk) {
		this.idUsuarioFk = idUsuarioFk;
	}

	@Override
	public String toString() {
		return "TipoDocumento [idTipoDocumento=" + idTipoDocumento + ", nombreTipoDocumento=" + nombreTipoDocumento
				+ ", abreviaturaTipoDocumento=" + abreviaturaTipoDocumento + ", idUsuarioFk=" + idUsuarioFk + "]";
	}

}
