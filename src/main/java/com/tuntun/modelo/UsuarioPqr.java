package com.tuntun.modelo;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "usuariospqrs")
public class UsuarioPqr {
	@JoinColumn(name = "idUsuarioFk")
	private Usuario usuario;
	@JoinColumn(name = "idPqrFk")
	private Pqr pqr;

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Pqr getPqr() {
		return pqr;
	}

	public void setPqr(Pqr pqr) {
		this.pqr = pqr;
	}

	@Override
	public String toString() {
		return "UsuarioPqr [usuario=" + usuario + ", pqr=" + pqr + "]";
	}

}
