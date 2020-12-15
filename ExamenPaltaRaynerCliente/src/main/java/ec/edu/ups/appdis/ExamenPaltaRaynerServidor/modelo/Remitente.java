package ec.edu.ups.appdis.ExamenPaltaRaynerServidor.modelo;

import java.io.Serializable;
import java.util.List;


public class Remitente implements Serializable{
	private static final long serialVersionUID = 1L;

	private String cedula;
	
	private String nombre;
	
	private String apellido;
	
	private String direccion;
	
	private String correo;
	
	private String celular;
	
	private List<SolicitudPaquetes> solicitud;
	
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public List<SolicitudPaquetes> getSolicitud() {
		return solicitud;
	}
	public void setSolicitud(List<SolicitudPaquetes> solicitud) {
		this.solicitud = solicitud;
	}
	@Override
	public String toString() {
		return "Remitente [cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + ", direccion="
				+ direccion + ", correo=" + correo + ", celular=" + celular + ", solicitud=" + solicitud + "]";
	}
	
}
