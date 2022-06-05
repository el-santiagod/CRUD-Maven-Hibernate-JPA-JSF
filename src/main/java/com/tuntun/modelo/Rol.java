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
@Table(name = "roles")
public class Rol {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idRol;
	@Column(name = "nombreRol", length = 50)
	private String nombreRol;
	@Column(name = "descRol")
	private String descRol;
	@OneToMany(targetEntity = Privilegio.class, mappedBy = "rol")
	private List<Privilegio> idPrivilegioFk;
	@OneToMany(targetEntity = Usuario.class, mappedBy = "rol")
	private List<Usuario> idUsuarioFk;

	public int getIdRol() {
		return idRol;
	}

	public void setIdRol(int idRol) {
		this.idRol = idRol;
	}

	public String getNombreRol() {
		return nombreRol;
	}

	public void setNombreRol(String nombreRol) {
		this.nombreRol = nombreRol;
	}

	public String getDescRol() {
		return descRol;
	}

	public void setDescRol(String descRol) {
		this.descRol = descRol;
	}

	public List<Privilegio> getIdPrivilegioFk() {
		return idPrivilegioFk;
	}

	public void setIdPrivilegioFk(List<Privilegio> idPrivilegioFk) {
		this.idPrivilegioFk = idPrivilegioFk;
	}

	public List<Usuario> getIdUsuarioFk() {
		return idUsuarioFk;
	}

	public void setIdUsuarioFk(List<Usuario> idUsuarioFk) {
		this.idUsuarioFk = idUsuarioFk;
	}

	@Override
	public String toString() {
		return "Rol [idRol=" + idRol + ", nombreRol=" + nombreRol + ", descRol=" + descRol + ", idPrivilegioFk="
				+ idPrivilegioFk + ", idUsuarioFk=" + idUsuarioFk + "]";
	}

}
