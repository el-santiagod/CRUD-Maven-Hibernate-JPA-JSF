package com.tuntun.modelo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "respuestaspqrs")
public class RespuestaPqr {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idRespuesta;
	@Column(name = "respuestaPqr")
	private String respuestaPqr;
	@Column(name = "fechaRespuestaPqr")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaRespuestaPqr;
	@Column(name = "estadoPqr")
	private String estadoPqr;
	@Column(name = "nomAdmin")
	private String nomAdmin;
	@ManyToOne
	@JoinColumn(name = "idPqrFk")
	private Pqr pqr;

	public int getIdRespuesta() {
		return idRespuesta;
	}

	public void setIdRespuesta(int idRespuesta) {
		this.idRespuesta = idRespuesta;
	}

	public String getRespuestaPqr() {
		return respuestaPqr;
	}

	public void setRespuestaPqr(String respuestaPqr) {
		this.respuestaPqr = respuestaPqr;
	}

	public Date getFechaRespuestaPqr() {
		return fechaRespuestaPqr;
	}

	public void setFechaRespuestaPqr(Date fechaRespuestaPqr) {
		this.fechaRespuestaPqr = fechaRespuestaPqr;
	}

	public String getEstadoPqr() {
		return estadoPqr;
	}

	public void setEstadoPqr(String estadoPqr) {
		this.estadoPqr = estadoPqr;
	}

	public String getNomAdmin() {
		return nomAdmin;
	}

	public void setNomAdmin(String nomAdmin) {
		this.nomAdmin = nomAdmin;
	}

	public Pqr getPqr() {
		return pqr;
	}

	public void setPqr(Pqr pqr) {
		this.pqr = pqr;
	}

	@Override
	public String toString() {
		return "RespuestaPqr [idRespuesta=" + idRespuesta + ", respuestaPqr=" + respuestaPqr + ", fechaRespuestaPqr="
				+ fechaRespuestaPqr + ", estadoPqr=" + estadoPqr + ", nomAdmin=" + nomAdmin + ", pqr=" + pqr + "]";
	}

}
