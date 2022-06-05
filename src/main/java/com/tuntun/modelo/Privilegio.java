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
@Table(name = "privilegios")
public class Privilegio {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idPrivilegio;
	@Column(name = "nomPrivilegio", length = 50)
	private String nomPrivilegio;
	@Column(name = "descripcion")
	private String descripcion;
	@ManyToOne
	@JoinColumn(name = "idRolFk")
	private Rol rol;

	public int getIdPrivilegio() {
		return idPrivilegio;
	}

	public void setIdPrivilegio(int idPrivilegio) {
		this.idPrivilegio = idPrivilegio;
	}

	public String getNomPrivilegio() {
		return nomPrivilegio;
	}

	public void setNomPrivilegio(String nomPrivilegio) {
		this.nomPrivilegio = nomPrivilegio;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Rol getRol() {
		return rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}

	@Override
	public String toString() {
		return "Privilegio [idPrivilegio=" + idPrivilegio + ", nomPrivilegio=" + nomPrivilegio + ", descripcion="
				+ descripcion + ", rol=" + rol + "]";
	}

}
