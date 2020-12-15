package ec.edu.ups.appdis.ExamenPaltaRaynerServidor.modelo;

import java.io.Serializable;

public class Paquete  implements Serializable{
	private static final long serialVersionUID = 1L;


	private int codigo;
	
	private String nombre;
	
	private String descripcion;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	@Override
	public String toString() {
		return "Paquete [codigo=" + codigo + ", nombre=" + nombre + ", descripcion=" + descripcion + "]";
	}
	
}
