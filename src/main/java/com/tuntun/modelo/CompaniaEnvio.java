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
@Table(name = "companiaenvios")
public class CompaniaEnvio {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idCompaniaEnvios;
	@Column(name = "nombreCompaniaEnvios", length = 45)
	private String nombreCompaniaEnvios;
	@Column(name = "telefonoCompaniaEnvios")
	private int telefonoCompaniaEnvios;
	@OneToMany(targetEntity = Envio.class, mappedBy = "companiaEnvio")
	private List<Envio> idEnvioFk;

	public int getIdCompaniaEnvios() {
		return idCompaniaEnvios;
	}

	public void setIdCompaniaEnvios(int idCompaniaEnvios) {
		this.idCompaniaEnvios = idCompaniaEnvios;
	}

	public String getNombreCompaniaEnvios() {
		return nombreCompaniaEnvios;
	}

	public void setNombreCompaniaEnvios(String nombreCompaniaEnvios) {
		this.nombreCompaniaEnvios = nombreCompaniaEnvios;
	}

	public int getTelefonoCompaniaEnvios() {
		return telefonoCompaniaEnvios;
	}

	public void setTelefonoCompaniaEnvios(int telefonoCompaniaEnvios) {
		this.telefonoCompaniaEnvios = telefonoCompaniaEnvios;
	}

	public List<Envio> getIdEnvioFk() {
		return idEnvioFk;
	}

	public void setIdEnvioFk(List<Envio> idEnvioFk) {
		this.idEnvioFk = idEnvioFk;
	}

	@Override
	public String toString() {
		return "CompaniaEnvio [idCompaniaEnvios=" + idCompaniaEnvios + ", nombreCompaniaEnvios=" + nombreCompaniaEnvios
				+ ", telefonoCompaniaEnvios=" + telefonoCompaniaEnvios + ", idEnvioFk=" + idEnvioFk + "]";
	}

}
