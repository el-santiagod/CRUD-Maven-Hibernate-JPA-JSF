package com.tuntun.modelo;

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

@Entity
@Table(name = "productos")
public class Producto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idProducto;
	@Column(name = "nombreProducto", length = 50)
	private String nombreProducto;
	@Column(name = "precioProducto")
	private int precioProducto;
	@Column(name = "cantidadProducto")
	private int cantidadProducto;
	@Column(name = "marcaProducto", length = 50)
	private String marcaProducto;
	@Column(name = "descripcionProducto")
	private String descripcionProducto;
	@ManyToOne
	@JoinColumn(name = "idUsuarioFk")
	private Usuario usuario;
	@ManyToOne
	@JoinColumn(name = "idProveedorEmpresaFk")
	private ProveedorEmpresa proveedorEmpresa;
	@ManyToOne
	@JoinColumn(name = "idReferenciaProductoFk")
	private ReferenciaProducto referenciaProducto;
	@ManyToOne
	@JoinColumn(name = "idProveedorFk")
	private ProveedorMateriaPrima proveedorMateriaPrima;
	@OneToMany(targetEntity = Almacen.class, mappedBy = "producto")
	private List<Almacen> idAlmacenFk;
	@OneToMany(targetEntity = CarritoCompra.class, mappedBy = "producto")
	private List<CarritoCompra> idCarritoFk;
	@OneToMany(targetEntity = DetallePedidoProducto.class, mappedBy = "producto")
	private List<DetallePedidoProducto> idDetalleFk;

	public int getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public int getPrecioProducto() {
		return precioProducto;
	}

	public void setPrecioProducto(int precioProducto) {
		this.precioProducto = precioProducto;
	}

	public int getCantidadProducto() {
		return cantidadProducto;
	}

	public void setCantidadProducto(int cantidadProducto) {
		this.cantidadProducto = cantidadProducto;
	}

	public String getMarcaProducto() {
		return marcaProducto;
	}

	public void setMarcaProducto(String marcaProducto) {
		this.marcaProducto = marcaProducto;
	}

	public String getDescripcionProducto() {
		return descripcionProducto;
	}

	public void setDescripcionProducto(String descripcionProducto) {
		this.descripcionProducto = descripcionProducto;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public ProveedorEmpresa getProveedorEmpresa() {
		return proveedorEmpresa;
	}

	public void setProveedorEmpresa(ProveedorEmpresa proveedorEmpresa) {
		this.proveedorEmpresa = proveedorEmpresa;
	}

	public ReferenciaProducto getReferenciaProducto() {
		return referenciaProducto;
	}

	public void setReferenciaProducto(ReferenciaProducto referenciaProducto) {
		this.referenciaProducto = referenciaProducto;
	}

	public ProveedorMateriaPrima getProveedorMateriaPrima() {
		return proveedorMateriaPrima;
	}

	public void setProveedorMateriaPrima(ProveedorMateriaPrima proveedorMateriaPrima) {
		this.proveedorMateriaPrima = proveedorMateriaPrima;
	}

	public List<Almacen> getIdAlmacenFk() {
		return idAlmacenFk;
	}

	public void setIdAlmacenFk(List<Almacen> idAlmacenFk) {
		this.idAlmacenFk = idAlmacenFk;
	}

	public List<CarritoCompra> getIdCarritoFk() {
		return idCarritoFk;
	}

	public void setIdCarritoFk(List<CarritoCompra> idCarritoFk) {
		this.idCarritoFk = idCarritoFk;
	}

	public List<DetallePedidoProducto> getIdDetalleFk() {
		return idDetalleFk;
	}

	public void setIdDetalleFk(List<DetallePedidoProducto> idDetalleFk) {
		this.idDetalleFk = idDetalleFk;
	}

	@Override
	public String toString() {
		return "Producto [idProducto=" + idProducto + ", nombreProducto=" + nombreProducto + ", precioProducto="
				+ precioProducto + ", cantidadProducto=" + cantidadProducto + ", marcaProducto=" + marcaProducto
				+ ", descripcionProducto=" + descripcionProducto + ", usuario=" + usuario + ", proveedorEmpresa="
				+ proveedorEmpresa + ", referenciaProducto=" + referenciaProducto + ", proveedorMateriaPrima="
				+ proveedorMateriaPrima + ", idAlmacenFk=" + idAlmacenFk + ", idCarritoFk=" + idCarritoFk
				+ ", idDetalleFk=" + idDetalleFk + "]";
	}

}
