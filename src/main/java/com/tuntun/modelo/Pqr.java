package com.tuntun.modelo;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "pqrs")
public class Pqr {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idPqr;
	@Column(name = "tituloPqr", length = 20)
	private String tituloPqr;
	@Column(name = "descPqr")
	private String descPqr;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fechaPqr")
	private Date fechaPqr;
	@Column(name = "calificacionPqr")
	private int calificacionPqr;
	@OneToMany(targetEntity = RespuestaPqr.class, mappedBy = "pqr")
	private List<RespuestaPqr> idRespuestaFk;
	@OneToMany(targetEntity = UsuarioPqr.class, mappedBy = "pqr")
	private List<UsuarioPqr> idUsuarioPqr;

	public int getIdPqr() {
		return idPqr;
	}

	public void setIdPqr(int idPqr) {
		this.idPqr = idPqr;
	}

	public String getTituloPqr() {
		return tituloPqr;
	}

	public void setTituloPqr(String tituloPqr) {
		this.tituloPqr = tituloPqr;
	}

	public String getDescPqr() {
		return descPqr;
	}

	public void setDescPqr(String descPqr) {
		this.descPqr = descPqr;
	}

	public Date getFechaPqr() {
		return fechaPqr;
	}

	public void setFechaPqr(Date fechaPqr) {
		this.fechaPqr = fechaPqr;
	}

	public int getCalificacionPqr() {
		return calificacionPqr;
	}

	public void setCalificacionPqr(int calificacionPqr) {
		this.calificacionPqr = calificacionPqr;
	}

	public List<RespuestaPqr> getIdRespuestaFk() {
		return idRespuestaFk;
	}

	public void setIdRespuestaFk(List<RespuestaPqr> idRespuestaFk) {
		this.idRespuestaFk = idRespuestaFk;
	}

	public List<UsuarioPqr> getIdUsuarioPqr() {
		return idUsuarioPqr;
	}

	public void setIdUsuarioPqr(List<UsuarioPqr> idUsuarioPqr) {
		this.idUsuarioPqr = idUsuarioPqr;
	}

	@Override
	public String toString() {
		return "Pqr [idPqr=" + idPqr + ", tituloPqr=" + tituloPqr + ", descPqr=" + descPqr + ", fechaPqr=" + fechaPqr
				+ ", calificacionPqr=" + calificacionPqr + ", idRespuestaFk=" + idRespuestaFk + ", idUsuarioPqr="
				+ idUsuarioPqr + "]";
	}

}
