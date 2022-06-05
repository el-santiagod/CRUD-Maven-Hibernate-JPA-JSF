package com.tuntun.modelo;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "usuarios")
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idUsuario;
	@Column(name = "nombreUsuario", length = 50)
	private String nombreUsuario;
	@Column(name = "apellidoUsuario", length = 50)
	private String apellidoUsuario;
	@Column(name = "contraseñaUsuario", length = 70)
	private String contraseñaUsuario;
	@Column(name = "telefonoUsuario")
	private int telefonoUsuario;
	@Column(name = "direccionUsuario", length = 100)
	private String direccionUsuario;
	@Column(name = "correoUsuario", length = 50)
	private String correoUsuario;
	@Column(name = "identificacionUsuario")
	private int identificacionUsuario;
	@Column(name = "nacimientoUsuario")
	@Temporal(TemporalType.TIMESTAMP)
	private Date nacimientoUsuario;
	@ManyToOne
	@JoinColumn(name = "idTipoDocumentoFk")
	private TipoDocumento tipoDocumento;
	@ManyToOne
	@JoinColumn(name = "idRolFk")
	private Rol rol;
	@ManyToOne
	@JoinColumn(name = "idCarritoFk")
	private CarritoCompra carritoCompra;

	@OneToMany(targetEntity = Producto.class, mappedBy = "usuario")
	private List<Producto> idProductoFk;
	@OneToMany(targetEntity = Envio.class, mappedBy = "usuario")
	private List<Envio> idEnvioFk;
	@OneToMany(targetEntity = UsuarioPqr.class, mappedBy = "usuario")
	private List<Usuario> idUsuarioPqrFk;

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getApellidoUsuario() {
		return apellidoUsuario;
	}

	public void setApellidoUsuario(String apellidoUsuario) {
		this.apellidoUsuario = apellidoUsuario;
	}

	public String getContraseñaUsuario() {
		return contraseñaUsuario;
	}

	public void setContraseñaUsuario(String contraseñaUsuario) {
		this.contraseñaUsuario = contraseñaUsuario;
	}

	public int getTelefonoUsuario() {
		return telefonoUsuario;
	}

	public void setTelefonoUsuario(int telefonoUsuario) {
		this.telefonoUsuario = telefonoUsuario;
	}

	public String getDireccionUsuario() {
		return direccionUsuario;
	}

	public void setDireccionUsuario(String direccionUsuario) {
		this.direccionUsuario = direccionUsuario;
	}

	public String getCorreoUsuario() {
		return correoUsuario;
	}

	public void setCorreoUsuario(String correoUsuario) {
		this.correoUsuario = correoUsuario;
	}

	public int getIdentificacionUsuario() {
		return identificacionUsuario;
	}

	public void setIdentificacionUsuario(int identificacionUsuario) {
		this.identificacionUsuario = identificacionUsuario;
	}

	public Date getNacimientoUsuario() {
		return nacimientoUsuario;
	}

	public void setNacimientoUsuario(Date nacimientoUsuario) {
		this.nacimientoUsuario = nacimientoUsuario;
	}

	public TipoDocumento getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(TipoDocumento tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public Rol getRol() {
		return rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}

	public CarritoCompra getCarritoCompra() {
		return carritoCompra;
	}

	public void setCarritoCompra(CarritoCompra carritoCompra) {
		this.carritoCompra = carritoCompra;
	}

	public List<Producto> getIdProductoFk() {
		return idProductoFk;
	}

	public void setIdProductoFk(List<Producto> idProductoFk) {
		this.idProductoFk = idProductoFk;
	}

	public List<Envio> getIdEnvioFk() {
		return idEnvioFk;
	}

	public void setIdEnvioFk(List<Envio> idEnvioFk) {
		this.idEnvioFk = idEnvioFk;
	}

	public List<Usuario> getIdUsuarioPqrFk() {
		return idUsuarioPqrFk;
	}

	public void setIdUsuarioPqrFk(List<Usuario> idUsuarioPqrFk) {
		this.idUsuarioPqrFk = idUsuarioPqrFk;
	}

	@Override
	public String toString() {
		return "Usuario [idUsuario=" + idUsuario + ", nombreUsuario=" + nombreUsuario + ", apellidoUsuario="
				+ apellidoUsuario + ", contraseñaUsuario=" + contraseñaUsuario + ", telefonoUsuario=" + telefonoUsuario
				+ ", direccionUsuario=" + direccionUsuario + ", correoUsuario=" + correoUsuario
				+ ", identificacionUsuario=" + identificacionUsuario + ", nacimientoUsuario=" + nacimientoUsuario
				+ ", tipoDocumento=" + tipoDocumento + ", rol=" + rol + ", carritoCompra=" + carritoCompra
				+ ", idProductoFk=" + idProductoFk + ", idEnvioFk=" + idEnvioFk + ", idUsuarioPqrFk=" + idUsuarioPqrFk
				+ "]";
	}

}
