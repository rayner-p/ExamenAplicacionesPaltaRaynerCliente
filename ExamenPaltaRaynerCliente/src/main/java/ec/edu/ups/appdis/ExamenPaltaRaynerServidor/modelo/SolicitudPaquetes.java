package ec.edu.ups.appdis.ExamenPaltaRaynerServidor.modelo;

import java.io.Serializable;
import java.util.List;




public class SolicitudPaquetes implements Serializable {
	private static final long serialVersionUID = 1L;

	private int codigo;
	private Remitente remitente;
	
	
	private Destinatario destinatario;
	
	private List<Paquete> listaPaquetes;
	
	private	String lugarRecogerPaquete;
	
	private String lugarEntregaPaquete;
	
	private double precioSolicitud;
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public Remitente getRemitente() {
		return remitente;
	}
	public void setRemitente(Remitente remitente) {
		this.remitente = remitente;
	}
	public Destinatario getDestinatario() {
		return destinatario;
	}
	public void setDestinatario(Destinatario destinatario) {
		this.destinatario = destinatario;
	}
	public List<Paquete> getListaPaquetes() {
		return listaPaquetes;
	}
	public void setListaPaquetes(List<Paquete> listaPaquetes) {
		this.listaPaquetes = listaPaquetes;
	}
	public String getLugarRecogerPaquete() {
		return lugarRecogerPaquete;
	}
	public void setLugarRecogerPaquete(String lugarRecogerPaquete) {
		this.lugarRecogerPaquete = lugarRecogerPaquete;
	}
	public String getLugarEntregaPaquete() {
		return lugarEntregaPaquete;
	}
	public void setLugarEntregaPaquete(String lugarEntregaPaquete) {
		this.lugarEntregaPaquete = lugarEntregaPaquete;
	}
	public double getPrecioSolicitud() {
		return precioSolicitud;
	}
	public void setPrecioSolicitud(double precioSolicitud) {
		this.precioSolicitud = precioSolicitud;
	}
	@Override
	public String toString() {
		return "SolicitudPaquetes [codigo=" + codigo + ", remitente=" + remitente + ", destinatario=" + destinatario
				+ ", listaPaquetes=" + listaPaquetes + ", lugarRecogerPaquete=" + lugarRecogerPaquete
				+ ", lugarEntregaPaquete=" + lugarEntregaPaquete + ", precioSolicitud=" + precioSolicitud + "]";
	}
	
	
}
